/**
 * dialog制御
 *
 * @author toshiyuki
 */

$(function() {

	console.debug('Dialogate init.');

	// 親画面に複数のフォームがある場合に、IDが重複しないよう、ID項目にフォーム名を接頭
	$('[id]').each(function() {
		if (this.tagName == 'INPUT' || this.tagName == 'TEXTAREA') {
			let $me = $(this);
			let $form = $me.closest('form');
			let id = $form.prop('name') + '.' + this.id;
			$me.prop('id', id);
			if ($me.prev().length > 0 && $me.prev()[0].tagName == 'LABEL') {
				$me.prev().prop('for', id);
			}
		}
		if (this.tagName == 'A') {
			let $me = $(this);
			let $form = $me.closest('form');
			let id = $form.prop('name') + '.' + this.id;
			$me.prop('id', id);
		}
	});

	/*
	 * [target=dialog]のリンクから、ダイアログのhtmlを画面に追加
	 */
	$('a[target="dialog"], div[data-href]').each(function() {
		Dialogate.enable(this);
	});

	/*
	 * [target=dialog]のアンカー押下でダイアログ表示
	 */
	$(document).on('click', 'a[target="dialog"]', function(event) {

		// イベントキャンセル
		event.preventDefault();
		event.stopPropagation();
		event.stopImmediatePropagation();

		// リンクを取得
		let $link = $(this);

		// 表示するダイアログを取得
		let href = $link.attr('href');
		let dialogId = href.replace(/(^.+\/|\.html$)/g, '') + 'Dialog';
		let $dialogDiv = $('div[id="' + dialogId + '"]');

		// 参照ダイアログの場合、リンクのIDとダイアログ内の項目のIDを比較し、呼び出し元での接頭辞を評価
		let prefix = '';
		let isRefer = $link.hasClass('refer');
		if (isRefer) {
			let linkId = $link.prop('id');
			let linkIds = linkId.split('.');
			let linkItemName = linkIds[linkIds.length - 1];                            // betsuSanshoId
			$dialogDiv.find('input').each(function() {
				let inputName = this.name;
				let inputNames = inputName.split('.');
				let inputItemName = inputNames[inputNames.length - 1];
				if (linkItemName.match(Casing.toPascal(inputItemName) + '$')) {
					prefix = linkItemName.replace(Casing.toPascal(inputItemName), ''); // betsu
				}
			});
		}

		// 呼び出し元の入力項目を取得
		let $form = $link.closest('form');
		let $sendInputs;
		if (isRefer) {
			// 参照ダイアログなら接頭辞に合致する項目を取得（接頭辞がなければ全てを取得する）
			$sendInputs = $form.find('input[type="text"][name*=".' + prefix + '"]');
		} else {
			// 単票ダイアログなら主キー項目だけを取得
			$sendInputs = $form.find('input.primaryKey');
		}

		// 呼び出し元の入力項目でループしてダイアログ内に反映
		$sendInputs.each(function() {

			let sendItemName = this.name;                                                 // TEntity.betsuSansho1Id
			let sendValue = $(this).val();

			let $dialogItem = $dialogDiv.find('[name="' + sendItemName + '"]');

			// そのままの項目名でヒットする場合（詳細リンク）
			if ($dialogItem.length > 0) {
				$dialogItem.val(sendValue);
				$dialogDiv.find('span[id="' + sendItemName + '"]').html(sendValue);
				return;
			}

			// 以下、参照リンク、検索画面の追加リンク、詳細画面の追加リンク

			// 表示するダイアログ内のフォーム名からモデル名を取得
			let $dialogForm = $dialogDiv.find('form');
			let dialogFormName = $dialogForm.prop('name');                                // MSansho1SearchForm
			let dialogFormEntityName = dialogFormName.replace(/(Search|Regist)Form/, ''); // MSansho1

			// 項目名からフィールド名を取得
			let sendItemNames = sendItemName.split('.');
			let sendFieldName = sendItemNames[sendItemNames.length - 1];                  // betsuSansho1Id

			$dialogDiv.find('input').each(function() {
				let dialogInputName = this.name;                                          // MSansho1.sansho1Id
				let dialogInputNames = dialogInputName.split('.');                        // MSansho1, sansho1Id
				let dialogEntityName = dialogInputNames[0];                               // MSansho1
				let dialogFieldName = dialogInputNames[1];                                // sansho1Id
				if (dialogFormEntityName == dialogEntityName && sendFieldName.match(new RegExp('^' + prefix + dialogFieldName + '$', 'i'))) {
					$dialogItem = $(this);
					$dialogItem.val([sendValue]);
					$dialogDiv.find('span[id="' + dialogInputName + '"]').html(sendValue);
				}
			});
		});

		// 呼び出し元を設定
		$dialogDiv.attr('data-caller', $link.attr('id'));

		// ダイアログを開く
		$dialogDiv.dialog('open');
	});

});

