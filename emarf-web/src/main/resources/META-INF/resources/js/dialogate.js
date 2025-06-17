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
 * dialog制御
 *
 * @author golorp
 */

$(function() {

    console.info('Dialogate init.');

    // 親画面に複数のフォームがある場合に、IDが重複しないよう、ID項目にフォーム名を接頭
    $('[id]').each(function() {
        if (this.tagName == 'INPUT' || this.tagName == 'TEXTAREA') {
            let $me = $(this);
            let $form = $me.closest('form');
            let id = $form.prop('name') + '.' + this.id;
            $me.prop('id', id);
            //labelのfor属性も更新
            if ($me.prev().length > 0 && $me.prev()[0].tagName == 'LABEL') {
                $me.prev().prop('for', id);
            }
        }
        if (this.tagName == 'A' || this.tagName == 'FIELDSET') {
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

        console.info('Dialogate ancher on click.');

        // イベントキャンセル
        event.preventDefault();
        event.stopPropagation();
        event.stopImmediatePropagation();

        // リンクを取得
        let $link = $(this);

        // 表示するダイアログを取得
        let href = $link.attr('href');
        let dialogId = href.replace(/(^.+\/|\.html(\?.+)?$)/g, '') + 'Dialog';
        let $dialogDiv = $('div[id="' + dialogId + '"]');

        //選択サブなら制約条件を表示
        if ($link.hasClass('correct')) {
            $dialogDiv.find('div.stint').show();
        }

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
            Dialogate.reflect2Dialog(this, $dialogDiv, prefix);
        });

        //呼び出し先の制約項目があれば、呼び出し元から取得
        let stints = $dialogDiv.find('span.stint,input.stint');
        for (let i = 0; i < stints.length; i++) {
            let stint = stints[i];
            let names = stint.id.split('.');
            let name = names[names.length - 1];
            let parentVal = $form.find('[name$="' + name + '"]').val();
            $(stint).html(parentVal);
            $(stint).val(parentVal);
        }

        // 集約先追加の場合
        let isSummary = $link.hasClass('summary');
        if (isSummary) {

            // グリッド取得
            let $gridDiv = $form.find('[id$="Grid"]');
            let gridId = $gridDiv.prop('id');
            let grid = Gridate.grids[gridId]

            // グリッド列から主キーのIDとカラム名をCSVで取得（？）
            let columns = grid.getColumns();
            let id = '';
            let field = '';
            for (let i = 0; i < columns.length; i++) {
                let column = columns[i];
                let isPK = column.cssClass != null && column.cssClass.indexOf('primaryKey') >= 0;
                if (isPK) {
                    if (id != '') {
                        id += ', ';
                        field += ', ';
                    }
                    id += column.id;
                    field += column.field;
                }
            }

            // グリッドデータ
            let view = grid.getData();
            let items = view.getItems();

            // 主キーの値もCSVで取得してダイアログに反映
            let vals = '';
            for (let i in grid.getSelectedRows()) {
                let r = grid.getSelectedRows()[i];
                let item = items[r];
                if (vals != '') {
                    vals += ', ';
                }
                vals += item[field];
            }
            $dialogDiv.find('[id$="' + id + '"]').html(vals);
            $dialogDiv.find('[name$="' + id + '"]').val(vals);

            // 全ての選択行で一致するカラム名と値を取得
            let summarySufs = null;
            if (Messages['column.summary.suffixs']) {
                summarySufs = Messages['column.summary.suffixs'].split(',');
            }

            let eqs = {};
            for (let i in grid.getSelectedRows()) {
                let r = grid.getSelectedRows()[i];
                let item = items[r];
                for (let colName in item) {
                    if (colName != 'ROW_NUM' && colName != 'id' &&
                        !colName.match(new RegExp('^' + Messages['column.start'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.until'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.insert.timestamp'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.insert.id'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.insert.mei'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.update.timestamp'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.update.id'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.update.mei'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.delete'] + '$', 'i')) &&
                        !colName.match(new RegExp('^' + Messages['column.status'] + '$', 'i'))) {
                        // メタ情報以外の項目を親画面に反映

                        let val = item[colName];

                        let isSummary = false;
                        for (let i in summarySufs) {
                            let summarySuf = summarySufs[i];
                            if (colName.endsWith(summarySuf.toLowerCase()) || colName.endsWith(summarySuf.toUpperCase())) {
                                isSummary = true;
                                break;
                            }
                        }

                        if (isSummary) {
                            if (!eqs[colName]) {
                                eqs[colName] = 0;
                            }
                            eqs[colName] += val;
                        } else {
                            if (!eqs[colName] && eqs[colName] != '') {
                                eqs[colName] = val;
                            } else if (eqs[colName] != val) {
                                eqs[colName] = ''
                            }
                        }
                    }
                }
            }

            for (let colName in eqs) {
                let eq = eqs[colName];
                if (eq == '') {
                    continue;
                }
                let property = Casing.toCamel(colName);
                $dialogDiv.find('span[id$="' + property + '"]').html(eqs[colName]);
                $dialogDiv.find('[name$="' + property + '"]').val([eqs[colName]]);
            }
        }

        let isDerive = $link.hasClass('derive');
        if (isDerive) {
            $link.nextAll('input').each(function() {
                Dialogate.reflect2Dialog(this, $dialogDiv, prefix);
            });
        }

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
        let entity = href.replace(/(^.+\/|\.html(\?.+)?$)/g, '');
        let dialogId = entity + 'Dialog';
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
                if (this.tagName == 'A' || this.tagName == 'FIELDSET') {
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

                    console.info('Dialogate open.');

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

                    let $searchForm = $dialogDiv.find('[name$="SearchForm"]');
                    if ($searchForm.length > 0) {

                        //クエリストリングにaction指定があれば設定
                        let href = $link.prop('href');
                        let i = href.indexOf('?');
                        if (i >= 0) {
                            let querystring = href.substring(i + 1);
                            let querystrings = querystring.split('&');
                            for (let i in querystrings) {
                                let getParams = querystrings[i].split('=');
                                if (getParams[0] == 'action') {
                                    $searchForm.prop('action', getParams[1]);
                                    break;
                                }
                            }
                        }

                        // ダイアログ内に検索フォームがあり、呼び出し元イベントで検索項目が設定されている場合は、検索結果を初期表示
                        let formJson = Jsonate.toValueJson($searchForm);
                        if (JSON.stringify(formJson) != '{}') {
                            $searchForm.find('button.search').click();
                        }

                    } else {

                        let $registForm = $dialogDiv.find('[name$="RegistForm"]');

                        // ダイアログの場合だけ初期化すればいいのでBase.referRegistForm()から移動
                        $registForm.find('a, input, select, textarea').each(function() {
                            Base.writable(this);
                        });
                        $registForm.find('fieldset a.refer, input[type="button"].gridDelete').show();
                        let gridDivs = $registForm.find('[id$=Grid]');
                        for (let i = 0; i < gridDivs.length; i++) {
                            let gridId = gridDivs[i].id;
                            Gridate.grids[gridId].getOptions()['editable'] = true;
                        }

                        // ダイアログ内の登録フォームに、呼び出し元イベントで値が設定されている場合は、照会結果を初期表示
                        Base.referRegistForm($registForm);
                    }

                    try {
                        console.info(entity + 'Open();');
                        eval(entity + 'Open()');
                    } catch (e) {
                        console.debug(e.message);
                    }

                    Nextize.first($dialogDiv);
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

        let $dialogDiv = $('[id$="' + dialogId + '"]');

        // ダイアログの主キー情報を退避
        let primaryKeys = {};
        $dialogDiv.find('input.primaryKey').each(function() {
            primaryKeys[this.name] = $(this).val();
        });

        // ダイアログを一旦閉じる
        $dialogDiv.dialog('close');

        // ダイアログに主キー情報を復帰して開く
        for (let name in primaryKeys) {
            $dialogDiv.find('[name="' + name + '"]').val(primaryKeys[name]);
        }
        $dialogDiv.dialog('open');

    },

    reflect2Dialog: function(sendInput, $dialogDiv, prefix) {

        let sendItemName = sendInput.name;                                                 // TEntity.betsuSansho1Id
        let sendValue = $(sendInput).val();

        // そのままの項目名でヒットする場合（詳細リンク、追加リンクの親モデル）
        let $dialogItem = $dialogDiv.find('[name="' + sendItemName + '"]');
        if ($dialogItem.length > 0) {
            $dialogItem.val(sendValue);
            $dialogDiv.find('span[id="' + sendItemName + '"]').html(sendValue);
            //追加リンクの親モデル用にコメントアウト
            //                return;
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
                $(this).val([sendValue]);
                $dialogDiv.find('span[id="' + dialogInputName + '"]').html(sendValue);
            }
        });
    },

};