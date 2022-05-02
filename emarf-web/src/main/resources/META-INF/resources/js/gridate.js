/**
 * SlickGrid制御
 *
 * @author toshiyuki
 */

$(function() {

	console.debug('Gridate init.');

	// グリッドからフォーカスアウト時はグリッドを確定
	$(document).on('click', '*', function(event) {

		// クリックした要素を取得
		var $target = $(event.target);

		// slick-pane内でなければ各グリッドを確定
		if ($target.closest('.slick-pane').length == 0) {
			Slick.GlobalEditorLock.commitCurrentEdit();
		}
		//        // datepicker操作時は何もしない
		//        if ($target.closest('.ui-datepicker-header').length > 0) {
		//        }
	});

	Base.loaded(function() {

		// グリッドごとにループ
		$('[id$=Grid]').each(function() {

			// グリッドid
			let $gridDiv = $(this);

			// グリッドdivのid
			let divId = this.id;

			// グリッドIDを取得
			let gridId = divId;

			let $dialog = $gridDiv.parents('[role="dialog"]');
			if ($dialog.length > 0) {
				let $gridForm = $gridDiv.parent('form');
				let gridFormName = $gridForm.attr('name');
				let searchFormName = gridFormName.replace(/SRegist/, 'Search');
				let $searchForm = $dialog.find('form[name="' + searchFormName + '"]');
				let $searchButton = $searchForm.find('[data-gridId="' + divId + '"]');

				//ダイアログ内のグリッドならダイアログIDを接頭
				gridId = $dialog.attr('aria-describedby') + '.' + divId;

				//グリッドdivのidを変更
				this.id = gridId

				// 検索ボタンの対象グリッドIDも変更
				$searchButton.attr('data-gridId', gridId);
			}

			// divの属性からselectionModeを取得
			let selectionMode = $gridDiv.attr('data-selectionMode');

			/*
			 * columnsのjsをget
			 */

			//カラム定義を取得（パスが跨る時に動かないため廃止）
			//$.getScript('./' + divId + 'Columns.js', function() {

			let gridColumns = eval(divId + 'Columns');

			var columns = $.extend(true, [], gridColumns);

			let isDialog = $gridDiv.closest('[role=dialog]').length > 0;

			let frozenColumnAdd = 0;

			let checkboxSelectColumn;

			if (selectionMode == 'checkbox') {
				// チェックボックスでの行選択の場合（検索画面の場合）

				if (isDialog) {
					// ダイアログなら選択ボタンを追加
					columns.unshift({
						id: 'button',
						name: Messages['common.grid.button.title'],
						field: 'field',
						sortable: true,
						width: Messages['common.grid.button.title'].length * 20,
						label: Messages['common.grid.button.label'],
						formatter: Slick.Formatters.Extends.Button
					});
					++frozenColumnAdd;
				} else {
					// ダイアログでなければ（親画面なら）詳細リンク列を追加
					columns.unshift({
						id: 'link',
						name: Messages['common.grid.link.title'],
						field: 'field',
						sortable: true,
						width: Messages['common.grid.link.title'].length * 20,
						label: Messages['common.grid.link.label'],
						formatter: Slick.Formatters.Extends.Link
					});
					++frozenColumnAdd;
				}

				// checkbox指定で、ダイアログ内でないなら、最左列にチェックボックス列を追加
				if (!isDialog) {
					checkboxSelectColumn = new Slick.CheckboxSelectColumn();
					columns.unshift(checkboxSelectColumn.getColumnDefinition());
					++frozenColumnAdd;
				}

			} else if (selectionMode == 'link') {
				// リンクでの行選択の場合（詳細画面の場合）

				// 最左列に詳細リンク列を追加
				columns.unshift({
					id: 'link',
					name: Messages['common.grid.link.title'],
					field: 'field',
					sortable: true,
					width: Messages['common.grid.link.title'].length * 20,
					label: Messages['common.grid.link.label'],
					formatter: Slick.Formatters.Extends.Link
				});
				++frozenColumnAdd;
			}

			/*
			 * options
			 */

			let options = $.extend(true, {}, Gridate.options);

			// 新規行有無
			let editable = $gridDiv.attr('data-editable');
			if (editable) {
				options.editable = eval(editable);
			}

			// 新規行有無
			let addRow = $gridDiv.attr('data-addRow');
			if (addRow) {
				options.enableAddRow = eval(addRow);
			}

			// 固定列（ダイアログ内で固定すると崩れる）
			let frozenColumn = $gridDiv.attr('data-frozenColumn');
			if (frozenColumn) {
				if (!isDialog) {
					options.frozenColumn = (frozenColumn * 1) + frozenColumnAdd;
				}
			}

			let grid = new Slick.Grid($gridDiv, [], columns, options);
			Gridate.grids[gridId] = grid;

			/*
			 * selectionMode
			 */

			if (selectionMode == 'checkbox' && !isDialog) {
				// 行選択チェックボックス
				grid.registerPlugin(checkboxSelectColumn);
				grid.setSelectionModel(new Slick.RowSelectionModel({ selectActiveRow: false }));
			} else if (selectionMode == 'row') {
				// 行選択モード
				grid.setSelectionModel(new Slick.RowSelectionModel());
			} else {
				// セル選択モード
				grid.setSelectionModel(new Slick.CellSelectionModel());
			}

			/*
			 * subscribe
			 */

			//				grid.onActiveCellChanged.subscribe(function(e, args) {
			//					console.debug(e);
			//					console.debug(args);
			//				});
			//              grid.onActiveCellPositionChanged.subscribe(function(a,b,c,d,e,f,g) {});
			grid.onAddNewRow.subscribe(function(e, args) {
				let data = args.grid.getData();
				data.push(args.item);
				args.grid.invalidateRow(data.length - 1);
				args.grid.updateRowCount();
				args.grid.render();
			});
			//				grid.onAutosizeColumns.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeAppendCell.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeCellEditorDestroy.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeColumnsResize.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeDestroy.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeEditCell.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeFooterRowCellDestroy.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeHeaderCellDestroy.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeHeaderRowCellDestroy.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeSetColumns.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onBeforeSort.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onCellChange.subscribe(function(e, args) {
			//					console.debug(e);
			//					console.debug(args);
			//				});
			//				grid.onCellCssStylesChanged.subscribe(function(a, b, c, d, e, f, g) { });
			grid.onClick.subscribe(function(e, args) {
				//                    console.log(e);
				//                    console.log(args);
				let r = args.row;
				let c = args.cell;
				let g = args.grid;

				if (e.target.className == 'gridButton') {
					// グリッド行選択ボタン押下時

					// 呼び出し元を取得
					let $button = $(e.target);
					let $dialog = $button.closest('[role="dialog"]');
					let $dialogDiv = $dialog.find('[id$=Dialog]');
					let caller = $dialogDiv.attr('data-caller');   // TEntityDialog.TEntityRegistForm.TEntity.betsuSansho1Id
					let callers = caller.split('.');               // TEntityDialog, TEntityRegistForm, TEntity, betsuSansho1Id

					let parentDialogId = caller.match(/.+Dialog/); // TEntityDialog
					let itemName = callers[callers.length - 1];    // betsuSansho1Id

					// 項目名の接頭辞を取得
					let prefix = '';
					let data = g.getData();
					let item = data[r]; // DELETE_F: null, INSERT_BY: "1", INSERT_DT: 1649467076000, SANSHO1_ID: 2, SANSHO1_MEI: "テスト２", UPDATE_BY: "1", UPDATE_DT: 1649467081000
					for (let columnName in item) {
						let pascal = Casing.toPascal(columnName);
						if (itemName.match(pascal + '$')) {
							prefix = itemName.replace(new RegExp(pascal + '$'), ''); // betsu
							break;
						}
					}

					// 返却先のセレクタを取得
					let parentSelector = 'body>div.article';
					if (parentDialogId != undefined && parentDialogId != '') {
						parentSelector = 'div[id="' + callers[0] + '"] form[name="' + callers[1] + '"]';
					}

					for (let columnName in item) {
						if (!columnName.match(Messages['column.meta.re'])) {
							let camel = Casing.toCamel(prefix + columnName);
							$(parentSelector + ' [name$="' + camel + '"]').val(item[columnName]);
							$(parentSelector + ' span[id$="' + camel + '"]').html(item[columnName]);
						}
					}

					$dialogDiv.dialog('close');

				} else if (e.target.className == 'gridLink') {
					// グリッド行選択リンク押下時

					//let entityName = gridId.replace(/[^\.]+\./, '').replace(/Grid$/, '');
					let entityName = $gridDiv.attr('data-href').replace(/(^.+\/|\.html$)/g, '');

					if (Base.getAuthz(entityName) < 1) {
						e.preventDefault();
						e.stopPropagation();
						e.stopImmediatePropagation();
						alert(Messages['error.authz.view']);
						return;
					}

					if (e.target.id) {
						let href = entityName + 'Download.link?name=' + e.target.id;

						let item = g.getData()[r];

						// グリッド列定義でループ
						for (let i in g.getColumns()) {
							let column = g.getColumns()[i];

							// 主キー列でなければスキップ
							if (column.cssClass != 'primaryKey') {
								continue;
							}

							// 反映値を取得
							let v = item[column.field];
							href += '&' + column.id + '=' + v;
						}

						e.target.href = href;

					} else {
						e.preventDefault();
						e.stopPropagation();
						e.stopImmediatePropagation();
						Gridate.openDetail($gridDiv.prop('id'), entityName, g.getColumns(), g.getData()[r]);
					}
				}
			});
			//				grid.onColumnsDrag.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onColumnsReordered.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onColumnsResizeDblClick.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onColumnsResized.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onCompositeEditorChange.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onContextMenu.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onDblClick.subscribe(function(e, args) {
			//					console.debug(e);
			//					console.debug(args);
			//				});
			//				grid.onDrag.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onDragEnd.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onDragInit.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onDragStart.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onFooterClick.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onFooterContextMenu.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onFooterRowCellRendered.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onHeaderCellRendered.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onHeaderClick.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onHeaderContextMenu.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onHeaderMouseEnter.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onHeaderMouseLeave.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onHeaderRowCellRendered.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onHeaderRowMouseEnter.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onHeaderRowMouseLeave.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onKeyDown.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onMouseEnter.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onMouseLeave.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onRendered.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onScroll.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onSelectedRowsChanged.subscribe(function(e, args) {
			//					console.debug(e);
			//					console.debug(args);
			//				});
			//				grid.onSetOptions.subscribe(function(a, b, c, d, e, f, g) { });
			grid.onSort.subscribe(function(e, args) {
				var cols = args.sortCols;
				args.grid.getData().sort(function(dataRow1, dataRow2) {
					for (var i = 0, l = cols.length; i < l; i++) {
						var field = cols[i].sortCol.field;
						var sign = cols[i].sortAsc ? 1 : -1;
						var value1 = dataRow1[field], value2 = dataRow2[field];
						var result = (value1 == value2 ? 0 : (value1 > value2 ? 1 : -1)) * sign;
						if (result != 0) {
							return result;
						}
					}
					return 0;
				});
				grid.invalidate();
			});
			//				grid.onValidationError.subscribe(function(a, b, c, d, e, f, g) { });
			//				grid.onViewportChanged.subscribe(function(a, b, c, d, e, f, g) { });
			//});
		});
	});
});

