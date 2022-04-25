/*
 * ローディングレイヤユーティリティ
 * fukuo@souken.co.jp
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
            console.debug('Loading fadeIn');
        }
        ++Loading.stack;
        console.debug('++Loading.stack = ' + Loading.stack);
    },

    fadeOut: function() {
        --Loading.stack;
        console.debug('--Loading.stack = ' + Loading.stack);
        if (Loading.stack <= 0) {
            $("#loading").fadeOut();
            console.debug('Loading fadeOut');
        }
    },

};

console.debug('Loading init.');
let dialogDiv2 = document.createElement('div');
dialogDiv2.id = 'loading';
dialogDiv2.style.backgroundColor = '#fff';
dialogDiv2.style.backgroundImage = 'url("../img/gif-load.gif")';
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
console.debug('Loading fadeIn');
console.debug('++Loading.stack = ' + Loading.stack);
