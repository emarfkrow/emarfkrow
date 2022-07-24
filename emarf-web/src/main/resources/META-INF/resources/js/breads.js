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
 * パンくずリスト
 *
 * @author golorp
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