let Dialogate = {

	/*
	 * [target=dialog]のリンクからダイアログのdivを画面に追加
	 */
	enable: function(link, parentId) {

		// リンクを取得
		let $link = $(link);

		// hrefを取得。なければスキップ。
		let href = $link.attr('href');
		if (href == undefined) {
			href = $link.attr('data-href');
		}
		if (href == undefined) {
			return;
		}

		console.debug('Dialogate load [' + href + '].');

		// hrefからdialogIdを取得。作成済みならスキップ。
		let dialogId = href.replace(/(^.+\/|\.html$)/g, '') + 'Dialog';
		if ($('div[id="' + dialogId + '"]').length > 0) {
			return;
		}

		//ローディング開始
		//Loading.fadeIn();

		// ダイアログ用のDIVを追加して取得
		$('body').append($('<div id="' + dialogId + '"></div>'));
		let $dialogDiv = $('div[id="' + dialogId + '"]');

		// 外部htmlファイルをロード
		$.ajax({
			async: false,
			cache: true,
			datatype: 'html',
			url: href,
		}).fail(function(data) {
			console.error(data);
			alert(Messages['error.network']);
		}).done(function(html) {

			var dialogHtml = $.parseHTML(html);

			// 外部htmlファイルをページ内に反映
			var $articleDiv = $('<div>').append(dialogHtml).find('div.article');
			$dialogDiv.html($articleDiv.prop('outerHTML'));

			// ダイアログ内のid項目について、labelとユニークに紐づくようにidを変更
			$dialogDiv.find('[id]').each(function() {
				if (this.tagName == 'INPUT' || this.tagName == 'TEXTAREA') {
					let $me = $(this);
					let $form = $me.closest('form');
					let id = $dialogDiv.prop('id') + '.' + $form.prop('name') + '.' + this.id;
					$me.prop('id', id);
					$me.prev().prop('for', id);
				}
				if (this.tagName == 'A') {
					let $me = $(this);
					let $form = $me.closest('form');
					let id = $dialogDiv.prop('id') + '.' + $form.prop('name') + '.' + this.id;
					$me.prop('id', id);
				}
			});

			// ダイアログを設定
			$dialogDiv.dialog({
				autoOpen: false,
				modal: true,
				title: $link.attr('title'),
				width: 'auto',

				/*
				 * ダイアログオープン
				 */
				open: function(event) {

					// ダイアログdiv
					let $dialogDiv = $(event.target);

					// ダイアログ内のグリッド新規ボタンは、呼び出し元の主キーが揃っていなければ非活性
					$dialogDiv.find('.addChild').button('option', 'disabled', false);
					let isPrimaryKey = true;
					let primaryKeys = $dialogDiv.find('input.primaryKey');
					for (let i = 0; i < primaryKeys.length; i++) {
						isPrimaryKey &= $(primaryKeys[i]).val() != '';
					}
					if (!isPrimaryKey) {
						$dialogDiv.find('.addChild').button('option', 'disabled', true);
					}

					// 詳細画面の主キー項目の参照ボタンは、値が既にあれば非表示
					$dialogDiv.find('[name$="RegistForm"] [target=dialog].refer.primaryKey').each(function() {
						if ($('input[id="' + this.id + '"]').val() != '') {
							$(this).hide();
						} else {
							$(this).show();
						}
					});

					let $searchForm = $dialogDiv.find('[name$="SearchForm"]');
					if ($searchForm.length > 0) {

						// ダイアログ内に検索フォームがあり、呼び出し元イベントで検索項目が設定されている場合は、検索結果を初期表示
						let formJson = Jsonate.toValueJson($searchForm);
						if (JSON.stringify(formJson) != '{}') {
							$searchForm.find('button.search').click();
						}

					} else {

						// ダイアログ内の登録フォームに、呼び出し元イベントで値が設定されている場合は、照会結果を初期表示
						let $registForm = $dialogDiv.find('[name$="RegistForm"]');
						let formJson = Jsonate.toValueJson($registForm);
						if (JSON.stringify(formJson) != '{}') {
							let getAction = $registForm.prop('action').replace('Regist', 'Get').replace(/\.form$/, '.ajax');
							Ajaxize.ajaxPost(getAction, formJson, function(data) {
								Jsonate.toForm(data, $registForm);
								Base.referMei($dialogDiv.find('span.refer'));
							});
						}
					}


					try {
						eval(dialogId + 'Open()');
					} catch (e) {
						console.debug(e.message);
					}
				},

				/*
				 * ダイアログクローズ
				 */
				close: function() {
					// 表示内容をクリア
					Jsonate.clearForm($(this).find('form'));
				},
			});

			// 遅延ロードした外部HTMLにダイアログリンクがあれば、再度、外部HTMLを読み込み
			let linkId = $link.attr('id');
			$(dialogHtml).find('a[target="dialog"]').each(function() {
				Dialogate.enable(this, linkId);
			});

		}).always(function(data) {

			//ローディング終了
			//Loading.fadeOut();
		});
	},

	refresh: function(event) {
		let dialogId = event.srcElement.closest('[id$="Dialog"]').id;
		Dialogate.refreshById(dialogId);
	},

	refreshById: function(dialogId) {

		// ダイアログの主キー情報を退避
		let primaryKeys = {};
		$('[id="' + dialogId + '"]').find('input.primaryKey').each(function() {
			primaryKeys[this.name] = $(this).val();
		});

		// ダイアログを一旦閉じる
		$('[id$="' + dialogId + '"]').dialog('close');

		// ダイアログに主キー情報を復帰して開く
		for (let name in primaryKeys) {
			$('[id$="' + dialogId + '"] [name="' + name + '"]').val(primaryKeys[name]);
		}
		$('[id$="' + dialogId + '"]').dialog('open');

	},

};