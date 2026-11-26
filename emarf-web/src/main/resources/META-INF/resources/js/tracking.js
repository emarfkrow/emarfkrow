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
 * 時刻表
 *
 * @author golorp
 */
let Tracking = {

    tracks: {},

    isResized: false,

    /**
     * 合計時間を表示
     */
    calcTotalTime: function() {

        let $track = $('table.tracking');
        let $tbody = $track.find('tbody');
        let gridSize = $tbody.find('td')[0].clientHeight + 1;

        var panelsGridSize = 0;
        $track.find('.panel').each(function() {
            panelsGridSize += Math.round(this.offsetHeight / gridSize);
        });

        $track.find('td[id="totalTime"]').html((Math.round(panelsGridSize * 15 / 60 * 100) / 100).toFixed(2));
    },

    /**
     * 登録済みの作業パネルを取得
     */
    setWorkDate: function(date) {

        let $track = $('table.tracking');

        //年月日を設定
        var yyyy = date.getFullYear();
        var mm = ('0' + (date.getMonth() + 1)).slice(-2);
        var dd = ('0' + date.getDate()).slice(-2);
        $track.find('input[name="yyyy"]').val(yyyy);
        $track.find('input[name="mm"]').val(mm);
        $track.find('input[name="dd"]').val(dd);

        //全てのパネルを一旦削除
        $track.find('.panelWrapper').remove();

        let $form = $track.closest('form');
        let action = $form[0].action;
        let dataKey = action.replaceAll(/(^.+\/|\..+$)/g, '');

        let userId = $('span[id="authNKey"]').text();

        //作業報告を検索してパネルを表示
		Tracking.calcTotalTime();
        let formText = '{ "' + Tracking.tracks.ymdName + '" : ' + yyyy + mm + dd + ', "' + Tracking.tracks.userIdName + '" : ' + userId + ' }';
        let formJson = JSON.parse(formText);
        Ajaxize.ajaxPost(action, formJson, function(data) {
            if (data[dataKey]) {
                let tracks = Tracking.tracks.load(data[dataKey]);
                for (var i in tracks) {
                    var track = tracks[i];
                    Tracking.addPanel(track.id, track.bohm, track.eohm, track.comment, track.issueId, track.issueMei, track.opt);
                }
                Tracking.calcTotalTime();
            }
        }, null, true);
    },

    /**
     * 作業パネルを追加
     */
    addPanel: function(id, bohm, eohm, comment, issueId, issueMei, opt) {

        var $track = $('table.tracking');

        //開始・終了時刻から、始点と高さを取得
        var $tbody = $track.find('tbody');
        var tbody = $tbody[0];
        var boTd = $tbody.find('td[id="' + bohm + '"]')[0] || $tbody.find('td[id="0' + bohm + '"]')[0];
        var eoTd = $tbody.find('td[id="' + eohm + '"]')[0] || $tbody.find('td[id="0' + eohm + '"]')[0];
        var l = boTd.offsetLeft;
        var t = boTd.offsetTop - tbody.offsetTop;
        var h = eoTd.offsetTop - boTd.offsetTop;

        //時刻表にパネルを追加
        var panel = '<div class="panel" style="height: ' + h + 'px;" title="' + comment + '">';
        panel += '<input type="hidden" name="id" value="' + id + '" />';
        panel += '<input type="hidden" name="bohm" value="' + bohm + '" />';
        panel += '<input type="hidden" name="eohm" value="' + eohm + '" />';
        panel += '<input type="hidden" name="comment" value="' + comment + '" />';
        panel += '<input type="hidden" name="issueId" value="' + issueId + '" />';
        panel += '<span id="issueMei">' + issueMei + '</span>';
        panel += '<input type="hidden" name="opt" value="' + opt + '" />';
        panel += '</div>';
        $tbody.prepend('<div id="panel_' + id + '" class="panelWrapper" style="left: ' + l + 'px; top: ' + t + 'px;">' + panel + '</div>');

        //パネルにリサイズプラグインを設定
        let gridSize = $tbody.find('td')[0].clientHeight + 1;
        $track.find('.panel').resizable({
            grid: gridSize,
            stop: function(event, ui) {

                // ドラッグ終了時のダイアログ抑止
                Tracking.isResized = true;

                var id = $(this).find('[name="id"]').val();

                // パネルのサイズから終了時刻を評価
                var grids = Math.round(ui.size.height / gridSize, 0);
                var gridMinutes = grids * 15;
                var bohm = $(this).find('[name="bohm"]').val();
                var bohms = bohm.split(':');
                var eoDate = new Date();
                eoDate.setHours(bohms[0]);
                eoDate.setMinutes(bohms[1] * 1 + gridMinutes);
                var eoMinutes = Math.round(eoDate.getMinutes() / 15) * 15;
                var eohm = ('0' + eoDate.getHours()).slice(-2) + ':' + ('0' + eoMinutes).slice(-2);
                $(this).find('[name="eohm"]').val(eohm);

                var opt = $(this).find('[name="opt"]').val();

                var json = '{ "' + Tracking.tracks.idName + '": ' + id + ', "' + Tracking.tracks.eohmName + '": "' + eohm + '", "' + Tracking.tracks.optName + '": "' + opt + '" }';

                //終了日時を登録
                var entityName = Casing.toPascal(Tracking.tracks.tableName);
                let action = '../model/' + entityName + 'Adjust.ajax';
                Ajaxize.ajaxPost(action, JSON.parse(json), function(data) { Tracking.calcTotalTime(); });
            }
        });

        Tracking.calcTotalTime();
    }

};

