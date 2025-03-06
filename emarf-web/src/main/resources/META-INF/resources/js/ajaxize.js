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
 * ajax通信
 *
 * @author golorp
 */

$(function() {

    console.info('Ajaxize init.');

    /*
     * 「.ajax」のフォーム送信を横取り
     */
    $(document).on('submit', 'form', function(event) {

        // 押下したボタンを取得
        let $button = $(event.originalEvent.submitter);

        // 削除ボタンだった場合は実行確認
        if ($button.hasClass('delete')) {
            if (!confirm(Messages['confirm.delete'])) {
                event.preventDefault();
                event.stopPropagation();
                event.stopImmediatePropagation();
                return false;
            }
        }

        // 登録ボタンだった場合は実行確認
        if ($button.hasClass('regist')) {
            if (!confirm(Messages['confirm.regist'])) {
                event.preventDefault();
                event.stopPropagation();
                event.stopImmediatePropagation();
                return false;
            }
        }

        // 承認ボタンだった場合は実行確認
        if ($button.hasClass('permit')) {
            if (!confirm(Messages['confirm.permit'])) {
                event.preventDefault();
                event.stopPropagation();
                event.stopImmediatePropagation();
                return false;
            }
        }

        // 否認ボタンだった場合は実行確認
        if ($button.hasClass('forbid')) {
            if (!confirm(Messages['confirm.forbid'])) {
                event.preventDefault();
                event.stopPropagation();
                event.stopImmediatePropagation();
                return false;
            }
        }

        // 送信先を取得
        let $form = $(this);
        let action = $form.prop('action');

        // ボタンに送信先の指定があれば上書き
        if ($button.attr('data-action')) {
            action = $button.attr('data-action');
        }

        // 送信先が「.ajax」でなければ終了（ブラウザが送信する）
        if (action.match(/\.ajax/g) == null) {
            return;
        }

        // イベントキャンセル
        event.preventDefault();
        event.stopPropagation();
        event.stopImmediatePropagation();

        // フォーム内の入力項目のエラー表示をクリア
        let $inputs = $form.find(':input');
        $inputs.removeClass('error').prop('title', '');
        let $label = $inputs.parent('label');
        $label.removeClass('error').prop('title', '');

        // グリッドのエラースタイルを解除
        for (let gridId in Gridate.grids) {
            let grid = Gridate.grids[gridId];
            grid.removeCellCssStyles('error');
        }

        // formdataを取得
        let formData = new FormData(this);

        // フォーム内容をjsonに取得して、グリッドデータもformdataに追加
        let formJson = Jsonate.toJson($form, $button.hasClass('selectRows'));

        for (let k in formJson) {
            let itemJson = formJson[k];
            if (Array.isArray(itemJson) && itemJson.length > 0) {
                if (k.match(/Grid$/)) {

                    if (columnDetail && columnDetail != '') {
                        let tableNameColumn = itemJson[0][columnDetail.toUpperCase()];
                        if (!tableNameColumn) {
                            tableNameColumn = itemJson[0][columnDetail.toLowerCase()];
                        }
                        if (tableNameColumn) {
                            let entityName = Casing.toPascal(tableNameColumn);
                            action = './' + entityName + 'SRegist.ajax';
                            k = entityName + 'Grid';
                        }
                    }

                    formData.append(k, JSON.stringify(itemJson));
                }
            }
        }

        let callback;

        let gridId = $button.attr('data-gridId');
        if (gridId != undefined) {
            // 送信したボタンに反映先のグリッドID指定がある場合（検索ボタンの場合）

            Gridate.refresh(gridId, []);

            callback = function(data) {
                for (let dataName in data) {
                    if (Array.isArray(data[dataName])) {
                        Gridate.refresh(gridId, data[dataName], data['totalRows'], data['currentPage']);
                        break;
                    }
                }
                if (gridId.indexOf('Dialog') < 0) {
                    Base.resizeNav();
                }
            };

        } else {
            // 送信したボタンに反映先のグリッドID指定がない場合（登録ボタンの場合）

            let $dialogDiv = $button.closest('[id$="Dialog"]');
            if ($dialogDiv.length == 0) {

                // 親画面の場合、検索ボタンがあれば押下、なければ再描画
                let $articleDiv = $('body>div.article');
                let $searchButton = $articleDiv.find('button[id^="Search"]');
                if ($searchButton.length > 0) {
                    callback = function() { $searchButton.click(); };
                } else {
                    if (window.opener) {
                        let $articleDiv = $(window.opener.document).find('body>div.article');
                        let $searchButton = $articleDiv.find('button[id^="Search"]');
                        if ($searchButton.length > 0) {
                            callback = function() { $searchButton.click(); window.close(); };
                        } else {
                            callback = function() { window.document.location.reload(); };
                        }
                    } else {
                        callback = function() { window.document.location.reload(); };
                    }
                }

            } else {
                // ダイアログの場合

                let $searchButton = $dialogDiv.find('button[id^="Search"]');
                if ($searchButton.length > 0) {
                    // ダイアログ内に検索ボタンがある場合は再検索
                    callback = function() { $searchButton.click(); };
                } else {
                    // ダイアログ内に検索ボタンがない場合

                    let caller = $dialogDiv.attr('data-caller');
                    let parentDialogId = caller.match(/.+Dialog/);

                    if (parentDialogId == null) {
                        // １階層目のダイアログの場合

                        let $articleDiv = $('body>div.article');
                        let $searchButton = $articleDiv.find('button[id^="Search"]');
                        if ($searchButton.length > 0) {
                            // 親画面に検索ボタンがあれば、ダイアログを閉じて再検索
                            callback = function() {
                                $dialogDiv.dialog('close');
                                $searchButton.click();
                            };
                        } else {
                            // 親画面に検索ボタンがなければ何もしない
                        }

                    } else {
                        // ２階層以降のダイアログの場合

                        let $parentDiv = $('div[id="' + parentDialogId + '"]');
                        let $searchButton = $parentDiv.find('button[id^="Search"]');
                        if ($searchButton.length > 0) {
                            // 親ダイアログに検索ボタンがあれば、ダイアログを閉じて再検索
                            callback = function() {
                                $dialogDiv.dialog('close');
                                $searchButton.click();
                            };
                        } else {
                            // 親画面に検索ボタンがなければ、ダイアログを閉じて親ダイアログを再描画
                            callback = function() {
                                $dialogDiv.dialog('close');
                                Dialogate.refreshById(parentDialogId);
                            };
                        }
                    }
                }
            }
        }

        Ajaxize.ajaxPost(action, formData, callback);
    });
});

