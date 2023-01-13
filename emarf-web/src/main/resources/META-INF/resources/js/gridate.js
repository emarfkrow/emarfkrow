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
 * SlickGrid制御
 *
 * @author golorp
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

			// 列定義を取得
			let gridColumns = eval(this.id + 'Columns');

			// グリッドdivを取得
			let $gridDiv = $(this);

			// グリッドdiv直後のページャを取得
			let $pager = $gridDiv.find('~[id$=Pager]');

			// グリッドdivのidを、一旦グリッドIDとして退避
			let gridId = this.id;

			let $dialog = $gridDiv.parents('[role="dialog"]');
			if ($dialog.length > 0) {
				// ダイアログ内のグリッドの場合

				// 「ダイアログID.グリッドID」を正式なグリッドIDとして取得
				gridId = $dialog.attr('aria-describedby') + '.' + this.id;

				// グリッドを配置したフォーム名から検索フォーム名に変換し、検索ボタンが取れれば、検索ボタンの対象グリッドIDも変更
				let $gridForm = $gridDiv.parent('form');
				let gridFormName = $gridForm.attr('name');
				let searchFormName = gridFormName.replace(/SRegist/, 'Search');
				let $searchForm = $dialog.find('form[name="' + searchFormName + '"]');
				let $searchButton = $searchForm.find('[data-gridId="' + this.id + '"]');
				$searchButton.attr('data-gridId', gridId);

				// ページャIDも「ダイアログID.ページャID」に変換
				let pagerId = gridId.replace(/Grid$/, 'Pager');
				$pager.attr('id', pagerId);

				// グリッドIDを更新
				this.id = gridId
			}

			// divの属性からselectionModeを取得
			let selectionMode = $gridDiv.attr('data-selectionMode');

			/*
			 * columnsのjsをget
			 */

			//カラム定義を取得（パスが跨る時に動かないため廃止）
			//$.getScript('./' + divId + 'Columns.js', function() {

			var columns = $.extend(true, [], gridColumns);

			// 新規行を打てなくなるのでコメントアウト
			//			//主キー列かユニーク列ならエディタをクリア
			//			for (let i in columns) {
			//				let column = columns[i];
			//				if (column.cssClass) {
			//					if (column.cssClass.indexOf('primaryKey') >= 0 || column.cssClass.indexOf('uniqueKey') >= 0) {
			//						column.editor = null;
			//					}
			//				}
			//			}

			//登録権限なしなら列のエディタをクリア
			let form = $(this).closest('form[name]')[0];
			if (Base.getAuthz(form.name) < 3) {
				for (let i in columns) {
					let column = columns[i];
					column.editor = null;
				}
			}

			let isDialog = $gridDiv.closest('[role=dialog]').length > 0;

			let frozenColumnAdd = 0;

			let checkboxSelectColumn;

			if (selectionMode == 'checkbox') {
				// チェックボックスでの行選択の場合（検索画面の場合）

				if (isDialog) {

					// ダイアログなら選択ボタンを追加
					columns.unshift({
						id: 'choose',
						name: Messages['common.grid.choose.title'],
						field: 'field',
						sortable: true,
						width: Messages['common.grid.choose.title'].length * 20,
						label: Messages['common.grid.choose.label'],
						formatter: Slick.Formatters.Extends.Choose
					});
					++frozenColumnAdd;

					$dialog.find('button').each(function() {
						if ($(this).hasClass('selectRows')) {
							$(this).hide();
						}
					});

				} else {
					// ダイアログでな伊場合（親画面の場合）

					// 固定列があれば（主キーが１つ以上あれば）詳細リンク列を追加
					if ($gridDiv.attr('data-frozenColumn') * 1 >= 0) {
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
				}

				// checkbox指定で、ダイアログ内でないなら、最左列にチェックボックス列を追加
				if (!isDialog) {
					checkboxSelectColumn = new Slick.CheckboxSelectColumn();
					columns.unshift(checkboxSelectColumn.getColumnDefinition());
					++frozenColumnAdd;
				}

			} else if (selectionMode == 'link') {
				// リンクでの行選択の場合（詳細画面の場合）

				//最左列に詳細リンク列を追加
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

				//最左列に削除ボタン列を追加
				columns.unshift({
					id: 'delete',
					name: Messages['common.grid.delete.title'],
					field: 'field',
					sortable: true,
					width: Messages['common.grid.delete.title'].length * 20,
					label: Messages['common.grid.delete.label'],
					formatter: Slick.Formatters.Extends.Delete
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
			if (addRow && Base.getAuthz(form.name) >= 3) {
				options.enableAddRow = eval(addRow);
			}

			// 固定列（ダイアログ内で固定すると崩れる）
			let frozenColumn = $gridDiv.attr('data-frozenColumn');
			if (frozenColumn) {
				if (!isDialog) {
					options.frozenColumn = (frozenColumn * 1) + frozenColumnAdd;
				}
			}

			let dataView = new Slick.Data.DataView();
			let grid = new Slick.Grid($gridDiv, dataView, columns, options);
			Gridate.grids[gridId] = grid;

			//new Slick.Controls.Pager(dataView, grid, $pager, {
			//				showAllText: Messages['common.grid.showAllText'],
			//				showPageText: Messages['common.grid.showPageText'],
			//				showCountText: Messages['common.grid.showCountText']
			//});

			dataView.onRowCountChanged.subscribe(function(e, args) {
				grid.updateRowCount();
				grid.render();
			});

			dataView.onRowsChanged.subscribe(function(e, args) {
				grid.invalidateRows(args.rows);
				grid.render();
			});

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
				//				let data = args.grid.getData();
				//				data.push(args.item);
				//				args.grid.invalidateRow(data.length - 1);
				//				args.grid.updateRowCount();
				//				args.grid.render();
				var dataView = grid.getData();
				let data = dataView.getItems();
				args.item['id'] = data.length + 1;
				args.item['isNew'] = true;
				data.push(args.item);
				dataView.beginUpdate();
				dataView.setItems(data);
				dataView.endUpdate();
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

				let $clicked = $(e.target);

				let r = args.row;
				let c = args.cell;
				let g = args.grid;

				let dataItem = g.getDataItem(r);
				if (!dataItem || dataItem.isNew) {
					//新規行の場合

					//採番キーなら非活性
					if ($clicked.hasClass('numbering')) {
						e.preventDefault();
						e.stopPropagation();
						e.stopImmediatePropagation();
					}

				} else {
					//既存データの場合

					//主キーとユニークキーは非活性
					if ($clicked.hasClass('primaryKey') || $clicked.hasClass('uniqueKey')) {
						e.preventDefault();
						e.stopPropagation();
						e.stopImmediatePropagation();
					}
				}

				if ($clicked.hasClass('gridButton')) {
					// グリッド行ボタン押下時

					if ($clicked.hasClass('gridChoose')) {
						// グリッド行選択ボタン押下時

						// 呼び出し元ダイアログIDを取得
						let $dialog = $clicked.closest('[role="dialog"]');
						let $dialogDiv = $dialog.find('[id$=Dialog]');
						let caller = $dialogDiv.attr('data-caller');   // TEntityDialog.TEntityRegistForm.TEntity.betsuSansho1Id
						let callerDialogId = caller.match(/.+Dialog/); // TEntityDialog

						// 呼び出し元項目名を取得
						let callers = caller.split('.');               // TEntityDialog, TEntityRegistForm, TEntity, betsuSansho1Id
						let callerItemName = callers[callers.length - 1];    // betsuSansho1Id

						// 項目名の接頭辞を取得
						let prefix = '';
						for (let columnName in dataItem) {

							// DataView用の「id」列ならスキップ
							if (columnName == 'id') {
								continue;
							}

							// 呼び出し元項目名が当該列名で終わる場合は、接頭辞を取得
							let pascal = Casing.toPascal(columnName);
							if (callerItemName.match(pascal + '$')) {
								prefix = callerItemName.replace(new RegExp(pascal + '$'), ''); // betsu
								break;
							}
						}

						// 返却先のセレクタを取得
						let parentSelector = 'body>div.article';
						if (callerDialogId != undefined && callerDialogId != '') {
							parentSelector = 'div[id="' + callers[0] + '"] form[name="' + callers[1] + '"]';
						}

						for (let columnName in dataItem) {
							// メタ情報以外の項目を親画面に反映
							if (!columnName.match(Messages['column.meta.re'])) {
								let camel = Casing.toCamel(prefix + columnName);
								$(parentSelector + ' [name$="' + camel + '"]:not([readonly])').val(dataItem[columnName]);
								$(parentSelector + ' span[id$="' + camel + '"]').html(dataItem[columnName]);
							}
						}

						$dialogDiv.dialog('close');

					} else if ($clicked.hasClass('gridDelete')) {

						if (confirm(Messages['confirm.delete'])) {

							// グリッドの属性からエンティティ名を取得
							let entityName = $gridDiv.attr('data-href').replace(/(^.+\/|\.html$)/g, '');

							// 対象エンティティに更新権限がないならエラー
							if (Base.getAuthz(entityName) < 3) {
								e.preventDefault();
								e.stopPropagation();
								e.stopImmediatePropagation();
								alert(Messages['error.authz.edit']);
								return;
							}

							let postJson = {};
							for (let i in g.getColumns()) {
								let column = g.getColumns()[i];
								if (column.cssClass != 'primaryKey') {
									continue;
								}
								let v = dataItem[column.field];
								postJson[column.id] = v;
							}

							Ajaxize.ajaxPost(entityName + 'Delete.ajax', postJson, function(data) {
								var dataView = g.getData();
								let dataItems = dataView.getItems();
								dataItems.splice(r, 1);
								//g.invalidate();
								dataView.beginUpdate();
								dataView.setItems(dataItems);
								dataView.endUpdate();
							});
						}

					} else {
						alert('not implemented.');
					}

				} else if ($clicked.hasClass('gridLink')) {
					// グリッド行選択リンク押下時

					// グリッドの属性からエンティティ名を取得
					//let entityName = gridId.replace(/[^\.]+\./, '').replace(/Grid$/, '');
					let entityName = $gridDiv.attr('data-href').replace(/(^.+\/|\.html$)/g, '');

					// 対象エンティティに参照権限がないならエラー
					if (Base.getAuthz(entityName) < 1) {
						e.preventDefault();
						e.stopPropagation();
						e.stopImmediatePropagation();
						alert(Messages['error.authz.view']);
						return;
					}

					if (e.target.id) {
						// ファイル列の場合

						// ダウンロードURL
						let href = entityName + 'Download.link?name=' + e.target.id;

						//let dataItem = g.getDataItem(r);

						// グリッド列定義でループして、主キー列のみURL引数に設定
						for (let i in g.getColumns()) {
							let column = g.getColumns()[i];
							if (column.cssClass != 'primaryKey') {
								continue;
							}
							let v = dataItem[column.field];
							href += '&' + column.id + '=' + v;
						}

						e.target.href = href;

					} else {
						// 詳細リンクの場合

						e.preventDefault();
						e.stopPropagation();
						e.stopImmediatePropagation();

						Gridate.openDetail($gridDiv.prop('id'), entityName, g.getColumns(), g.getDataItem(r));
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

	refresh: function(gridId, data, totalRows, currentPage) {
		if (totalRows) {
			let rows = $('[name="rows"]').val();
			let maxPage = Math.ceil(totalRows / rows);

			let pagerId = gridId.replace(/Grid$/, 'Pager');
			let $pager = $('[id="' + pagerId + '"]');
			let html = '';
			for (let i = 1; i <= maxPage; i++) {
				if (i == currentPage) {
					html += '<a>' + i + '</a>&nbsp;';
				} else {
					html += '<a href="javascript:void(0);" onclick="Gridate.paginate(\'' + gridId + '\',' + i + ')">' + i + '</a>&nbsp;';
				}
			}
			$pager.html(html);
		}
		let grid = Gridate.grids[gridId];
		if (!data) {
			data = [];
			//		} else {
			//			for (let i in data) {
			//				let item = data[i];
			//				if (item['id']) {
			//					break;
			//				}
			//				item['id'] = i;
			//			}
		}
		grid['orgData'] = JSON.parse(JSON.stringify(data));
		//		if (data.length > 0 && data[0]['id']) {
		var dataView = grid.getData();
		dataView.beginUpdate();
		dataView.setItems(data);
		dataView.endUpdate();
		//		} else {
		//			grid.setData(data);
		//			grid.invalidate();
		//		}
		grid.setSelectedRows([]);
	},

	paginate: function(gridId, page) {
		let $button = $('[data-gridid="' + gridId + '"]');
		let $form = $button.closest('form');
		let $page = $form.find('[name="page"]');
		$page.val(page);
		$button.click();
		$page.val(0);
	},

	/**
	 * 詳細画面起動
	 * レコード内に「TABLE_NAME」列があればサブウィンドウ
	 * なければentityNameのダイアログ
	 * @param gridId     グリッドID
	 * @param entityName ダイアログ用のエンティティ名
	 * @param columns    グリッド列定義
	 * @param item       グリッド行
	 */
	openDetail: function(gridId, entityName, columns, item) {

		// TABLE_NAME列の検査
		let tableName = null;
		if (item["TABLE_NAME"]) {
			tableName = item["TABLE_NAME"];
		}

		if (tableName == null) {

			// グリッドIDからダイアログIDを取得
			let dialogId = entityName + 'Dialog';

			// グリッド列定義でループ
			for (let i in columns) {
				let column = columns[i];

				// 主キー列でなければスキップ
				//			if (column.cssClass != 'primaryKey') {
				//				continue;
				//			}

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

				//if ($item.hasClass('primaryKey')) {
				//$item.attr('readonly', true).attr('tabindex', '-1').addClass('readonly');
				//$item.next('a').hide();
				//}
			}

			let $dialogDiv = $('div[id="' + dialogId + '"]');

			// 呼び出し元
			$dialogDiv.attr('data-caller', gridId);

			$dialogDiv.dialog('open');

		} else {

			let primaryKey = '';
			let queryString = '';

			// グリッド列定義でループ
			for (let i in columns) {
				let column = columns[i];
				let k = Casing.toCamel(column.field);
				let v = item[column.field];

				if (!v) {
					continue;
				}

				// windowName用に主キーを退避
				if (column.cssClass != null && column.cssClass.indexOf('primaryKey') >= 0) {
					if (primaryKey == '') {
						primaryKey += '?';
					} else {
						primaryKey += '&';
					}
					primaryKey += k + '=' + v;
				}

				// URL引数用に各列値を退避
				if (queryString == '') {
					queryString += '?';
				} else {
					queryString += '&';
				}
				queryString += k + '=' + v;
			}

			entityName = Casing.toPascal(tableName);
			window.open('./' + entityName + '.html' + queryString, entityName + primaryKey, 'width=1024,height=768');
		}
	},

};
