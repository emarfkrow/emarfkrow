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
 * 文字列のフォーマット処理
 *
 * @author golorp
 */

let Formatter = {

    comma: function(v) {
        if (v === undefined || v === null || v === '') { return ''; }
        // 整数と小数に分割
        var values = v.toString().split('.');
        // 整数部をフォーマット
        var s = values[0].replace(/(\d)(?=(\d\d\d)+(?!\d))/g, '$1,');
        // 小数があれば結合
        if (values.length > 1) { s += '.' + values[1]; }
        // マイナスならクラス設定
        if (v < 0) {
            return '<span class="minus">' + s + '</span>';
        }
        return s;
    },

    dec0: function(v) {
        if (v === undefined || v === null || v === '') { return ''; }
        var s = Number(v).toFixed(0);
        return Formatter.comma(s);
    },

    dec1: function(v) {
        if (v === undefined || v === null || v === '') { return ''; }
        var s = Number(v).toFixed(1);
        return Formatter.comma(s);
    },

    dec2: function(v) {
        if (v === undefined || v === null || v === '') { return ''; }
        var s = Number(v).toFixed(2);
        return Formatter.comma(s);
    },

    dec3: function(v) {
        if (v === undefined || v === null || v === '') { return ''; }
        var s = Number(v).toFixed(3);
        return Formatter.comma(s);
    },

    Ymd: function(date) {
        if (date && !isNaN(date.getFullYear())) {
            let y = date.getFullYear();
            let m = ('0' + (date.getMonth() + 1)).slice(-2);
            let d = ('0' + date.getDate()).slice(-2);
            return y + '-' + m + '-' + d;
        }
        return '';
    },

    YmdHm: function(date) {
        if (date && !isNaN(date.getFullYear())) {
            let y = date.getFullYear();
            let m = ('0' + (date.getMonth() + 1)).slice(-2);
            let d = ('0' + date.getDate()).slice(-2);
            let h = ('0' + date.getHours()).slice(-2);
            let mm = ('0' + date.getMinutes()).slice(-2);
            return y + '-' + m + '-' + d + ' ' + h + ':' + mm;
        }
        return '';
    },

    YmdHms: function(date) {
        if (date && !isNaN(date.getFullYear())) {
            let y = date.getFullYear();
            let m = ('0' + (date.getMonth() + 1)).slice(-2);
            let d = ('0' + date.getDate()).slice(-2);
            let h = ('0' + date.getHours()).slice(-2);
            let mm = ('0' + date.getMinutes()).slice(-2);
            let s = ('0' + date.getSeconds()).slice(-2);
            return y + '-' + m + '-' + d + ' ' + h + ':' + mm + ':' + s;
        }
        return '';
    },

    YmdHmsS: function(date) {
        if (date && !isNaN(date.getFullYear())) {
            let y = date.getFullYear();
            let m = ('0' + (date.getMonth() + 1)).slice(-2);
            let d = ('0' + date.getDate()).slice(-2);
            let h = ('0' + date.getHours()).slice(-2);
            let mm = ('0' + date.getMinutes()).slice(-2);
            let s = ('0' + date.getSeconds()).slice(-2);
            let S = ('00' + date.getMilliseconds()).slice(-3);
            return y + '-' + m + '-' + d + ' ' + h + ':' + mm + ':' + s + '.' + S;
        }
        return '';
    },

    YmdTHmsS: function(date) {
        if (date && !isNaN(date.getFullYear())) {
            let y = date.getFullYear();
            let m = ('0' + (date.getMonth() + 1)).slice(-2);
            let d = ('0' + date.getDate()).slice(-2);
            let h = ('0' + date.getHours()).slice(-2);
            let mm = ('0' + date.getMinutes()).slice(-2);
            let s = ('0' + date.getSeconds()).slice(-2);
            let S = ('00' + date.getMilliseconds()).slice(-3);
            return y + '-' + m + '-' + d + 'T' + h + ':' + mm + ':' + s + '.' + S;
        }
        return '';
    }
};

