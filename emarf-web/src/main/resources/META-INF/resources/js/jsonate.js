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
 * json/form制御
 *
 * @author golorp
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

    /**
     * フォームをJSON化
     */
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

            let postData = [];

            if (isSelectRow) {
                // 行選択指定の場合は、選択している行のみ

                for (let r in gridData) {

                    // 選択有無のチェック
                    let selected = false;
                    for (let i in grid.getSelectedRows()) {
                        if (r == grid.getSelectedRows()[i]) {
                            selected = true;
                            postData.push(gridData[r]);
                            break;
                        }
                    }

                    // 選択なしなら空配列を追加（nullだとvalidatorが利かなくなる）
                    if (!selected) {
                        postData.push({});
                    }
                }

            } else {
                // 行選択指定でない場合は、変更している行のみ

                for (let r in gridData) {

                    // 変更有無のチェック
                    let updated = false;
                    if (!grid.orgData || !grid.orgData[r]) {
                        // 元データがない場合
                        updated = true;
                        postData.push(gridData[r]);
                    } else if (JSON.stringify(gridData[r]) != JSON.stringify(grid.orgData[r])) {
                        // 変更があった場合
                        updated = true;
                        postData.push(gridData[r]);
                    } else if (gridData[r][gridOpeVisibleColumn] == null) {
                        // INSERT_TSがNULLの場合（転生時など）
                        updated = true;
                        postData.push(gridData[r]);
                    }

                    // 変更なしなら空配列を追加（nullだとvalidatorが利かなくなる）
                    if (!updated) {
                        postData.push({});
                    }
                }
            }

            let gridIds = gridId.split('.');
            let gridName = gridIds[gridIds.length - 1];
            formJson[gridName] = postData;
        });

        return formJson;
    },

    /**
     * 値のある項目のみJSON化
     * @param $form フォーム
     */
    toValueJson: function($form) {

        let formJson = {};

        /*
         * フォーム内容
         */
        $form.find(Jsonate.inputSelector).each(function() {

            // 入力項目
            let $input = $(this);

            // JSONキー
            let k = $input.prop('name');

            // JSON値
            let v = $input.val();

            if (v != '') {
                // JSON値が取れた場合

                if (formJson[k]) {
                    // 取得済みのキーだった場合

                    // JSON値が配列でない場合は配列化
                    if (!Array.isArray(formJson[k])) {
                        formJson[k] = [formJson[k]];
                    }

                    // 配列の末尾に追加
                    formJson[k].push(v);

                } else {

                    // JSON値を設定
                    formJson[k] = v;
                }
            }
        });

        /*
         * グリッド内容
         */
        $form.find('[id$=Grid]').each(function() {

            // グリッドID
            let gridId = this.id;

            // グリッド
            let grid = Gridate.grids[gridId];
            if (grid) {

                // グリッドデータ
                let gridData = grid.getData().getItems();

                if (gridData.length > 0) {
                    // グリッドデータが１件以上ある場合

                    // グリッドIDからグリッド名を取得
                    let gridIds = gridId.split('.');
                    let gridName = gridIds[gridIds.length - 1];

                    // グリッド名をキーにグリッド内容を取得
                    formJson[gridName] = gridData;
                }
            }
        });

        return formJson;
    },

    /**
     * JSONをフォームに反映
     * @param data { entityName, { k: v}}
     * @param $form フォーム
     */
    toForm: function(data, $form) {

        // JSONのキー（エンティティ名）でループ
        for (let entityName in data) {

            // エンティティのJSONを取得
            let json = data[entityName];

            // JSONキーでループ
            for (let k in json) {

                // JSON値が、objectだが配列でなければ、grid項目とみなして再帰
                if (json[k] != null && typeof (json[k]) == 'object' && !Array.isArray(json[k])) {
                    let nestData = {};
                    nestData[k] = json[k];
                    Jsonate.toForm(nestData, $form);
                }
            }

            // 入力項目でループ
            $form.find(Jsonate.inputSelector + ', input[type=checkbox]:enabled, input[type=radio]:enabled').each(function() {
                let $input = $(this);
                let k = $input.prop('name');
                //チェックボックス・ラジオボタン用の対応
                if (k.lastIndexOf(entityName) > 0) {
                    k = k.substr(k.lastIndexOf(entityName));
                }

                // 入力項目のnameで値を取得してみる
                let v = json[k];

                // entityNameなしでも取得してみる
                if (v == null) {
                    v = json[k.replace(entityName + '.', '')];
                }

                // UPPER_CASEでも取得してみる
                if (v == null) {
                    v = json[Casing.toUpper(k.replace(entityName + '.', ''))];
                }

                // kebab-caseでも取得してみる
                if (v == null) {
                    v = json[Casing.toKebab(k.replace(entityName + '.', ''))];
                }

                // UPPER-KEBAB-CASEでも取得してみる
                if (v == null) {
                    v = json[Casing.toUpperKebab(k.replace(entityName + '.', ''))];
                }

                // 値があれば反映
                if (v != null) {

                    console.debug('#' + $(this).prop('id') + ' [' + k + ' = ' + v + ']');

                    // もしファイルタグならリンクに変換
                    if ($input.attr('type') == 'file') {

                        //                        // ファイルタグを非表示
                        //                        $input.prop('disabled', true).hide();

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
                        let href = entityName + 'Download.link' + params;
                        $link.prop('href', href);
                        if (v.endsWith('.bmp') || v.endsWith('.gif') || v.endsWith('.jpg') || v.endsWith('.jpeg') || v.endsWith('.png')) {
                            $link.html('<img id="' + this.id + 'Img" class="imageLink" src="' + href + '" />');
                        } else {
                            $link.html(v.split('|')[0]);
                        }

                        // ファイルパスのhiddenタグを活性
                        $('input[type="hidden"][id="' + this.id + '"]').prop("disabled", false).val([v]);

                    } else {
                        if ($input[0].type == 'datetime-local') {
                            //                            $input.val([v.toISOString().slice(0, -1)]);
                            $input.val(v.replace('%20', 'T'));
                        } else {
                            $input.val([v]);
                        }
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
                            //gridRow[Casing.toUpper(fieldName)] = child[fieldName];
                            gridRow[fieldName] = child[fieldName];
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
        $inputs.removeClass('error').prop('title', '');//.removeAttr('readonly').removeClass('readonly').removeAttr('tabindex');
        //$inputs.next('a').show();

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
            if (this.name != 'rows' && this.name != 'page') {
                $input.val(['']);
            }
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
