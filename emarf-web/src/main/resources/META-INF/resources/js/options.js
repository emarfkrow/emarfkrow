/**
 * オプションユーティリティ
 * １．対象のフィールドセットかプルダウンに、data-options（データ取得URL）を指定する。
 * ２．パラメータがある場合は、data-optionParams（パラメータ名：パラメータ値（もしくはパラメータ値を保持する項目名））を指定する。
 * ３．コールバック関数を追加し、チェックボックスかラジオボタンかプルダウンを作成する。
 *
 * @author toshiyuki
 */
$(function() {

	console.debug('Options init.');

	$('[data-options]').each(function() {
		Options.get(this);
	});

});

let Options = {

	get: function(options) {

		let listId = $(options).attr('id');

		// データ取得元URL
		let action = $(options).attr('data-options');

		// データ取得時のパラメータ
		let optionParams = $(options).attr('data-optionParams');
		let optionValue = $(options).attr('data-optionValue');
		let optionLabel = $(options).attr('data-optionLabel');

		// 対象項目が配置されているフォーム
		let $form = $(options).closest('form');

		// 指定されたパラメータを取得
		let postJson = {};
		if (optionParams) {
			let paramList = optionParams.split(',');
			for (let i in paramList) {
				let params = paramList[i].split(':');
				let paramName = params[0];
				let valueName = params[1];
				let $valueItem = $form.find('[name=' + valueName + ']');
				if ($valueItem.length > 0) {
					postJson[paramName] = $valueItem.val();
				} else {
					postJson[paramName] = valueName;
				}
			}
		}

		Ajaxize.ajaxPost(action, postJson, function(data) {

			let itemName = listId.replaceAll(/List$/g, '');
			let dataJson = data[action.replaceAll(/\.json/g, '')];

			// 取得データ数によって表示替え
			if (dataJson) {

				let $elements = $('[id="' + listId + '"]');
				$elements.each(function() {

					let $element = $(this);

					let isSearchForm = $element.closest('form').hasClass('search');

					if (dataJson.length == 1) {
						Options.check($element, itemName, dataJson, optionValue, optionLabel);
					} else if (dataJson.length < 10) {
						if (isSearchForm) {
							Options.check($element, itemName, dataJson, optionValue, optionLabel);
						} else {
							if (dataJson.length == 2 && dataJson[0][optionValue] == 0 && dataJson[1][optionValue] == 1) {
								let omitted = JSON.parse(JSON.stringify(dataJson));
								delete omitted[0];
								Options.check($element, itemName, omitted, optionValue, optionLabel);
							} else {
								Options.radio($element, itemName, dataJson, optionValue, optionLabel);
							}
						}
					} else {
						Options.option($element, true, dataJson, optionValue, optionLabel);
					};
				});
			}
		}, false);
	},

	/**
	 * チェックボックスリスト作成
	 * @param listId チェックボックス用フィールドセット名
	 * @param itemName  チェックボックス項目名
	 * @param dataJson   取得データJSON
	 * @param valueName  値用カラム名
	 * @param labelName  ラベル用カラム名
	 */
	check: function($checks, itemName, dataJson, valueName, labelName) {

		$checks.find('div').remove();

		for (let i in dataJson) {
			let listSource = dataJson[i];
			$checks.append('<div><label><input type="checkbox" name="' + itemName + '" value="' + listSource[valueName] + '">' + listSource[labelName] + '</label></div>');
		}
	},

	/**
	 * ラジオボタンリスト作成
	 * @param listId ラジオボタン用フィールドセット名
	 * @param itemName  ラジオボタン項目名
	 * @param dataJson   取得データJSON
	 * @param valueName  値用カラム名
	 * @param labelName  ラベル用カラム名
	 */
	radio: function($radios, itemName, dataJson, valueName, labelName) {

		$radios.find('div').remove();

		for (let i in dataJson) {
			let listSource = dataJson[i];
			$radios.append('<div><label><input type="radio" name="' + itemName + '" value="' + listSource[valueName] + '">' + listSource[labelName] + '</label></div>');
		}
	},

	/**
	 * プルダウンリスト作成
	 * @param listId   プルダウン項目名
	 * @param isBlank 先頭ブランクフラグ
	 * @param dataJson     取得データJSON
	 * @param valueName    値用カラム名
	 * @param labelName    ラベル用カラム名
	 */
	option: function($element, isBlank, dataJson, valueName, labelName) {

		// generatorでfieldset出力されている場合の対応
		if ($element[0].tagName == 'FIELDSET') {
			let $legend = $element.find('legend');
			let label = '<label>' + $legend.html() + '</label>';
			let tag = $element.prop('outerHTML').replace(/fieldset/g, 'select');
			let $parent = $element.parent();
			$parent.html(label + tag);
			$element = $parent.find('select[id="' + $element.prop('id') + '"]');
		}

		$element.prop('name', $element.prop('id').replace(/List$/, ''));
		$element.find('option').remove();

		if (isBlank) {
			$element.append('<option></option>');
		}

		for (let i in dataJson) {
			let listSource = dataJson[i];
			$element.append('<option value="' + listSource[valueName] + '">' + listSource[labelName] + '</option>');
		}
	}

};