let Ajaxize = {

    ajaxPost: function(action, formJson, callback, noLoading, isQuiet) {
        Ajaxize.jaxPost(action, formJson, callback, noLoading, isQuiet, true);
    },

    sjaxPost: function(action, formJson, callback, noLoading, isQuiet) {
        Ajaxize.jaxPost(action, formJson, callback, noLoading, isQuiet, false);
    },

    /**
     * ajax送信
     */
    jaxPost: function(action, formJson, callback, noLoading, isQuiet, isAsync) {

        if (typeof Loading != 'undefined' && noLoading != false) {
            Loading.fadeIn();
        }

        // ajaxオプション
        let options = {
            async: isAsync,   // 非同期通信フラグ
            cache: false,     // キャッシュフラグ
            dataType: 'json', // 通信結果取得のデータ型
            headers: {
                "X-CSRF-TOKEN": formJson['_csrf']
            },
            type: 'post',
            url: action,
        };

        let logJson = formJson;
        if (formJson instanceof FormData) {
            // 送信値がformdataの場合

            options['contentType'] = false; // contentTypeをfalseに指定
            options['data'] = formJson;
            options['processData'] = false; // Ajaxがdataを整形しない指定

            logJson = {};
            formJson.forEach(function(value, key) {
                logJson[key] = value;
            });

        } else {
            // 送信値がjsonの場合

            options['contentType'] = 'application/json; charset=UTF-8';
            options['data'] = JSON.stringify(formJson);
        }

        $.ajax(options).fail(function(data) {
            console.error(data);
            if (data.status == 200) {
                alert(Messages['error.session']);
                window.document.location.href = '../';
            } else if (data.status == 500) {
                alert(Messages['fatal']);
            } else {
                alert(Messages['error.network']);
            }
        }).done(function(data) {

            console.info('action: ' + action);
            console.debug(logJson);
            console.debug(data);
            //console.info('--------------------------------------------------');

            // システムエラー
            if (data.FATAL) {
                alert(data.FATAL);
                return;
            }

            // アプリケーションエラー
            if (data.ERROR) {

                alert(data.ERROR);

                Ajaxize.errorStyle(data.errors);

                return;
            }

            // 警告表示
            if (data.WARN) {
                alert(data.WARN);
            }

            // 情報通知
            if (data.INFO && !(isQuiet == true)) {
                alert(data.INFO);
            }

            try {
                callback(data)
            } catch (e) {
                console.error(e);
                alert(e);
            }
        }).always(function() {
            if (typeof Loading != 'undefined' && noLoading != false) {
                Loading.fadeOut();
            }
        });
    },

    errorStyle: function(errors) {

        var gridStyles = {};

        for (let k in errors) {

            if (!k.match(/\[[0-9]+\]\./)) {
                // form項目の場合（添え字なしの場合）

                let keys = k.split('.');
                let formName = keys[0];
                let entityName = keys[keys.length - 2].replace('RegistForm', '');
                let fieldName = keys[keys.length - 1];
                let $input = $('[name="' + formName + '"]').find('[name="' + fieldName + '"]');
                if ($input.length == 0) {
                    $input = $('[name="' + formName + '"]').find('[name="' + entityName + '.' + fieldName + '"]');
                }
                $input.addClass('error').attr('title', errors[k]);

                if ($input.parent('label').length > 0) {
                    $input.parent('label').addClass('error').attr('title', errors[k]);
                }

            } else {
                // grid項目の場合

                var names = k.split('\.');               // D0001RegistForm, D0001Grid[0], entityMei
                //var formName = names[0];                 // D0001RegistForm
                var rowName = names[1];                  // D0001Grid[0]
                var fieldName = names[2];                // entityMei

                var rowNames = rowName.split(/[\[\]]/g); // D0001Grid, 0
                var gridId = rowNames[0];                // D0001Grid
                var rowIndex = rowNames[1];              // 0

                let cell;

                // グリッド取得
                var grid = Gridate.grids[gridId];
                if (!grid) {
                    for (var id in Gridate.grids) {
                        if (id.endsWith(gridId)) {
                            grid = Gridate.grids[id];
                            break;
                        }
                    }
                }

                if (grid) {

                    // グリッドのエラースタイルを作成
                    var gridColumns = grid.getColumns();
                    for (var colIndex in gridColumns) {
                        var column = gridColumns[colIndex];
                        if (column['id'] == fieldName) {

                            let rowStyles = gridStyles[gridId];
                            if (!rowStyles) {
                                rowStyles = {};
                            }

                            var cellStyles = rowStyles[rowIndex];
                            if (!cellStyles) {
                                cellStyles = {};
                            }

                            cellStyles[fieldName] = 'error';
                            rowStyles[rowIndex] = cellStyles;
                            gridStyles[gridId] = rowStyles;

                            cell = colIndex;

                            break;
                        }
                    }

                    try {
                        grid.getCellNode(rowIndex, cell).title = errors[k];
                    } catch (e) {
                        // グリッドが横に長すぎるとcellnodeが取れない時がある
                        console.error(e);
                    }
                }
            }
        }

        // グリッドにエラースタイルを設定
        for (let gridId in gridStyles) {
            var grid = Gridate.grids[gridId];
            if (!grid) {
                for (var id in Gridate.grids) {
                    if (id.endsWith(gridId)) {
                        grid = Gridate.grids[id];
                        break;
                    }
                }
            }
            grid.setCellCssStyles('error', gridStyles[gridId]);
        }
    },

};
