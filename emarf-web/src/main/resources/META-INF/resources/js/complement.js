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
                    formJson['page'] = 1;
                    formJson['rows'] = 10;
                    formJson['IsSilently'] = 1;
                    formJson[valueColumn] = $(me).val();

                    var formsJson = {};
                    formsJson['AutoCompleteForm'] = formJson;

                    Ajaxise.ajaxPostJson(url, formsJson, function(DataSetJson) {
                        var dataJson = DataSetJson['Table1'];
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
                    });
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
});
