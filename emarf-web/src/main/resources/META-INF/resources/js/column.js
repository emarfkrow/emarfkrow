/**
 * SlickGridのcolumn定義
 *
 * @author toshiyuki
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
		return column;
	},

	refer: function(field, fieldMei, width, cssClass, referField) {
		let column = Column.cell(field, fieldMei, width, cssClass);
		column.referField = referField;
		column.formatter = Slick.Formatters.Extends.Refer;
		return column;
	},

	text: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.cell(field, fieldMei, width, cssClass, formatter);
		if (validator) { column.validator = validator; }
		column.editor = Slick.Editors.Text;
		return column;
	},

	comma: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.cell(field, fieldMei, width, cssClass, formatter);
		if (validator) { column.validator = validator; }
		column.editor = Slick.Editors.Extends.Comma;
		column.formatter = Slick.Formatters.Extends.Comma;
		column.cssClass += ' right';
		return column;
	},

	dec1: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.cell(field, fieldMei, width, cssClass, formatter);
		if (validator) { column.validator = validator; }
		column.editor = Slick.Editors.Extends.Dec1;
		column.formatter = Slick.Formatters.Extends.Dec1;
		column.cssClass += ' right';
		return column;
	},

	dec2: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.cell(field, fieldMei, width, cssClass, formatter);
		if (validator) { column.validator = validator; }
		column.editor = Slick.Editors.Extends.Dec2;
		column.formatter = Slick.Formatters.Extends.Dec2;
		column.cssClass += ' right';
		return column;
	},

	dec3: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.cell(field, fieldMei, width, cssClass, formatter);
		if (validator) { column.validator = validator; }
		column.editor = Slick.Editors.Extends.Dec3;
		column.formatter = Slick.Formatters.Extends.Dec3;
		column.cssClass += ' right';
		return column;
	},

	longText: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
		column.editor = Slick.Editors.LongText;
		return column;
	},

	dateTime: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
		column.editor = Slick.Editors.Extends.DateTime;
		column.formatter = Slick.Formatters.Extends.DateTime;
		return column;
	},

	date: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
		column.editor = Slick.Editors.Extends.Date;
		return column;
	},

	time: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
		column.editor = Slick.Editors.Extends.Time;
		return column;
	},

	month: function(field, fieldMei, width, cssClass, formatter, validator) {
		let column = Column.text(field, fieldMei, width, cssClass, formatter, validator);
		column.editor = Slick.Editors.Extends.Month;
		return column;
	},

	link: function(field, fieldMei, width, cssClass, formatter) {
		let column = Column.cell(field, fieldMei, width, cssClass, formatter);
		column.formatter = Slick.Formatters.Extends.Link;
		return column;
	},

	check: function(field, fieldMei, width, cssClass) {
		let column = Column.cell(field, fieldMei, width, cssClass);
		column.editor = Slick.Editors.Extends.Checkbox;
		column.formatter = Slick.Formatters.Extends.Checkbox;
		return column;
	},

	select: function(field, fieldMei, width, cssClass, options) {
		let column = Column.cell(field, fieldMei, width, cssClass);
		column.editor = Slick.Editors.Extends.Select;
		column.formatter = Slick.Formatters.Extends.Select;

		// 条件が揃っている場合は、サーバから選択項目を取得
		let json = options['json'];
		let paramkey = options['paramkey'];
		let value = options['value'];
		let label = options['label'];
		if (json && paramkey && value && label) {
			let postJson = {};
			postJson[paramkey] = field.toLowerCase();

			let k = json + JSON.stringify(postJson);
			if (!sessionStorage[k]) {
				Ajaxize.sjaxPost(json, postJson, function(data) {
					for (let i in data) {
						if (i == 'INFO') {
							break;
						}
						sessionStorage[k] = JSON.stringify(data[i]);
					}
				}, false, true);
			}
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
				if (column.width < l.length * 30) {
					column.width = l.length * 30;
				}
			}
			//			}
			//			}, false, true);
		}
		column.options = options;

		return column;
	},

};
