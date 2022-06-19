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
 * 文字列操作
 *
 * @author toshiyuki
 */

let Casing = {

	toSnake: function(s) {

		if (s == null) {
			return null;
		}

		// パスカルケース対応（数字・小文字直後の大文字の前に「_」を挿入）
		// password→password、EMAIL→EMAIL、sampleY_1→sample_Y_1、MUser→MUser、HOSO-HINBAN→HOSO-HINBAN）
		let snake = s.replace(/([0-9a-z])([A-Z])/g, "$1_$2");

		// キャメルケース・パスカルケース対応（大文字の次に小文字がある場合は大文字の前に「_」を挿入）
		// password→password、EMAIL→EMAIL、sampleY_1→sample_Y_1、MUser→M_User、HOSO-HINBAN→HOSO-HINBAN）
		snake = snake.replace(/([A-Z][a-z])/g, "_$1");

		// ケバブケース対応（「-」を「_」に置換）
		// password→password、EMAIL→EMAIL、sampleY_1→sample_Y_1、MUser→M_User、HOSO-HINBAN→HOSO_HINBAN）
		snake = snake.replace(/\-/g, "_");

		// 先頭の「_」を除去
		snake = snake.replace(/^_/g, "");

		// 重複する「_」を除去
		snake = snake.replace(/__/g, "_");

		return snake.toLowerCase();
	},

	toUpper: function(s) {

		if (s == null) {
			return null;
		}

		let forceSnake = Casing.toSnake(s);
		return forceSnake.toUpperCase();
	},

	toCamel: function(s) {

		if (s == null) {
			return null;
		}

		// 一旦スネークケースにしてから"_"で分割
		let forceSnake = Casing.toSnake(s);
		let snakes = forceSnake.split("_");

		let camel = '';
		for (let i in snakes) {

			let snake = snakes[i];

			if (camel.toString() == "") {

				// 一つ目は全て小文字
				camel += snake.toLowerCase();

			} else {

				// 二つ目以降は１文字目を大文字、２文字目以降は小文字
				camel += snake.substring(0, 1).toUpperCase();
				if (snake.length > 1) {
					camel += snake.substring(1).toLowerCase();
				}
			}
		}

		return camel;
	},

	toPascal: function(s) {

		if (s == null) {
			return null;
		}

		let camelCase = Casing.toCamel(s);
		return camelCase.substring(0, 1).toUpperCase() + camelCase.substring(1);
	},

	toKebab: function(s) {

		if (s == null) {
			return null;
		}

		let snake = Casing.toSnake(s);
		return snake.replace(/_/g, '-');
	},

	toUpperKebab: function(s) {

		if (s == null) {
			return null;
		}

		let kebab = Casing.toKebab(s);
		return kebab.toUpperCase();
	},

}