/**
 * 初期化処理
 */
$(function() {

    $('table.tracking').each(function() {

        // 時刻表を出力して開始時刻までスクロール
        let $track = $(this);
        let $tbody = $track.find('tbody');
        for (var h = 0;h < 24;h++) {
            var hh = ('0' + h).slice(-2);
            var trs = '<tr><th rowspan="4">' + hh + ':00</th><td id="' + hh + ':00"></td></tr>';
            trs += '<tr><td id="' + hh + ':15"></td></tr>';
            trs += '<tr><td id="' + hh + ':30"></td></tr>';
            trs += '<tr><td id="' + hh + ':45"></td></tr>';
            $tbody.append(trs);
        }
        $tbody.scrollTop($('[id="08:00"]')[0].offsetTop - $tbody[0].offsetTop);

        /**
         * 前日リンク押下
         */
        $track.find('a.trackPrevDay').on('click', function() {
            var yyyy = $track.find('input[name="yyyy"]').val();
            var m = $track.find('input[name="mm"]').val() * 1;
            var d = $track.find('input[name="dd"]').val() * 1;
            var date = new Date(yyyy, m - 1, d - 1);
            Tracking.setWorkDate(date);
        });

        /**
         * 日付変更
         */
        $track.find('input[name="yyyy"], input[name="mm"], input[name="dd"]').on('change', function() {
            var yyyy = $track.find('input[name="yyyy"]').val();
            var m = $track.find('input[name="mm"]').val() * 1;
            var d = $track.find('input[name="dd"]').val() * 1;
            var date = new Date(yyyy, m - 1, d);
            Tracking.setWorkDate(date);
        });

        /**
         * 翌日リンク押下
         */
        $track.find('a.trackNextDay').on('click', function() {
            var yyyy = $track.find('input[name="yyyy"]').val();
            var m = $track.find('input[name="mm"]').val() * 1;
            var d = $track.find('input[name="dd"]').val() * 1;
            var date = new Date(yyyy, m - 1, d + 1);
            Tracking.setWorkDate(date);
        });

        /**
         * 更新ボタン押下
         */
        $track.find('button#SearchTracks').on('click', function() {
            var yyyy = $track.find('input[name="yyyy"]').val();
            var m = $track.find('input[name="mm"]').val() * 1;
            var d = $track.find('input[name="dd"]').val() * 1;
            var date = new Date(yyyy, m - 1, d);
            Tracking.setWorkDate(date);
        });

        // 年月日にシステム日付を設定
        Tracking.setWorkDate(new Date());

        /**
         * 時刻表クリック：作業報告追加
         */
        $(document).on('click', 'table.tracking tbody td', function() {

            var $track = $(this).closest('table.tracking');
            var $tbody = $track.find('tbody');

            var yyyy = $track.find('[name="yyyy"]').val();
            var mm = $track.find('[name="mm"]').val();
            var dd = $track.find('[name="dd"]').val();

            var bohm = this.id;

            var $tds = $tbody.find('td');
            var j = $tds.index(this) + 1;
            var next = $tds[j];
            var eohm = next.id;

            //時刻表にパネル追加
            Tracking.addPanel('', bohm, eohm, '', '', '');

            var entityName = Casing.toPascal(Tracking.tracks.tableName);
            var ymdName = Casing.toCamel(Tracking.tracks.ymdName);
            var bohmName = Casing.toCamel(Tracking.tracks.bohmName);
            var eohmName = Casing.toCamel(Tracking.tracks.eohmName);

            var qs = '?anew&' +
                entityName + '.' + ymdName + '=' + yyyy + mm + dd + '&' +
                entityName + '.' + bohmName + '=' + bohm + '&' +
                entityName + '.' + eohmName + '=' + eohm;

            //別ウィンドウにするためwidth/heightを指定
            let w = window.outerWidth / 3 * 2;
            let h = window.outerHeight / 3 * 2;
            let t = window.screenTop + (window.innerHeight / 2) - (h / 2);
            let l = window.screenLeft + (window.innerWidth / 2) - (w / 2);
            window.open('../model/' + entityName + '.html' + qs, entityName + qs, 'width=' + w + 'px,height=' + h + 'px,top=' + t + 'px,left=' + l + 'px');
        });

        /**
         * 作業報告クリック：作業報告照会
         */
        $(document).on('click', 'table.tracking .panel', function() {

            if (Tracking.isResized == true) {
                Tracking.isResized = false;
                return;
            }

            //クリックしたパネルの日報ID・チケットID・開始時刻・終了時刻を取得
            var $panel = $(this);
            var id = $panel.find('[name="id"]').val();

            var entityName = Casing.toPascal(Tracking.tracks.tableName);
            var idName = Casing.toCamel(Tracking.tracks.idName);
            var qs = '?' + entityName + '.' + idName + '=' + id;

            //別ウィンドウにするためwidth/heightを指定
            let w = window.outerWidth / 3 * 2;
            let h = window.outerHeight / 3 * 2;
            let t = window.screenTop + (window.innerHeight / 2) - (h / 2);
            let l = window.screenLeft + (window.innerWidth / 2) - (w / 2);
            window.open('../model/' + entityName + '.html' + qs, entityName + qs, 'width=' + w + 'px,height=' + h + 'px,top=' + t + 'px,left=' + l + 'px');
        });
    });

});