var Gridate = {

	grids: {},

	/** グリッドオプション */
	options: {

		/** グリッド自体の編集可否 */
		editable: true,

		/** セル内文字列選択可否 */
		enableTextSelectionOnCells: true,

		/** 複数列ソート可否 */
		multiColumnSort: true,

		// ヘッダーの上
		//createPreHeaderPanel: true,
		//showPreHeaderPanel: true,
		//preHeaderPanelHeight: 23,
		//explicitInitialization: true,

		// グリッド内の１行目
		//showHeaderRow: true,

		// headerRowと明細の間
		//showTopPanel: true,

		//createFooterRow: true,
		//showFooterRow: true,
	},

	refresh: function(gridId, data) {
		let grid = Gridate.grids[gridId];
		if (!data) {
			data = [];
		}
		grid['orgData'] = JSON.parse(JSON.stringify(data));
		if (data.length > 0 && data[0]['id']) {
			var dataView = grid.getData();
			dataView.beginUpdate();
			dataView.setItems(data);
			dataView.endUpdate();
		} else {
			grid.setData(data);
			grid.invalidate();
		}
	},

	openDetail: function(gridId, entityName, columns, item) {

		// グリッドIDからダイアログIDを取得
		let dialogId = entityName + 'Dialog';

		// グリッド列定義でループ
		for (let i in columns) {
			let column = columns[i];

			// 主キー列でなければスキップ
			if (column.cssClass != 'primaryKey') {
				continue;
			}

			// 反映先の項目名を取得
			let camel = Casing.toCamel(column.field);

			// 反映値を取得
			let v = item[column.field];

			let $item = $('[id="' + dialogId + '"] [name="' + camel + '"]');
			if ($item.length > 0) {
				$item.val(v);
				$('[id="' + dialogId + '"] span[id="' + camel + '"]').html(v);
			} else {
				$item = $('[id="' + dialogId + '"] [name="' + entityName + '.' + camel + '"]');
				if ($item.length > 0) {
					$item.val(v);
					$('[id="' + dialogId + '"] span[id="' + entityName + '.' + camel + '"]').html(v);
				}
			}

			if ($item.hasClass('primaryKey')) {
				$item.attr('readonly', true).attr('tabindex', '-1');
			}
		}

		let $dialogDiv = $('div[id="' + dialogId + '"]');

		// 呼び出し元
		$dialogDiv.attr('data-caller', gridId);

		$dialogDiv.dialog('open');
	},

};
