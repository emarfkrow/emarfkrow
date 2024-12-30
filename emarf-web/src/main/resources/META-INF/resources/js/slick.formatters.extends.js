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
 * SlickGridのformatter拡張
 *
 * @author golorp
 */

(function($) {

    $.extend(true, window, {
        "Slick": {
            "Formatters": {
                "Extends": {
                    "Button": ButtonFormatter,
                    "Choose": ChooseButtonFormatter,
                    "Delete": DeleteButtonFormatter,
                    "Date": DateFormatter,
                    "DateTime": DateTimeFormatter,
                    "Timestamp": TimestampFormatter,
                    "Link": LinkFormatter,
                    "Select": SelectFormatter,
                    "Checkbox": CheckboxFormatter,
                    "Comma": CommaFormatter,
                    "Dec1": Dec1Formatter,
                    "Dec2": Dec2Formatter,
                    "Dec3": Dec3Formatter,
                    "Refer": ReferFormatter,
                }
            }
        }
    });

    function ButtonFormatter(row, cell, value, columnDef, dataContext) {
        if (columnDef.label) {
            return '<input type="button" value="' + columnDef.label + '" class="gridButton" />';
        }
        return '<input type="button" value="' + columnDef.name + '" class="gridButton" />';
    }

    function ChooseButtonFormatter(row, cell, value, columnDef, dataContext) {
        if (!dataContext[gridOpeVisibleColumn]) {
            return null;
        }
        if (columnDef.label) {
            return '<input type="button" value="' + columnDef.label + '" class="gridButton gridChoose" />';
        }
        return '<input type="button" value="' + columnDef.name + '" class="gridButton gridChoose" />';
    }

    function DeleteButtonFormatter(row, cell, value, columnDef, dataContext) {
        if (columnDef.label) {
            return '<input type="button" value="' + columnDef.label + '" class="gridButton gridDelete" />';
        }
        return '<input type="button" value="' + columnDef.name + '" class="gridButton gridDelete" />';
    }

    function DateFormatter(row, cell, value, columnDef, dataContext) {
        if (!value) {
            return null;
        }
        return Formatter.Ymd(new Date(value));
    }

    function DateTimeFormatter(row, cell, value, columnDef, dataContext) {
        if (!value) {
            return null;
        }
        return Formatter.YmdHms(new Date(value));
    }

    function TimestampFormatter(row, cell, value, columnDef, dataContext) {
        if (!value) {
            return null;
        }
        return Formatter.YmdHmsS(new Date(value));
    }

    function LinkFormatter(row, cell, value, columnDef, dataContext) {
        if (!dataContext[gridOpeVisibleColumn]) {
            return null;
        }
        if (value) {
            return '<a id=\"' + columnDef.id + '\" href="" class="gridLink" target="blank">' + Messages['common.download'] + '</a>';
        }
        return '<a href="" class="gridLink">' + columnDef.name + '</a>';
    }

    function SelectFormatter(row, cell, value, columnDef, dataContext) {
        return columnDef.options[value];
    }

    function CheckboxFormatter(row, cell, value, columnDef, dataContext) {
        return '<img class="slick-edit-preclick" src="../images/' + (value == 1 ? "CheckboxY" : "CheckboxN") + '.png">';
    }

    function CommaFormatter(row, cell, value, columnDef, dataContext) {
        return Formatter.comma(value);
    }

    function Dec1Formatter(row, cell, value, columnDef, dataContext) {
        return Formatter.dec1(value);
    }

    function Dec2Formatter(row, cell, value, columnDef, dataContext) {
        return Formatter.dec2(value);
    }

    function Dec3Formatter(row, cell, value, columnDef, dataContext) {
        return Formatter.dec3(value);
    }

    function ReferFormatter(row, cell, value, columnDef, dataContext) {
        if (dataContext[columnDef.referField]) {
            return value + '：' + dataContext[columnDef.referField];
        }
        return value;
    }

})(jQuery);
