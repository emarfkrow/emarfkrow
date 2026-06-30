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
 * オートコンプリート
 * 
 * $(document).on('focus', '.slick-cell.l0 .editor-text', function () {
 *     Complement.enable(this, './MstOpeDetailReferJson.ashx', 'OPE_DETAIL');
 * });
 */
var Complement = {

    enable: function(me, url, valueColumn, labelColumn, onSelect) {
        $(me).autocomplete(
            {
                //minLength: 2,
                source: function(req, resp) {

                    var formJson = {};
                    formJson['page'] = 0;
                    formJson['rows'] = 10;
                    //formJson['isSilent'] = 'true';
                    formJson[valueColumn] = $(me).val();

                    Ajaxize.ajaxPost(
                        url,
                        formJson,
                        function(DataSetJson) {
                            var dataJson = DataSetJson[url.replaceAll(/^.*\//g, '').replaceAll(/\..+$/g, '')];
                            var items = [];
                            for (var i in dataJson) {
                                var rowJson = dataJson[i];
                                var value = rowJson[valueColumn];
                                if (labelColumn) {
                                    var label = rowJson[labelColumn];
                                } else {
                                    var label = rowJson[valueColumn];
                                }
                                items.push({ value: value, label: label });
                            }
                            resp(items);
                        },
                        true,
                        true
                    );
                },
                select: function(e, ui) {
                    if (onSelect) {
                        onSelect(e, ui);
                    }
                }
            }
        );
    },

}

$(function() {
    $('.refer').each(function() {
        let url = $(this).attr('data-json');
        let src = $(this).attr('data-srcDef');
        if (url && src) {
            Complement.enable(this, './' + url, src.split(':')[0]);
        }
    });
});
