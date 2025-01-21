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
 * ローディングレイヤユーティリティ
 *
 * @author golorp
 */

$(function() {

	//    console.debug('Loading init.');

	//    $('body').append('<div id="loading"></div>');

	//    $('#loading')
	//        .css('background-color', '#fff')
	//        .css('background-image', 'url("../img/gif-load.gif")')
	//        .css('background-position', 'center center')
	//        .css('background-repeat', 'no-repeat')
	//        .css('position', 'absolute')
	//        .css('bottom', '0px')
	//        .css('left', '0px')
	//        .css('right', '0px')
	//        .css('top', '0px')
	//        .css('z-index', '999')
	//        .css('opacity', '1');

	//    Loading.fadeIn();
});

$(window).on('load', function() {
	//    setTimeout(function() {
	Loading.fadeOut();
	//    }, 400);
});

var Loading = {

	stack: 0,

	fadeIn: function() {
		if (Loading.stack == 0) {
			$('#loading').fadeIn();
			console.info('Loading fadeIn');
		}
		++Loading.stack;
		console.debug('    ++Loading.stack = ' + Loading.stack);
	},

	fadeOut: function() {
		--Loading.stack;
		console.debug('    --Loading.stack = ' + Loading.stack);
		if (Loading.stack <= 0) {
			$("#loading").fadeOut();
			console.info('Loading fadeOut');
		}
	},

};

let reqPath = location.pathname.replace(/\/[^\/]+\.html$/, '');
pathlevel = reqPath.replace(/[^\/]/g, '').length;
let dir = '';
for (let i = 1; i < pathlevel; i++) {
	dir += '../';
}

console.info('Loading init.');
let dialogDiv2 = document.createElement('div');
dialogDiv2.id = 'loading';
dialogDiv2.style.backgroundColor = '#eee';
dialogDiv2.style.backgroundImage = 'url("' + dir + 'img/gif-load.gif")';
dialogDiv2.style.backgroundPosition = 'center center';
dialogDiv2.style.backgroundRepeat = 'no-repeat';
dialogDiv2.style.position = 'absolute';
dialogDiv2.style.bottom = '0px';
dialogDiv2.style.left = '0px';
dialogDiv2.style.right = '0px';
dialogDiv2.style.top = '0px';
dialogDiv2.style.opacity = '1';
dialogDiv2.style.zIndex = '999';
window.document.body.appendChild(dialogDiv2);
++Loading.stack;
console.info('Loading fadeIn');
console.debug('    ++Loading.stack = ' + Loading.stack);
