/**
 * SlickGridのformatter拡張
 *
 * @author toshiyuki
 */

(function($) {

	$.extend(true, window, {
		"Slick": {
			"Formatters": {
				"Extends": {
					"Button": ButtonFormatter,
					"DateTime": DateTimeFormatter,
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

	function DateTimeFormatter(row, cell, value, columnDef, dataContext) {
		return Formatter.YmdHmsS(new Date(value));
	}

	function LinkFormatter(row, cell, value, columnDef, dataContext) {
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
