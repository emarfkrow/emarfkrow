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
 * 基本実装
 *
 * @author golorp
 */

//console.trace = function() { }
//console.debug = function() { }

/**
 * バイト数計算
 */
String.prototype.bytes = function() {
    var length = 0;
    for (var i = 0; i < this.length; i++) {
        var c = this.charCodeAt(i);
        if ((c >= 0x0 && c < 0x81) || (c === 0xf8f0) || (c >= 0xff61 && c < 0xffa0) || (c >= 0xf8f1 && c < 0xf8f4)) {
            length += 1;
        } else {
            length += 2;
        }
    }
    return length;
};

// １．DOM構築後
$(function() {

    console.debug('base-1: $(function() {});');

    console.info('Base init.');

    // 画面の参照権限のチェック
    let href = window.document.location.href;
    let home = Messages['index.home'];
    if (home && home != '') {
        home = home.replace(/^[\.\/]+/, '');
        if (!href.match(home)) {
            if (Base.getAuthz(href) < 1) {
                alert(Messages['error.authz.view']);
                window.document.location.href = '../';
            }
        }
    }

    // クエリストリングの取得
    window.location.search.slice(1).split('&').forEach(function(s) {
        if (s != '') {
            var a = s.split('=');
            Base.querystrings[a[0]] = decodeURIComponent(a[1]);
        }
    });

    // テキスト入力のオートコンプリート解除
    $('input[type="text"]').prop('autocomplete', 'off');
    $('input[type="password"]').prop('autocomplete', 'new-password').prop('aria-autocomplete', 'none');

    // 画面にクライアントシステム日時を表示
    $('.certification #timestamp').html(Formatter.YmdHmsS(new Date()));

    // サブウィンドウならメインリンク・ログアウトボタン・ナビ非表示
    if (window.opener) {
        $('.header h1').hide();
        $('button#logout').hide();
        $('.nav dl').hide();
    }

    if ($('#authNName').html() == 'anonymous') {
        $('button#logout').hide();
    }
});

// ２．DOM構築後
$(document).ready(function() {
    console.debug('base-2: $(document).ready(function() {});');
});

