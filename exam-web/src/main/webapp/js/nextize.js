/**
 *
 */

$(function() {

	console.debug('Nextize init.');

	// article内の一つ目の対象項目にフォーカス
	$('.article').find(Nextize.selector).each(function() {
		if ($(this).css('visibility') != 'hidden') {
			let first = this;
			first.focus();
			if (first.tagName === 'INPUT' && (!$(first).prop('type') || $(first).prop('type') === 'text')) {
				first.select();
			}
			return false;
		}
	});

	$(document).on('keypress', Nextize.selector, function(event) {

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

		let action = $(entered).attr('data-onenter');
		if (action) {

			let isParamed = false;
			$('[id="sansho1Mei"]').html('');

			let postJson = {};
			let paramNamesDef = $(entered).attr('data-onenterParamNames');
			if (paramNamesDef) {
				var $form = $(entered).closest('form');
				var paramNamesDefs = paramNamesDef.split(',');
				for (let i in paramNamesDefs) {
					var paramDef = paramNamesDefs[i];
					var paramDefs = paramDef.split(':');
					var paramName = paramDefs[0];
					var valueName = paramDefs[1];
					var paramValue = $form.find('[name="' + valueName + '"]').val();
					if (paramValue) {
						isParamed = true;
						postJson[paramName] = paramValue;
					} else {
						isParamed = false;
						break;
					}
				}
			}

			if (isParamed) {
				Ajaxize.ajaxPost(action, postJson, function(data) {
					let dataJson = data[action.replaceAll(/\.json/g, '')];
					let rowJson = dataJson[0];
					let targetNamesDef = $(entered).attr('data-onenterTargetNames');
					if (targetNamesDef) {
						var $form = $(entered).closest('form');
						var targetNamesDefs = targetNamesDef.split(',');
						for (let i in targetNamesDefs) {
							var targetDef = targetNamesDefs[i];
							var targetDefs = targetDef.split(':');
							var targetName = targetDefs[0];
							var sourceName = targetDefs[1];
							var sourceValue = rowJson[sourceName];
							if (sourceValue) {
								$form.find('[name="' + targetName + '"]').val(sourceValue);
								$form.find('[id="' + targetName + '"]').html(sourceValue);
							}
						}
					}
				});
			}
		}

		// 次要素にフォーカス
		let $items = $(Nextize.selector);
		let j = $items.index(entered) + 1;
		let next = $items[j];
		next.focus();

		// 次要素がテキストボックスなら入力文字を全選択
		if (next.tagName === 'INPUT' && (!$(next).prop('type') || $(next).prop('type') === 'text')) {
			next.select();
		}
	});
});

let Nextize = {

	selector: 'input[type!=button][type!=reset]:visible:enabled:not([readonly])[tabindex!=-1], ' +
		'a:visible:enabled:not([readonly])[tabindex!=-1], ' +
		'select:visible:enabled:not([readonly])[tabindex!=-1], ' +
		'textarea:visible:enabled:not([readonly])[tabindex!=-1], ' +
		'button[type!=button][type!=reset]:visible:enabled:not([readonly])[tabindex!=-1]',

};