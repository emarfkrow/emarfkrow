/**
 * json/form制御
 *
 * @author toshiyuki
 */

let Jsonate = {

	/**
	 * 入力項目のセレクタ
	 */
	inputSelector: 'input[type!=button][type!=checkbox][type!=radio][type!=reset][type!=submit]:enabled, '
		+ 'input[type=checkbox]:checked:enabled, '
		+ 'input[type=radio]:checked:enabled, '
		+ 'select:enabled, '
		+ 'textarea:enabled',

	toJson: function($form, isSelectRow) {

		let formJson = {};

		// フォーム内容
		$form.find(Jsonate.inputSelector).each(function() {
			let $input = $(this);
			let k = $input.prop('name');
			let v = $input.val();
			if (formJson[k]) {
				if (!Array.isArray(formJson[k])) {
					formJson[k] = [formJson[k]];
				}
				formJson[k].push(v);
			} else {
				formJson[k] = v;
			}
		});

		// グリッド内容
		$form.find('[id$=Grid]').each(function() {
			let gridId = this.id;
			let grid = Gridate.grids[gridId];
			let gridData = grid.getData().getItems();

			// 行選択指定の場合は、選択している行のみ
			if (isSelectRow) {
				let tempData = [];
				if (grid.getSelectedRows().length > 0) {
					for (let i in grid.getSelectedRows()) {
						let r = grid.getSelectedRows()[i];
						tempData.push(gridData[r]);
					}
				}
				gridData = tempData;
			}

			let tempData = [];
			for (let r in gridData) {
				if (!grid.orgData || !grid.orgData[r]) {
					tempData.push(gridData[r]);
				} else if (JSON.stringify(gridData[r]) != JSON.stringify(grid.orgData[r])) {
					tempData.push(gridData[r]);
				}
			}
			gridData = tempData;

			let gridIds = gridId.split('.');
			let gridName = gridIds[gridIds.length - 1];
			formJson[gridName] = gridData;
		});

		return formJson;
	},

	toValueJson: function($form) {

		let formJson = {};

		// フォーム内容
		$form.find(Jsonate.inputSelector).each(function() {
			let $input = $(this);
			let k = $input.prop('name');
			let v = $input.val();
			if (v != '') {
				if (formJson[k]) {
					if (!Array.isArray(formJson[k])) {
						formJson[k] = [formJson[k]];
					}
					formJson[k].push(v);
				} else {
					formJson[k] = v;
				}
			}
		});

		// グリッド内容
		$form.find('[id$=Grid]').each(function() {
			let gridId = this.id;
			let grid = Gridate.grids[gridId];
			let gridData = grid.getData().getItems();
			if (gridData.length > 0) {
				let gridIds = gridId.split('.');
				let gridName = gridIds[gridIds.length - 1];
				formJson[gridName] = gridData;
			}
		});

		return formJson;
	},

	toForm: function(data, $form) {

		for (let entityName in data) {
			let json = data[entityName];

			// 配列要素があれば再帰（gridを想定）
			for (let v in json) {
				if (json[v] != null && typeof (json[v]) == 'object' && !Array.isArray(json[v])) {
					let nestData = {};
					nestData[v] = json[v];
					Jsonate.toForm(nestData, $form);
				}
			}

			// 入力項目でループ
			$form.find(Jsonate.inputSelector + ', input[type=checkbox]:enabled, input[type=radio]:enabled').each(function() {
				let $input = $(this);

				// 入力項目のnameで値を取得してみる
				let k = $input.prop('name');
				let v = json[k];

				// entityNameなしでも取得してみる
				if (!v) {
					v = json[k.replace(entityName + '.', '')];
				}

				// upperでも取得してみる
				if (!v) {
					v = json[Casing.toUpper(k.replace(entityName + '.', ''))];
				}

				// 値があれば反映
				if (v) {

					// もしファイルタグならリンクに変換
					if ($input.attr('type') == 'file') {

						// ファイルタグを非表示
						$input.prop('disabled', true).hide();

						// ダウンロードリンクを表示
						let $link = $('a[id="' + this.id + '"]');
						$link.show();

						// ダウンロードリンクのhrefを設定
						let $form = $input.closest('form');
						let entityName = $form.prop('name').replace(/(Search|Regist)Form/, '');

						let inputName = $input.prop('name');
						let inputNames = inputName.split('.');
						let params = '?name=' + inputNames[inputNames.length - 1];

						let $primaryKeys = $form.find('input.primaryKey');
						for (let i = 0; i < $primaryKeys.length; i++) {
							let $primaryKey = $($primaryKeys[i]);
							let name = $primaryKey.prop('name');
							let names = name.split('.');
							let val = $primaryKey.val();
							params += '&' + names[names.length - 1] + '=' + val;
						}
						$link.prop('href', entityName + 'Download.link' + params);

						// ファイルパスのhiddenタグを活性
						$('input[type="hidden"][id="' + this.id + '"]').prop("disabled", false).val([v]);

					} else {
						$input.val([v]);
					}
				}
			});

			// 表示項目でループ
			$form.find('span[id]').each(function() {
				let $span = $(this);

				// 入力項目のidで値を取得してみる
				let k = $span.prop('id');
				let v = json[k];

				// entityNameなしでも取得してみる
				if (!v) {
					v = json[k.replace(entityName + '.', '')];
				}

				// upperでも取得してみる
				if (!v) {
					v = json[Casing.toUpper(k.replace(entityName + '.', ''))];
				}

				// 値があれば反映
				if (v) {
					$span.html(v);
				}
			});

			// グリッド内容
			$form.find('[id$=Grid]').each(function() {
				let gridId = this.id;                         // TSosenDialog.TOyaGrid
				let gridIds = gridId.split(".");              // TSosenDialog, TOyaGrid
				let lastId = gridIds[gridIds.length - 1];     // TOyaGrid
				let fieldName = lastId.replace(/Grid$/, 's'); // TOyas
				let childList = json[fieldName];
				if (childList) {
					let gridData = [];
					for (let i in childList) {
						let child = childList[i];
						let gridRow = {};
						for (let fieldName in child) {
							gridRow[Casing.toUpper(fieldName)] = child[fieldName];
						}
						gridData.push(gridRow);
					}
					Gridate.refresh(gridId, gridData);
				}
			});
		}
	},

	clearForm: function($form) {

		// 入力項目のエラースタイル解除
		let $inputs = $form.find(':input');
		$inputs.removeClass('error').prop('title', '').removeAttr('readonly').removeAttr('tabindex');

		// 選択項目のエラースタイル解除
		let $label = $inputs.parent('label');
		$label.removeClass('error').prop('title', '');

		// ファイルタグ再表示・リンク非表示
		let $files = $form.find('[type="file"]');
		$files.each(function() {
			let $file = $(this);
			$file.prop('disabled', false).show();
			$('a[id="' + this.id + '"]').hide();
			$('input[type="hidden"][id="' + this.id + '"]').prop('disabled', true);
		});

		// フォーム内容
		$form.find(Jsonate.inputSelector).each(function() {
			let $input = $(this);
			$input.val(['']);
		});

		// スパン内容
		$form.find('span[id]').each(function() {
			let $span = $(this);
			$span.html('');
		});

		// グリッド内容
		$form.find('[id$=Grid]').each(function() {
			let gridId = this.id;
			Gridate.refresh(gridId, []);
		});
	},

}
