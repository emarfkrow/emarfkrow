/**
 *
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

	toJson: function($form) {

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
			let gridData = grid.getData();
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
			let gridData = grid.getData();
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
					$input.val([v]);
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

		let $inputs = $form.find(':input');
		$inputs.removeClass('error').prop('title', '').removeAttr('readonly').removeAttr('tabindex');
		let $label = $inputs.parent('label');
		$label.removeClass('error').prop('title', '');

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
