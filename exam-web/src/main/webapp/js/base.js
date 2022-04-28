/**
 *
 */
console.debug = function() { }

// １．DOM構築後
$(function() {
	//console.debug('$(function() {});');

	console.debug('Base init.');

	// クエリストリングの取得
	window.location.search.slice(1).split('&').forEach(function(s) {
		var a = s.split('=');
		Base.querystrings[a[0]] = a[1];
	});

	// テキスト入力のオートコンプリート解除
	$('input[type="text"]').prop('autocomplete', 'off');
	$('input[type="password"]').prop('autocomplete', 'new-password').prop('aria-autocomplete', 'none');

	// 画面にクライアントシステム日時を表示
	$('.certification #timestamp').html(Formatter.YmdHmsS(new Date()));
});

// ２．DOM構築後
$(document).ready(function() {
	//console.debug('$(document).ready(function() {});');
});

// ３．DOM構築後
$(document).on('ready', function() {
	//console.debug('$(document).on(\'ready\', function() {});');

	// 画面初期化
	if (typeof Loading != 'undefined') {
		Base.loaded(Base.init);
	} else {
		Base.init();
	}

	// URLにERRORがついていればポップアップ
	if (Base.querystrings['ERROR']) {
		alert(decodeURI(Base.querystrings['ERROR']));
	}

	// URLにINFOがついていればポップアップ
	if (Base.querystrings['INFO']) {
		alert(decodeURI(Base.querystrings['INFO']));
	}

});

// ４．画像ファイル読み込み後
$(window).load(function() {
	//console.debug('$(window).load(function() {});');
});

// ５．画像ファイル読み込み後
$(window).on('load', function() {
	//console.debug('$(window).on(\'load\', function() {});');
});

let Base = {

	querystrings: {},

	/**
	 * Loading終了を待って実行
	 */
	loaded: function(func) {
		if (typeof Loading != 'undefined') {
			// Loadingをロード済みなら終了を待つ
			Loading.fadeIn();
			let timer = setInterval(function() {
				if (Loading.stack <= 1) {
					try {
						func();
					} catch (e) {
						alert(e);
						throw e;
					} finally {
						clearInterval(timer);
					}
				}
			}, 10);
			Loading.fadeOut();
		} else {
			// Loadingがロードされていなければ即実行
			func();
		}
	},

	init: function() {

		// buttonスタイル適用
		$('button, .nav a, .article a').button();
		$('.article fieldset a').css('padding', 0);

		// maxlengthに応じて幅調整
		$('[maxlength]').each(function() {
			if (this.tagName.toLowerCase() == 'input' && ($(this).prop('type') == 'date' || $(this).prop('type') == 'month' || $(this).prop('type') == 'datetime-local')) {
				return;
			}
			let maxlength = $(this).attr('maxlength');
			if (maxlength >= 30) {
				maxlength /= 2;
				if (maxlength > 30) {
					maxlength = 30;
				}
			}
			$(this).css('width', maxlength + 'rem');
		});

		// 親画面の場合、登録フォーム内に子エンティティ追加リンクがあっても、自エンティティの主キーが揃っていなければ非活性
		let $registForm = $('body>div>form[name$="RegistForm"]');
		$registForm.find('.addChild').button('option', 'disabled', false);
		let isPrimaryKey = true;
		let primaryKeys = $registForm.find('input.primaryKey');
		for (let i = 0; i < primaryKeys.length; i++) {
			isPrimaryKey &= $(primaryKeys[i]).val() != '';
		}
		if (!isPrimaryKey) {
			$registForm.find('.addChild').button('option', 'disabled', true);
		}

		$(document).on('click', 'button[type="reset"]', function() {
			let $reset = $(this);
			let $form = $reset.closest('form');
			$form.find('span[id].refer').html('');
		});

		Base.resizeNav();

		Base.referMei($('span.refer'));

	},

	resizeNav: function() {
		$('html,body').css('height', '100%');
		let header = $('.header').outerHeight(true);
		let footer = $('.footer').outerHeight(true);
		$('.nav').outerHeight(window.innerHeight - header - footer);
		let $rootGrids = $('body>div.article>form>div[id$="Grid"]');
		if ($rootGrids.length == 1) {
			if ($('body')[0].scrollHeight != $('body').outerHeight()) {
				$rootGrids.height($rootGrids.height() - ($('body')[0].scrollHeight - $('body').outerHeight()))
			} else {
				$rootGrids.height($rootGrids.height() + ($('.nav').height() - $('.article').height() - $('.breads').height()))
			}
			let grid = Gridate.grids[$rootGrids.prop('id')];
			if (grid) {
				grid.resizeCanvas();
			}
		}
		$(window).resize(function() {
			Base.resizeNav();
		});
	},

	referMei: function($referSpans) {

		$referSpans.each(function() {

			let $referSpan = $(this);
			let action = $referSpan.attr('data-json');
			let srcDef = $referSpan.attr('data-srcDef');
			let destDef = $referSpan.attr('data-destDef');
			if (action && srcDef && destDef) {

				var $form = $referSpan.closest('form');

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
					}, false);
				}
			}
		});
	},

};
