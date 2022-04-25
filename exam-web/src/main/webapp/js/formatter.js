/**
 *
 */

let Formatter = {

	comma: function(v) {
		if (v === undefined || v === null || v === '') { return ''; }
		var values = v.toString().split('.');
		var s = values[0].replace(/(\d)(?=(\d\d\d)+(?!\d))/g, '$1,');
		if (values.length > 1) { s += '.' + values[1]; }
		return s;
	},

	dec0: function(v) {
		if (v === undefined || v === null || v === '') { return ''; }
		var s = Number(v).toFixed(0);
		return Formatter.comma(s);
	},

	dec1: function(v) {
		if (v === undefined || v === null || v === '') { return ''; }
		var s = Number(v).toFixed(1);
		return Formatter.comma(s);
	},

	dec2: function(v) {
		if (v === undefined || v === null || v === '') { return ''; }
		var s = Number(v).toFixed(2);
		return Formatter.comma(s);
	},

	dec3: function(v) {
		if (v === undefined || v === null || v === '') { return ''; }
		var s = Number(v).toFixed(3);
		return Formatter.comma(s);
	},

	YmdHmsS: function(date) {
		if (date && !isNaN(date.getFullYear())) {
			let y = date.getFullYear();
			let m = ('0' + (date.getMonth() + 1)).slice(-2);
			let d = ('0' + date.getDate()).slice(-2);
			let h = ('0' + date.getHours()).slice(-2);
			let mm = ('0' + date.getMinutes()).slice(-2);
			let s = ('0' + date.getSeconds()).slice(-2);
			let S = ('00' + date.getMilliseconds()).slice(-3);
			return y + '/' + m + '/' + d + ' ' + h + ':' + mm + ':' + s + '.' + S;
		}
		return '';
	},

	YmdTHmsS: function(date) {
		if (date && !isNaN(date.getFullYear())) {
			let y = date.getFullYear();
			let m = ('0' + (date.getMonth() + 1)).slice(-2);
			let d = ('0' + date.getDate()).slice(-2);
			let h = ('0' + date.getHours()).slice(-2);
			let mm = ('0' + date.getMinutes()).slice(-2);
			let s = ('0' + date.getSeconds()).slice(-2);
			let S = ('00' + date.getMilliseconds()).slice(-3);
			return y + '-' + m + '-' + d + 'T' + h + ':' + mm + ':' + s + '.' + S;
		}
		return '';
	}
};

