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
 * フォーカス制御
 *
 * @author golorp
 */

$(function() {

	console.debug('Nextize init.');

	// article内の一つ目の対象項目にフォーカス
	let $container = $('body>div.article');
	Nextize.first($container);

	$(document).on('keypress', Nextize.srcSelector, function(event) {

		// エンターキーでなければ終了
		if (event.keyCode != 13) {
			return true;
		}

		// 対象項目がa,button,textareaなら終了
		let entered = event.target;
		if (entered.tagName == 'A' || entered.tagName == 'BUTTON' || entered.tagName == 'TEXTAREA') {
			return true;
		}

		// サブミットイベントキャンセル
		event.preventDefault();
		event.stopPropagation();
		event.stopImmediatePropagation();

		let action = $(entered).attr('data-json');
		let srcDef = $(entered).attr('data-srcDef');
		let destDef = $(entered).attr('data-destDef');
		if (action && srcDef && destDef) {

			var $form = $(entered).closest('form');

			var destDefs = destDef.split(',');
			for (let i in destDefs) {
				var dest = destDefs[i];
				var dests = dest.split(':');
				$form.find('[name$="' + dests[0] + '"]').val(['']);
				$form.find('[id$="' + dests[0] + '"]').html('');
			}

			let postJson = {};
			var srcDefs = srcDef.split(',');
			for (let i in srcDefs) {
				var src = srcDefs[i];
				var srcs = src.split(':');
				let v = $form.find('[name$="' + srcs[1] + '"]').val();
				if (v != '') {
					postJson[srcs[0]] = v;
				}
			}

			if (Object.keys(postJson).length > 0) {
				Ajaxize.ajaxPost(action, postJson, function(data) {
					for (let formName in data) {
						let dataJson = data[formName];
						for (let i in dataJson) {
							let rowJson = dataJson[i];
							let destDefs = destDef.split(',');
							for (let i in destDefs) {
								let dest = destDefs[i];
								let dests = dest.split(':');
								let destName = dests[0];
								let srcName = dests[1];
								let srcValue = rowJson[srcName];
								if (srcValue) {
									$form.find('[name$="' + destName + '"]').val(srcValue);
									$form.find('[id$="' + destName + '"]').html(srcValue);
								}
							}
						}
					}
				});
			}
		}

		// 次要素にフォーカス
		let $items = $(Nextize.destSelector);
		let j = $items.index(entered) + 1;// 読み専項目エンター時はここで止まる
		let next = $items[j];
		if (next) {
			next.focus();

			// 次要素がテキストボックスなら入力文字を全選択
			if (next.tagName === 'INPUT' && (!$(next).prop('type') || $(next).prop('type') === 'text')) {
				next.select();
			}
		}
	});
});

let Nextize = {

	srcSelector: 'input[type!=button][type!=reset]:visible:enabled, ' +
		'a:visible:enabled, ' +
		'select:visible:enabled, ' +
		'textarea:visible:enabled, ' +
		'button[type!=button][type!=reset]:visible:enabled',

	destSelector: 'input[type!=button][type!=reset]:visible:enabled:not([readonly])[tabindex!=-1], ' +
		'a:visible:enabled:not([readonly])[tabindex!=-1], ' +
		'select:visible:enabled:not([readonly])[tabindex!=-1], ' +
		'textarea:visible:enabled:not([readonly])[tabindex!=-1], ' +
		'button[type!=button][type!=reset]:visible:enabled:not([readonly])[tabindex!=-1]',

	first: function($container) {

		Base.loaded(function() {

			$container.find(Nextize.destSelector).each(function() {

				if ($(this).css('visibility') != 'hidden') {
					let first = this;
					first.focus();
					if (first.tagName === 'INPUT' && (!$(first).prop('type') || $(first).prop('type') === 'text')) {
						first.select();
					}
					return false;
				}
			});
		});
	},

};
