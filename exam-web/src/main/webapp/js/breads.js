/**
 * パンくずリスト
 *
 * @author toshiyuki
 */

$(function() {

	console.debug('Breads init.');

	// サブウィンドウなら終了
	if (window.opener) {
		return;
	}

	// 現在パスが「html」でなければパンくずを初期化して終了
	let pathname = window.document.location.pathname;
	if (!pathname.endsWith('.html')) {
		sessionStorage['breads'] = JSON.stringify({});
		return;
	}

	// 作成済みのパンくずリストを、現在パスの直前まで、パンくずリストにコピー
	let breads = {};

	if (sessionStorage['breads']) {
		let orgBreads = JSON.parse(sessionStorage['breads']);
		for (let orgBread in orgBreads) {
			if (orgBread.indexOf(pathname) === 0) {
				break;
			}
			breads[orgBread] = orgBreads[orgBread];
		}
	}

	// パンくずラベル用に、article内のh2から、ページタイトルを取得してみる
	// 取得できなければページのタイトルを取得
	let pageTitle = $('.article h2').html();
	if (!pageTitle) {
		pageTitle = document.title;
	}

	// パンくずリストに追加して、セッションストレージに保管
	breads[pathname] = pageTitle;
	sessionStorage['breads'] = JSON.stringify(breads);

	// パンくずリストに表示
	let $ul = $('ul#breads');
	$ul.html('');
	for (let bread in breads) {
		if (bread.indexOf(pathname) === 0) {
			// 現在ページならリンクなし
			$ul.append(breads[bread]);
		} else {
			// 他のページならリンクあり
			$ul.append('<li><a href="' + bread + '">' + breads[bread] + '</a></li>');
		}
	}

	// nav内のリンク押下時はHOMEのみにリセット
	$(document).on('click', '.nav a', function() {
		let breads = {};
		let orgBreads = JSON.parse(sessionStorage['breads']);
		for (let orgBread in orgBreads) {
			breads[orgBread] = orgBreads[orgBread];
			break;
		}
		sessionStorage['breads'] = JSON.stringify(breads);
	});
});
