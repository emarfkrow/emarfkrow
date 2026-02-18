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
 * SlickGridのcolumn定義
 *
 * @author golorp
 */

let Column = {

    cell: function(field, fieldMei, width, cssClass, formatter) {
        let column = {};
        column.id = Casing.toCamel(field);
        column.field = field;
        column.name = fieldMei;
        column.sortable = true;
        if (width) { column.width = width; }
        if (cssClass) { column.cssClass = cssClass; }
        if (formatter) { column.formatter = formatter; }
        //console.debug('Messages[' + column.id + ']: ' + fieldMei);
        return column;
    },

    refer: function(field, fieldMei, width, cssClass, referField) {
        let column = Column.cell(field, fieldMei, width, cssClass);
        column.referField = referField;
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Text;
        column.formatter = Slick.Formatters.Extends.Refer;
        return column;
    },

    text: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.cell(field, fieldMei, width, cssClass, formatter);
        if (validator) { column.validator = validator; }
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Text;
        return column;
    },

    comma: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.cell(field, fieldMei, width, cssClass, formatter);
        if (validator) { column.validator = validator; }
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Comma;
        column.formatter = Slick.Formatters.Extends.Comma;
        if (cssClass) {
            column.cssClass += ' right';
        } else {
            column.cssClass = ' right';
        }
        return column;
    },

    dec1: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.cell(field, fieldMei, width, cssClass, formatter);
        if (validator) { column.validator = validator; }
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Dec1;
        column.formatter = Slick.Formatters.Extends.Dec1;
        if (cssClass) {
            column.cssClass += ' right';
        } else {
            column.cssClass = ' right';
        }
        return column;
    },

    dec2: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.cell(field, fieldMei, width, cssClass, formatter);
        if (validator) { column.validator = validator; }
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Dec2;
        column.formatter = Slick.Formatters.Extends.Dec2;
        if (cssClass) {
            column.cssClass += ' right';
        } else {
            column.cssClass = ' right';
        }
        return column;
    },

    dec3: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.cell(field, fieldMei, width, cssClass, formatter);
        if (validator) { column.validator = validator; }
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Dec3;
        column.formatter = Slick.Formatters.Extends.Dec3;
        if (cssClass) {
            column.cssClass += ' right';
        } else {
            column.cssClass = ' right';
        }
        return column;
    },

    longText: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.LongText;
        return column;
    },

    dateTime: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.DateTime;
        column.formatter = Slick.Formatters.Extends.DateTime;
        return column;
    },

    date: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Date;
        return column;
    },

    date8: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Date8;
        return column;
    },

    time: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Time;
        return column;
    },

    month: function(field, fieldMei, width, cssClass, formatter, validator) {
        let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Month;
        return column;
    },

    link: function(field, fieldMei, width, cssClass, formatter) {
        let column = Column.cell(field, fieldMei, width, cssClass, formatter);
        column.formatter = Slick.Formatters.Extends.Link;
        return column;
    },

    check: function(field, fieldMei, width, cssClass) {
        let column = Column.cell(field, fieldMei, width, cssClass);
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Checkbox;
        column.formatter = Slick.Formatters.Extends.Checkbox;
        return column;
    },

    select: function(field, fieldMei, width, cssClass, options) {
        let column = Column.cell(field, fieldMei, width, cssClass);
        if (cssClass.indexOf('readonly') < 0) column.editor = Slick.Editors.Extends.Select;
        column.formatter = Slick.Formatters.Extends.Select;

        // 条件が揃っている場合は、サーバから選択項目を取得
        let json = options['json'];
        let paramkey = options['paramkey'];
        let value = options['value'];
        let label = options['label'];
        if (json && paramkey && value && label) {
            let postJson = {};
            //postJson[paramkey] = field.toLowerCase();
            postJson[paramkey] = field;

            let k = json + JSON.stringify(postJson);
            if (!sessionStorage[k]) {
                console.debug('Column.select get [' + json + '].');
                Ajaxize.sjaxPost(json, postJson, function(data) {
                    for (let i in data) {
                        if (i == 'INFO' || i == 'ERROR') {
                            break;
                        }
                        sessionStorage[k] = JSON.stringify(data[i]);
                    }
                }, false, true);
            }

            if (sessionStorage[k]) {

                let dataJson = JSON.parse(sessionStorage[k]);

                //			Ajaxize.sjaxPost(json, postJson, function(data) {
                options = {};
                //			for (let i in data) {
                //				if (i == 'INFO') {
                //					break;
                //				}
                //				let dataJson = data[i];
                for (let j in dataJson) {
                    let row = dataJson[j];
                    let v = row[value];
                    let l = row[label];
                    options[v] = l;
                    if (column.width < l.bytes() * 10) {
                        column.width = l.bytes() * 10;
                    }
                }
                //			}
                //			}, false, true);
            }
        }
        column.options = options;

        return column;
    },

};