// ３．DOM構築後
$(document).on('ready', function() {
    console.debug('base-3: $(document).on(\'ready\', function() {});');

    // 画面初期化
    if (typeof Loading != 'undefined') {
        Base.loaded(Base.init);
    } else {
        Base.init();
    }

    // URLにFATALがついていればポップアップ
    if (Base.querystrings['FATAL']) {
        alert(Messages[Base.querystrings['FATAL']]);
        //let href = document.location.href;
        //document.location.href = href.replace(/\?.+$/, '');
        return;
    }

    // URLにERRORがついていればポップアップ
    if (Base.querystrings['ERROR']) {
        alert(Messages[Base.querystrings['ERROR']]);
        if (Base.querystrings['errors']) {
            sessionStorage.setItem('errors', Base.querystrings['errors']);
        }
        //let href = document.location.href;
        //document.location.href = href.replace(/\?.+$/, '');
        //return;
    }

    let sessionErrors = sessionStorage.getItem('errors');
    if (sessionErrors) {
        let errors = JSON.parse(sessionErrors);
        Ajaxize.errorStyle(errors);
        sessionStorage.removeItem('errors');
    }

    // URLにINFOがついていればポップアップ
    if (Base.querystrings['INFO']) {
        alert(Messages[Base.querystrings['INFO']]);
        //let href = document.location.href;
        //document.location.href = href.replace(/\?.+$/, '');
    }

    let radioCancel = null;
    $('input[type="radio"]').click(function() {
        let name = $(this).prop('name');
        radioCancel = true;
        setTimeout(function() {
            if (radioCancel) {
                $('[name="' + name + '"]').prop('checked', false);
            }
        }, 50);
    });

    $('input[type="radio"]').change(function() {
        radioCancel = false;
    });

    // 詳細画面で、URL引数に値が設定されている場合は、照会結果を初期表示
    let href = window.document.location.href;
    let $searchForm = $('body>.article [name$="SearchForm"]');
    let $registForm = $('body>.article [name$="RegistForm"]');
    if ($searchForm.length == 0 && $registForm.length > 0) {
        let querystrings = {};
        for (let k in Base.querystrings) {
            // 「$」区切りのパラメータがもしあれば、各名称に分割（UNIONしたVIEWの対応）
            if (k.lastIndexOf('$') >= 0) {
                let ks = k.split('$');
                for (let i = 0; i < ks.length; i++) {
                    querystrings[ks[i]] = Base.querystrings[k];
                }
            } else {
                querystrings[k] = Base.querystrings[k];
            }
        }
        let entityName = href.replace(/\.html.+/, '').replace(/.+\//, '');
        let data = {};
        data[entityName] = querystrings;
        Jsonate.toForm(data, $registForm);

        let isSilent;
        if (querystrings['isSilent']) {
            isSilent = querystrings['isSilent'];
        }

        // サブウィンドウの際にBase.init()が間に合わないため遅らせる
        Base.loaded(function() {
            Base.referRegistForm($registForm, isSilent);
        });
    }
});

// ４．画像ファイル読み込み後
$(window).load(function() {
    console.debug('base-4: $(window).load(function() {});');
});

// ５．画像ファイル読み込み後
$(window).on('load', function() {
    console.debug('base-5: $(window).on(\'load\', function() {});');

    //    if (window.opener) {
    let href = window.document.location.href;
    // 「.html」以降を除去。「～/」を除去。
    let entity = href.replace(/\.html.*/, '').replace(/.+\//, '');
    try {
        console.info(entity + 'Open();');
        eval(entity + 'Open()');
    } catch (e) {
        console.debug(e.message);
    }
    //    }

    $('div.nav a').on('click', function() {
        sessionStorage.setItem('navScrollTop', $('div.nav')[0].scrollTop);
    });
});

let Base = {

    querystrings: {},

    /**
     * Loading終了を待って実行
     */
    loaded: function(func) {

        if (typeof Loading != 'undefined') {
            // Loadingをロード済みなら終了を待つ
            Loading.fadeIn();
            let timer = setInterval(function() {
                if (Loading.stack <= 1) {
                    try {
                        // 念押しで0.1秒待つ
                        setTimeout(function() {
                            func();
                        }, 100);
                    } catch (e) {
                        alert(e);
                        throw e;
                    } finally {
                        clearInterval(timer);
                    }
                }
            }, 10);
            Loading.fadeOut();
        } else {
            // Loadingがロードされていなければ即実行
            console.info('Base.loaded(function() {});');
            func();
        }
    },

    getAuthz: function(href) {

        //返却値を初期化
        let authz = '';

        //画面IDを取得（URLから、最後の「/」までと、「?」以降と、拡張子を除去）
        let gamenId = href.replace(/.+\//, '').replace(/\?.+/, '').replace(/\.html/, '');
        //エクセルボタン用
        gamenId = gamenId.replace(/(Search|Get)/, '').replace(/\.xlsx/, '');
        //登録系ボタン用
        gamenId = gamenId.replace(/(Search|Regist)/, '').replace(/Form/, '');

        //画面IDが取れなければ参照可
        if (gamenId == '') {
            return '1';
        }

        //ログイン画面なら参照可
        if (gamenId == 'login') {
            return '1';
        }

        //パスワードメール画面なら参照可
        if (gamenId == 'passmail') {
            return '1';
        }

        //パスワードリセット画面なら参照可
        if (gamenId == 'passreset') {
            return '1';
        }

        //sessionStorageに認可情報がある場合
        if (sessionStorage['authzInfo']) {

            //認可情報を取得
            let authzInfo = JSON.parse(sessionStorage['authzInfo']);

            //認可スキップなら「9」を返す
            if (authzInfo['authz'] && authzInfo['authz'] == 'false') {
                return 9;
            }

            //認可情報のうち画面IDが最長でマッチする認可区分を返す
            //            let matchLength = 0;
            for (let gamenNm in authzInfo) {
                //                if (gamenId.match(gamenNm)) {
                //                    if (matchLength <= gamenNm.length) {
                //                        matchLength = gamenNm.length;
                //                        authz = authzInfo[gamenNm];
                //                    }
                //                }
                if (gamenId.match(new RegExp('^' + gamenNm + '$', 'i'))) {
                    if (authz < authzInfo[gamenNm]) {
                        authz = authzInfo[gamenNm];
                    }
                }
            }
        }

        return authz;
    },

    init: function() {

        $('.datepicker').each(function() {
            let format = 'yy-mm-dd';
            let dataFormat = $(this).attr('data-format');
            if (dataFormat) {
                format = dataFormat;
            }
            $(this).datepicker({
                dateFormat: format,
                dayNamesMin: ['日', '月', '火', '水', '木', '金', '土'],
                monthNames: ['1月', '2月', '3月', '4月', '5月', '6月', '7月', '8月', '9月', '10月', '11月', '12月'],
                showMonthAfterYear: true,
                yearSuffix: '年',
            });
        });

        let tmOptions = '<option></option>';
        for (let i = 0; i <= 999; i++) {
            tmOptions += '<option>' + i + ':00</option><option>' + i + ':15</option><option>' + i + ':30</option><option>' + i + ':45</option>';
        }

        $('.time').each(function() {
            this.outerHTML = '<select id="' + this.id + '"></select>';
            let $me = $('[id="' + this.id + '"]');
            let attrs = $(this)[0].attributes
            for (let i in attrs) {
                let attr = attrs[i];
                let name = attr.name;
                let value = attr.value;
                if (name == undefined || value == undefined) {
                    continue;
                } else if (name == 'type') {
                    continue;
                } else if (name == 'maxlength') {
                    continue;
                } else if (name == 'autocomplete') {
                    continue;
                }
                $me.attr(attr.name, attr.value);
            }
            $me.append(tmOptions);
        });

        // buttonスタイル適用
        $('button, .nav a.table, .nav a.view, .article a').button();
        $('.article fieldset a').css('padding', 0);

        // 画面の更新権限のチェック
        $('form[name]').each(function() {
            // 出力権限なし
            if (Base.getAuthz(this.name) < 2) {
                $(this).find('a.output').hide();
            }
            // 更新権限なし
            if (Base.getAuthz(this.name) < 3) {
                $(this).find('button.delete, button.regist').hide();
                if ($(this).hasClass('regist')) {
                    $(this).find('button.reset').hide();
                } else {
                    $(this).find('a.anew').hide();
                }
            }
            // 追加権限なし
            if (Base.getAuthz(this.name) < 4) {
                $(this).find('a.anew').hide();
            }
            // 承認権限なし
            if (Base.getAuthz(this.name) < 5) {
                $(this).find('button.permit').hide();
            }
            // 否認権限なし
            if (Base.getAuthz(this.name) < 6) {
                $(this).find('button.forbid').hide();
            }
        });

        // リンクの認可処理
        $('.nav a, .article a').each(function() {
            if (Base.getAuthz(this.href) < 1) {
                $(this).button('option', 'disabled', true);
            }
        });

        // maxlengthに応じて幅調整
        $('[maxlength]').each(function() {
            if (this.tagName.toLowerCase() == 'input' && ($(this).prop('type') == 'date' || $(this).prop('type') == 'month' || $(this).prop('type') == 'datetime-local')) {
                return;
            }
            let maxlength = $(this).attr('maxlength');
            let width = maxlength * 1;
            if (width > 8) {
                width *= 0.6;
                if (width > 20) {
                    width = 20;
                }
            }
            $(this).css('width', width + 'rem');
        });

        // 親画面の場合、登録フォーム内に子エンティティ追加リンクがあっても、自エンティティの主キーが揃っていなければ非活性
        let $registForm = $('body>div>form[name$="RegistForm"]');
        $registForm.find('.addChild').button('option', 'disabled', false);
        let isPrimaryKey = true;
        let primaryKeys = $registForm.find('input.primaryKey');
        for (let i = 0; i < primaryKeys.length; i++) {
            isPrimaryKey &= $(primaryKeys[i]).val() != '';
        }
        if (!isPrimaryKey) {
            $registForm.find('.addChild').button('option', 'disabled', true);
        }

        // リセットボタン押下時に、id付きのスパンでrederクラスの内容もクリア
        $(document).on('click', 'button[type="reset"]', function() {
            let $reset = $(this);
            let $form = $reset.closest('form');
            $form.find('span[id].refer').html('');
        });

        // メニューのトグル
        let $dts = $('.nav>dl>dt');
        $dts.each(function() {
            let $dt = $(this);
            let id = 'navToggle' + this.id;
            $dt.html('<span id="' + id + '" class="ui-accordion-header-icon ui-icon"></span>' + $dt.html());
            let isNavs = 0;
            if (sessionStorage['navs']) {
                navs = JSON.parse(sessionStorage['navs']);
                isNavs = navs[this.id];
            }
            if (isNavs) {
                $dt.find('span[id="' + id + '"]').addClass('ui-icon-triangle-1-s');
            } else {
                $dt.find('span[id="' + id + '"]').addClass('ui-icon-triangle-1-e');
                $dt.next('dd').hide();
            }
        });
        $(document).on('click', '.nav>dl>dt', function() {
            let navs = {};
            if (sessionStorage['navs']) {
                navs = JSON.parse(sessionStorage['navs']);
            }
            let $toggle = $(this).find('span[id^="navToggle"]');
            if ($toggle.hasClass('ui-icon-triangle-1-s')) {
                // 閉じる
                $toggle.addClass('ui-icon-triangle-1-e');
                $toggle.removeClass('ui-icon-triangle-1-s');
                navs[this.id] = 0;
            } else {
                // 開く
                $toggle.addClass('ui-icon-triangle-1-s');
                $toggle.removeClass('ui-icon-triangle-1-e');
                navs[this.id] = 1;
            }
            sessionStorage['navs'] = JSON.stringify(navs);
            $(this).next('dd').toggle(500);
        });

        // 検索条件のトグル
        let $h2s = $('div.article>form.search').parent().find('h2');
        $h2s.each(function() {
            let $h2 = $(this);
            $h2.html('<span id="h2Toggle" class="ui-accordion-header-icon ui-icon ui-icon-triangle-1-s"></span>' + $h2.html());
            $h2.css('width', 'fit-content');
            $h2.on('click', function() {
                let $h2Toggle = $h2.find('[id="h2Toggle"]');
                if ($h2Toggle.hasClass('ui-icon-triangle-1-s')) {
                    $h2Toggle.addClass('ui-icon-triangle-1-e');
                    $h2Toggle.removeClass('ui-icon-triangle-1-s');
                } else {
                    $h2Toggle.addClass('ui-icon-triangle-1-s');
                    $h2Toggle.removeClass('ui-icon-triangle-1-e');
                }
                $h2.find('~form.search').toggle(500, function() {
                    Base.resizeNav();
                });
            });
        });
        $('div.article>form.search button.search').on('click', function() {
            let $button = $(this);
            let $form = $button.closest('form');
            let $h2 = $form.prev('h2');
            let $h2Toggle = $h2.find('[id="h2Toggle"]');
            if ($h2Toggle.hasClass('ui-icon-triangle-1-s')) {
                $h2.click();
            }
        });

        Base.resizeNav();

        Base.referMei($('span.refer'));

    },

    resizeNav: function() {

        // navの高さを設定
        $('html,body').css('height', '100%');
        let header = $('.header').outerHeight(true);
        let footer = $('.footer').outerHeight(true);
        let navHeight = window.innerHeight - header - footer;
        $('.nav').outerHeight(navHeight);

        //画面の主グリッドが一つだけなら高さ調整
        let $rootGrids = $('body>div.article>form>div[id$="Grid"]');
        if ($rootGrids.length == 1) {

            if ($('body')[0].scrollHeight != $('body').outerHeight()) {

                //ウィンドウにスクロールがある場合
                $rootGrids.height($rootGrids.height() - ($('body')[0].scrollHeight - $('body').outerHeight()))

            } else {

                //ウィンドウにスクロールがない場合
                $rootGrids.height($rootGrids.height() + ($('.nav').height() - $('.article').outerHeight() - $('.breads').outerHeight()))
            }

            let grid = Gridate.grids[$rootGrids.prop('id')];
            if (grid) {
                grid.resizeCanvas();
            }
        }

        $('div.nav')[0].scrollTo(0, sessionStorage.getItem('navScrollTop'));

        $(window).resize(function() {
            Base.resizeNav();
        });
    },

    /**
     * 参照モデルの名称解決
     */
    referMei: function($referSpans) {

        $referSpans.each(function() {

            let $referSpan = $(this);
            let action = $referSpan.attr('data-json');
            let srcDef = $referSpan.attr('data-srcDef');
            let destDef = $referSpan.attr('data-destDef');
            if (action && srcDef && destDef) {

                var $form = $referSpan.closest('form');

                let postJson = {};
                var srcDefs = srcDef.split(',');
                for (let i in srcDefs) {
                    var src = srcDefs[i];
                    var srcs = src.split(':');
                    let v = $form.find('[name$="' + srcs[1] + '"]').val();
                    if (v) {
                        v = v.trim();
                        if (v != '') {
                            postJson[srcs[0]] = v;
                        }
                    }
                }

                if (Object.keys(postJson).length > 0) {
                    if (action.indexOf('?') < 0) {
                        action += '?isSilent=true';
                    } else {
                        action += '&isSilent=true';
                    }
                    Ajaxize.ajaxPost(action, postJson, function(data) {
                        for (let formName in data) {
                            let dataJson = data[formName];
                            for (let i in dataJson) {
                                let rowJson = dataJson[i];
                                let destDefs = destDef.split(',');
                                for (let i in destDefs) {
                                    let dest = destDefs[i];
                                    let dests = dest.split(':');
                                    let destName = dests[0];
                                    let srcName = dests[1];
                                    let srcValue = rowJson[srcName];
                                    if (srcValue) {
                                        $form.find('[name$="' + destName + '"]').val(srcValue);
                                        $form.find('[id$="' + destName + '"]').html(srcValue);
                                    }
                                }
                            }
                        }
                    }, false);
                }
            }
        });
    },

    /**
     * 登録フォームの初期照会
     */
    referRegistForm: function($registForm, isSilent) {

        console.info('Base.referRegistForm();');

        // 詳細画面の主キー項目は、値が既にあれば読み取り専用
        let pkAll = true;
        $registForm.find('input.primaryKey').each(function() {
            if ($(this).val() != '') {
                Base.readonly(this);
            } else if ($(this).hasClass('numbering') && !$(this).hasClass('refer') && !$(this).hasClass('correct')) {
                Base.readonly(this);
            } else {
                Base.writable(this);
                pkAll = false;
            }
        });

        // 詳細画面の主キー項目の参照ボタンは、値が既にあれば非表示
        $registForm.find('[target=dialog].refer.primaryKey').each(function() {
            if ($('input[id="' + this.id + '"]').val() != '') {
                $(this).hide();
            } else {
                $(this).show();
            }
        });

        // 詳細画面のユニーク項目は、値が既にあれば読み取り専用
        $registForm.find('input.uniqueKey').each(function() {
            if (pkAll) {
                Base.readonly(this);
            } else {
                Base.writable(this);
            }
        });

        // 詳細画面のユニーク項目の参照ボタンは、値が既にあれば非表示
        $registForm.find('[target=dialog].refer.uniqueKey').each(function() {
            if (pkAll) {
                $(this).hide();
            } else {
                $(this).show();
            }
        });

        // 詳細画面の選択項目は、履歴モデル・転生元外部キー・派生元外部キー・集約先外部キーなら読み取り専用
        $registForm.find('fieldset.history, fieldset.rebornee, fieldset.derivee, fieldset.summary').each(function() {
            let $fieldset = $(this);
            $fieldset.find('input[type="checkbox"],input[type="radio"],select').each(function() {
                Base.readonly(this);
            });
        });

        $registForm.find('a.output').button('option', 'disabled', true);
        $registForm.find('a.reborner').button('option', 'disabled', true);
        $registForm.find('button.delete').button('option', 'disabled', true);
        $registForm.find('button.permit').button('option', 'disabled', true);
        $registForm.find('button.forbid').button('option', 'disabled', true);
        $registForm.find('button.regist').button('option', 'disabled', false);

        let formJson = Jsonate.toValueJson($registForm);
        if (JSON.stringify(formJson) != '{}') {

            if (isSilent) {
                formJson['IsSilent'] = isSilent;
            }

            let getAction = $registForm.prop('action').replace('Regist', 'Get').replace(/\.form$/, '.ajax');
            Ajaxize.ajaxPost(getAction, formJson, function(data) {

                // VIEWの場合、グリッド生成前にデータを反映してエラーになるため、ロード後まで遅らせる
                Base.loaded(function() {

                    // ステータス区分の読み専を外してから、フォームに項目移送し、再度ステータスを読み専
                    // 詳細画面のステータス区分は選択項目名のみ表示（既存画面用に読み専解除しているため再度読み専制御）
                    let $status = $registForm.find('[name$="' + Casing.toCamel(columnStatus) + '"]');
                    Base.writable($status);
                    Jsonate.toForm(data, $registForm);
                    Base.referMei($registForm.find('span.refer'));
                    Base.readonly($status);

                    // ステータスによるボタン制御
                    let $mainform = $registForm.find('fieldset:not(.parent):nth-child(1)');
                    let $registDt = $mainform.find('[name$="' + Casing.toCamel(columnRegistTs) + '"]');
                    let $statusKb = $mainform.find('[name$="' + Casing.toCamel(columnStatus) + '"]:checked');

                    if ($registDt.val() != '') {

                        if ($statusKb.length == 0) {
                            /*
                             * ステータスなし
                             */

                            // 削除可能
                            $registForm.find('button.delete').button('option', 'disabled', false);

                            // 転生可能
                            $registForm.find('a.reborner').button('option', 'disabled', false);

                        } else if ($statusKb.val() == 0) {
                            /*
                             * 登録ステータス
                             */

                            // 削除可能
                            $registForm.find('button.delete').button('option', 'disabled', false);

                            // 承認可能
                            $registForm.find('button.permit').button('option', 'disabled', false);

                            // 否認可能
                            $registForm.find('button.forbid').button('option', 'disabled', false);

                        } else if ($statusKb.val() == 1) {
                            /*
                             * 承認ステータス
                             */

                            // 画面をロック
                            $registForm.find('input, select, textarea').each(function() {
                                Base.readonly(this);
                            });

                            // グリッド行削除ボタンを非表示
                            $registForm.find('fieldset a.refer, input[type="button"].gridDelete').hide();

                            // グリッド列もロック
                            let gridDivs = $registForm.find('[id$=Grid]');
                            for (let i = 0; i < gridDivs.length; i++) {
                                let gridId = gridDivs[i].id;
                                Gridate.grids[gridId].getOptions()['editable'] = false;
                            }

                            // 転生可能
                            $registForm.find('a.reborner').button('option', 'disabled', false);

                            // 否認可能
                            let isReborned = false;
                            let rebornersDivs = $registForm.find('div.reborners');
                            if (rebornersDivs) {
                                let rebornersDiv = rebornersDivs[0];
                                if (rebornersDiv) {
                                    let grid = Gridate.grids[rebornersDiv.id];
                                    if (grid) {
                                        isReborned = grid.getData().getItems().length > 0;
                                    }
                                }
                            }
                            if (!isReborned) {
                                $registForm.find('button.forbid').button('option', 'disabled', false);
                            }

                            // 登録不可
                            $registForm.find('button.regist').button('option', 'disabled', true);

                            // 子モデル追加不可
                            $registForm.find('a.addChild').button('option', 'disabled', true);

                        } else if ($statusKb.val() == -1) {
                            /*
                             * 否認ステータス
                             */

                            // 削除可能
                            $registForm.find('button.delete').button('option', 'disabled', false);
                        }
                    }

                    // 出力権限があれば出力ボタンを活性
                    if ($registDt.val() != '' && Base.getAuthz($registForm[0].name) >= 2) {
                        $registForm.find('a.output').button('option', 'disabled', false);
                    }

                    // 更新権限がな伊場合
                    if (Base.getAuthz($registForm[0].name) < 3) {

                        // 画面をロック
                        $registForm.find('input, select, textarea').each(function() {
                            Base.readonly(this);
                        });

                        // グリッド行削除ボタンを非表示
                        $registForm.find('fieldset a.refer, input[type="button"].gridDelete').hide();

                        // グリッド列もロック
                        let gridDivs = $registForm.find('[id$=Grid]');
                        for (let i = 0; i < gridDivs.length; i++) {
                            let gridId = gridDivs[i].id;
                            Gridate.grids[gridId].getOptions()['editable'] = false;
                        }
                    }

                    //親モデルを読み取り専用
                    //        Base.readonly($dialogDiv.find('.parent').find('a,input,select,textarea'));
                    Base.readonly($registForm.find('.parent').find('a,input,select,textarea'));

                });
            });

        } else {

            // 詳細画面のステータス区分は選択項目名のみ表示（新規画面用に一旦やっておく）
            let $readonlys = $registForm.find('[name$="' + Casing.toCamel(columnStatus) + '"]');
            Base.readonly($readonlys);
        }
    },

    /**
     * 読み取り専用
     */
    readonly: function(item) {

        let $readonlys = $(item);
        $readonlys.attr('readonly', true).attr('tabindex', '-1').addClass('readonly');

        for (let i = 0; i < $readonlys.length; i++) {
            let $readonly = $($readonlys[i]);
            if ($readonly.prop('type') == 'checkbox' || $readonly.prop('type') == 'radio') {
                if (!$readonly.prop('checked')) {
                    $readonly.closest('label').css('display', 'none');
                } else {
                    $readonly.closest('label').css('display', 'inherit');
                }
            }
        }
    },

    /**
     * 書き込み可能
     */
    writable: function(item) {
        let $readonlys = $(item);
        $readonlys.removeAttr('readonly').removeAttr('tabindex').removeClass('readonly');
        for (let i = 0; i < $readonlys.length; i++) {
            let $readonly = $($readonlys[i]);
            if ($readonly.prop('type') == 'checkbox' || $readonly.prop('type') == 'radio') {
                $readonly.closest('label').css('display', 'inherit');
            }
        }
    },

    listReset: function(e) {
        if (Gridate.grids[e + 'Grid'].getDataLength() > 0) {
            $('[id="Search' + e + '"]').click();
        }
    },

    historyReason: function(me) {

        let reason = prompt('変更理由を入力してください。');
        if (reason) {
            let $form = $(me).closest('form');
            let name = Casing.toCamel(columnHistoryReason);
            $form.find('[name="' + name + '"]').remove();
            $form.append('<input type=\"hidden\" name=\"' + name + '\" value=\"' + reason + '\">');
        }
        return reason;
    },

};
