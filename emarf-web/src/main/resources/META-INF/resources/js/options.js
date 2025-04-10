/*
Copyright 2022 golorp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
/**
 * オプションユーティリティ
 * １．対象のフィールドセットかプルダウンに、data-options（データ取得URL）を指定する。
 * ２．パラメータがある場合は、data-optionParams（パラメータ名：パラメータ値（もしくはパラメータ値を保持する項目名））を指定する。
 * ３．コールバック関数を追加し、チェックボックスかラジオボタンかプルダウンを作成する。
 *
 * @author golorp
 */
$(function() {

    console.info('Options init.');

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

        let k = action + JSON.stringify(postJson);
        if (!sessionStorage[k]) {
            console.debug('Options get [' + action + '].');
            Ajaxize.sjaxPost(action, postJson, function(data) {
                if (data[action.replaceAll(/\.json/g, '')]) {
                    sessionStorage[k] = JSON.stringify(data[action.replaceAll(/\.json/g, '')]);
                }
            }, false, true);
        }

        if (sessionStorage[k]) {

            let dataJson = JSON.parse(sessionStorage[k]);

            //		Ajaxize.ajaxPost(action, postJson, function(data) {
            let itemName = listId.replaceAll(/^.+Dialog\./g, '');
            itemName = itemName.replaceAll(/^.+Form\./g, '');
            itemName = itemName.replaceAll(/List$/g, '');
            //		let dataJson = data[action.replaceAll(/\.json/g, '')];
            //
            //		// 取得データ数によって表示替え
            //		if (dataJson) {
            let $elements = $('[id="' + listId + '"]');
            $elements.each(function() {

                let $element = $(this);

                let isSearchForm = $element.closest('form').hasClass('search');
                if (isSearchForm) {
                    //検索フォームの場合
                    if (dataJson.length < optionsSizeSearch) {
                        Options.check($element, itemName, dataJson, optionValue, optionLabel);
                    } else {
                        Options.option($element, true, dataJson, optionValue, optionLabel);
                    }
                } else {
                    //登録フォームの場合
                    if (dataJson.length == 2 && dataJson[0][optionValue] == '0' && dataJson[1][optionValue] == '1') {
                        //値が「0」「1」の場合はチェックボックス
                        Options.check($element, itemName, [dataJson[1]], optionValue, optionLabel);
                    } else if ($element.attr('data-force-pulldown') == '1') {
                        Options.option($element, true, dataJson, optionValue, optionLabel);
                    } else if (dataJson.length < optionsSizeDetail) {
                        Options.radio($element, itemName, dataJson, optionValue, optionLabel);
                    } else {
                        Options.option($element, true, dataJson, optionValue, optionLabel);
                    }
                }

                //				if (dataJson.length == 1) {
                //					//データ数が「1」の場合はチェックボックス
                //					Options.check($element, itemName, dataJson, optionValue, optionLabel);
                //				} else if (dataJson.length < 10) {
                //					if (isSearchForm) {
                //						Options.check($element, itemName, dataJson, optionValue, optionLabel);
                //					} else {
                //						if (dataJson.length == 2 && dataJson[0][optionValue] == 0 && dataJson[1][optionValue] == 1) {
                //							let omitted = JSON.parse(JSON.stringify(dataJson));
                //							delete omitted[0];
                //							Options.check($element, itemName, omitted, optionValue, optionLabel);
                //						} else {
                //							Options.radio($element, itemName, dataJson, optionValue, optionLabel);
                //						}
                //					}
                //				} else {
                //					Options.option($element, true, dataJson, optionValue, optionLabel);
                //				};
            });
            //		}
            //		}, false);
        }
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

        let itemId = $element.prop('id');
        let itemName = itemId.replace(/^.+Dialog\./, '');
        itemName = itemName.replace(/^.+Form\./, '');
        itemName = itemName.replace(/List$/, '');
        $element.prop('name', itemName);
        $element.find('option').remove();

        if (isBlank) {
            $element.append('<option></option>');
        }

        for (let i in dataJson) {
            let listSource = dataJson[i];
            let value = listSource[valueName];
            let label = listSource[labelName];
            if (value != label) {
                label = value + '：' + label;
            }
            $element.append('<option value="' + value + '">' + label + '</option>');
        }
    }

};
