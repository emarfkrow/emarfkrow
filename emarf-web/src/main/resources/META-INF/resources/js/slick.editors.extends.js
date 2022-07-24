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
 * SlickGridのeditor拡張
 *
 * @author golorp
 */

(function($) {

	$.extend(true, window, {
		"Slick": {
			"Editors": {
				"Extends": {
					"Date": DateEditor,
					"Month": MonthEditor,
					"DateTime": DateTimeEditor,
					"Time": TimeEditor,
					"Select": SelectEditor,
					"Checkbox": CheckboxEditor,
					"Dec1": Dec1Editor,
					"Dec2": Dec2Editor,
					"Dec3": Dec3Editor,
				}
			}
		}
	});

	function handleKeydownLRNav(e) {
		var cursorPosition = this.selectionStart;
		var textLength = this.value.length;
		if ((e.keyCode === Slick.keyCode.LEFT && cursorPosition > 0) ||
			e.keyCode === Slick.keyCode.RIGHT && cursorPosition < textLength - 1) {
			e.stopImmediatePropagation();
		}
	}

	function handleKeydownLRNoNav(e) {
		if (e.keyCode === Slick.keyCode.LEFT || e.keyCode === Slick.keyCode.RIGHT) {
			e.stopImmediatePropagation();
		}
	}

	function DateEditor(args) {
		var $input;
		var defaultValue;
		var scope = this;
		this.args = args;

		this.init = function() {
			var navOnLR = args.grid.getOptions().editorCellNavOnLRKeys;
			$input = $("<INPUT type=date class='editor-text' />")
				.appendTo(args.container)
				.on("keydown.nav", navOnLR ? handleKeydownLRNav : handleKeydownLRNoNav)
				.focus()
				.select();

			// don't show Save/Cancel when it's a Composite Editor and also trigger a onCompositeEditorChange event when input changes
			if (args.compositeEditorOptions) {
				$input.on("change", function() {
					var activeCell = args.grid.getActiveCell();

					// when valid, we'll also apply the new value to the dataContext item object
					if (scope.validate().valid) {
						scope.applyValue(scope.args.item, scope.serializeValue());
					}
					scope.applyValue(scope.args.compositeEditorOptions.formValues, scope.serializeValue());
					args.grid.onCompositeEditorChange.notify({ row: activeCell.row, cell: activeCell.cell, item: scope.args.item, column: scope.args.column, formValues: scope.args.compositeEditorOptions.formValues });
				});
			}
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";

			// 8桁日付の場合
			if (defaultValue.toString().match(/^[0-9]{8}$/)) {
				defaultValue = defaultValue.toString().replace(/([0-9]{4})([0-9]{2})([0-9]{2})/, '$1-$2-$3');
			}

			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {

			// 8桁日付の場合
			state = state.replace(/-/g, '');

			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() === "" && defaultValue == null)) && ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val(), args);
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

	function MonthEditor(args) {
		var $input;
		var defaultValue;
		var scope = this;
		this.args = args;

		this.init = function() {
			var navOnLR = args.grid.getOptions().editorCellNavOnLRKeys;
			$input = $("<INPUT type=month class='editor-text' />")
				.appendTo(args.container)
				.on("keydown.nav", navOnLR ? handleKeydownLRNav : handleKeydownLRNoNav)
				.focus()
				.select();

			// don't show Save/Cancel when it's a Composite Editor and also trigger a onCompositeEditorChange event when input changes
			if (args.compositeEditorOptions) {
				$input.on("change", function() {
					var activeCell = args.grid.getActiveCell();

					// when valid, we'll also apply the new value to the dataContext item object
					if (scope.validate().valid) {
						scope.applyValue(scope.args.item, scope.serializeValue());
					}
					scope.applyValue(scope.args.compositeEditorOptions.formValues, scope.serializeValue());
					args.grid.onCompositeEditorChange.notify({ row: activeCell.row, cell: activeCell.cell, item: scope.args.item, column: scope.args.column, formValues: scope.args.compositeEditorOptions.formValues });
				});
			}
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() === "" && defaultValue == null)) && ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val(), args);
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

	function DateTimeEditor(args) {
		var $input;
		var defaultValue;
		var scope = this;
		this.args = args;

		this.init = function() {
			var navOnLR = args.grid.getOptions().editorCellNavOnLRKeys;
			$input = $("<INPUT type=datetime-local class='editor-text' />")
				.appendTo(args.container)
				.on("keydown.nav", navOnLR ? handleKeydownLRNav : handleKeydownLRNoNav)
				.focus()
				.select();

			// don't show Save/Cancel when it's a Composite Editor and also trigger a onCompositeEditorChange event when input changes
			if (args.compositeEditorOptions) {
				$input.on("change", function() {
					var activeCell = args.grid.getActiveCell();

					// when valid, we'll also apply the new value to the dataContext item object
					if (scope.validate().valid) {
						scope.applyValue(scope.args.item, scope.serializeValue());
					}
					scope.applyValue(scope.args.compositeEditorOptions.formValues, scope.serializeValue());
					args.grid.onCompositeEditorChange.notify({ row: activeCell.row, cell: activeCell.cell, item: scope.args.item, column: scope.args.column, formValues: scope.args.compositeEditorOptions.formValues });
				});
			}
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";
			//$input.val(defaultValue);
			//$input[0].defaultValue = defaultValue;
			$input.val(Formatter.YmdTHmsS(new Date(defaultValue)));
			$input[0].defaultValue = Formatter.YmdTHmsS(new Date(defaultValue));
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() === "" && defaultValue == null)) && ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val(), args);
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

	function TimeEditor(args) {
		var $input;
		var defaultValue;
		var scope = this;
		this.args = args;

		this.init = function() {
			var navOnLR = args.grid.getOptions().editorCellNavOnLRKeys;
			$input = $("<INPUT type=time class='editor-text' />")
				.appendTo(args.container)
				.on("keydown.nav", navOnLR ? handleKeydownLRNav : handleKeydownLRNoNav)
				.focus()
				.select();

			// don't show Save/Cancel when it's a Composite Editor and also trigger a onCompositeEditorChange event when input changes
			if (args.compositeEditorOptions) {
				$input.on("change", function() {
					var activeCell = args.grid.getActiveCell();

					// when valid, we'll also apply the new value to the dataContext item object
					if (scope.validate().valid) {
						scope.applyValue(scope.args.item, scope.serializeValue());
					}
					scope.applyValue(scope.args.compositeEditorOptions.formValues, scope.serializeValue());
					args.grid.onCompositeEditorChange.notify({ row: activeCell.row, cell: activeCell.cell, item: scope.args.item, column: scope.args.column, formValues: scope.args.compositeEditorOptions.formValues });
				});
			}
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() === "" && defaultValue == null)) && ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val(), args);
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

	function Dec1Editor(args) {
		var $input;
		var defaultValue;
		var scope = this;
		this.args = args;

		this.init = function() {
			var navOnLR = args.grid.getOptions().editorCellNavOnLRKeys;
			$input = $("<INPUT type=number class='editor-text right' step=0.1 />")
				.appendTo(args.container)
				.on("keydown.nav", navOnLR ? handleKeydownLRNav : handleKeydownLRNoNav)
				.focus()
				.select();

			// don't show Save/Cancel when it's a Composite Editor and also trigger a onCompositeEditorChange event when input changes
			if (args.compositeEditorOptions) {
				$input.on("change", function() {
					var activeCell = args.grid.getActiveCell();

					// when valid, we'll also apply the new value to the dataContext item object
					if (scope.validate().valid) {
						scope.applyValue(scope.args.item, scope.serializeValue());
					}
					scope.applyValue(scope.args.compositeEditorOptions.formValues, scope.serializeValue());
					args.grid.onCompositeEditorChange.notify({ row: activeCell.row, cell: activeCell.cell, item: scope.args.item, column: scope.args.column, formValues: scope.args.compositeEditorOptions.formValues });
				});
			}
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() === "" && defaultValue == null)) && ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val(), args);
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

	function Dec2Editor(args) {
		var $input;
		var defaultValue;
		var scope = this;
		this.args = args;

		this.init = function() {
			var navOnLR = args.grid.getOptions().editorCellNavOnLRKeys;
			$input = $("<INPUT type=number class='editor-text right' step=0.01 />")
				.appendTo(args.container)
				.on("keydown.nav", navOnLR ? handleKeydownLRNav : handleKeydownLRNoNav)
				.focus()
				.select();

			// don't show Save/Cancel when it's a Composite Editor and also trigger a onCompositeEditorChange event when input changes
			if (args.compositeEditorOptions) {
				$input.on("change", function() {
					var activeCell = args.grid.getActiveCell();

					// when valid, we'll also apply the new value to the dataContext item object
					if (scope.validate().valid) {
						scope.applyValue(scope.args.item, scope.serializeValue());
					}
					scope.applyValue(scope.args.compositeEditorOptions.formValues, scope.serializeValue());
					args.grid.onCompositeEditorChange.notify({ row: activeCell.row, cell: activeCell.cell, item: scope.args.item, column: scope.args.column, formValues: scope.args.compositeEditorOptions.formValues });
				});
			}
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() === "" && defaultValue == null)) && ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val(), args);
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

	function Dec3Editor(args) {
		var $input;
		var defaultValue;
		var scope = this;
		this.args = args;

		this.init = function() {
			var navOnLR = args.grid.getOptions().editorCellNavOnLRKeys;
			$input = $("<INPUT type=number class='editor-text right' step=0.001 />")
				.appendTo(args.container)
				.on("keydown.nav", navOnLR ? handleKeydownLRNav : handleKeydownLRNoNav)
				.focus()
				.select();

			// don't show Save/Cancel when it's a Composite Editor and also trigger a onCompositeEditorChange event when input changes
			if (args.compositeEditorOptions) {
				$input.on("change", function() {
					var activeCell = args.grid.getActiveCell();

					// when valid, we'll also apply the new value to the dataContext item object
					if (scope.validate().valid) {
						scope.applyValue(scope.args.item, scope.serializeValue());
					}
					scope.applyValue(scope.args.compositeEditorOptions.formValues, scope.serializeValue());
					args.grid.onCompositeEditorChange.notify({ row: activeCell.row, cell: activeCell.cell, item: scope.args.item, column: scope.args.column, formValues: scope.args.compositeEditorOptions.formValues });
				});
			}
		};

		this.destroy = function() {
			$input.remove();
		};

		this.focus = function() {
			$input.focus();
		};

		this.getValue = function() {
			return $input.val();
		};

		this.setValue = function(val) {
			$input.val(val);
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field] || "";
			$input.val(defaultValue);
			$input[0].defaultValue = defaultValue;
			$input.select();
		};

		this.serializeValue = function() {
			return $input.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (!($input.val() === "" && defaultValue == null)) && ($input.val() != defaultValue);
		};

		this.validate = function() {
			if (args.column.validator) {
				var validationResults = args.column.validator($input.val(), args);
				if (!validationResults.valid) {
					return validationResults;
				}
			}

			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

	function SelectEditor(args) {

		var $select;
		var defaultValue;
		var scope = this;

		this.init = function() {
			var option = "<OPTION value=''></OPTION>";
			for (let v in args.column.options) {
				let l = args.column.options[v];
				option += "<OPTION value='" + v + "'>" + l + "</OPTION>";
			}
			$select = $("<SELECT tabIndex='0' class='editor-select'>" + option + "</SELECT>");
			$select.appendTo(args.container);
			$select.focus();
		};

		this.destroy = function() {
			$select.remove();
		};

		this.focus = function() {
			$select.focus();
		};

		this.loadValue = function(item) {
			defaultValue = item[args.column.field];
			$select.val(defaultValue);
		};

		this.serializeValue = function() {
			return $select.val();
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return ($select.val() != defaultValue);
		};

		this.validate = function() {
			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

	function CheckboxEditor(args) {
		var $select;
		var defaultValue;
		var scope = this;
		this.args = args;

		this.init = function() {
			$select = $("<INPUT type=checkbox value='1' class='editor-checkbox' hideFocus>");
			$select.appendTo(args.container);
			$select.focus();

			// trigger onCompositeEditorChange event when input checkbox changes and it's a Composite Editor
			if (args.compositeEditorOptions) {
				$select.on("change", function() {
					var activeCell = args.grid.getActiveCell();

					// when valid, we'll also apply the new value to the dataContext item object
					if (scope.validate().valid) {
						scope.applyValue(scope.args.item, scope.serializeValue());
					}
					scope.applyValue(scope.args.compositeEditorOptions.formValues, scope.serializeValue());
					args.grid.onCompositeEditorChange.notify({ row: activeCell.row, cell: activeCell.cell, item: scope.args.item, column: scope.args.column, formValues: scope.args.compositeEditorOptions.formValues });
				});
			}
		};

		this.destroy = function() {
			$select.remove();
		};

		this.focus = function() {
			$select.focus();
		};

		this.loadValue = function(item) {
			defaultValue = !!item[args.column.field];
			if (defaultValue) {
				$select.prop('checked', true);
			} else {
				$select.prop('checked', false);
			}
		};

		this.preClick = function() {
			$select.prop('checked', !$select.prop('checked'));
		};

		this.serializeValue = function() {
			return $select.prop('checked') * 1;
		};

		this.applyValue = function(item, state) {
			item[args.column.field] = state;
		};

		this.isValueChanged = function() {
			return (this.serializeValue() !== defaultValue);
		};

		this.validate = function() {
			return {
				valid: true,
				msg: null
			};
		};

		this.init();
	}

})(jQuery);
