/**
 *
 */

let Casing = {

    toSnake: function(s) {

        if (s == null) {
            return null;
        }

        // 一旦、数字か小文字の直後の大文字の前に「_」を挿入
        // password→password、EMAIL→EMAIL、sampleY_1→sample_Y_1、MUser→MUser）
        let snake = s.replace(/([0-9a-z])([A-Z])/g, "$1_$2");

        // 大文字の次に小文字がある場合は大文字の前に「_」を挿入
        // password→password、EMAIL→EMAIL、sampleY_1→sample_Y_1、MUser→M_User）
        snake = snake.replace(/([A-Z][a-z])/g, "_$1");
        snake = snake.replace(/^_/g, "");
        snake = snake.replace(/__/g, "_");

        return snake.toLowerCase();
    },

    toUpper: function(s) {

        if (s == null) {
            return null;
        }

        return Casing.toSnake(s).toUpperCase();
    },

    toCamel: function(s) {
        //        return snake.toLowerCase().replace(/_./g,
        //            function(s) {
        //                return s.charAt(1).toUpperCase();
        //            }
        //        );

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
        //        var camel = Casing.toCamel(snake);
        //        return camel.charAt(0).toUpperCase() + camel.slice(1);

        if (s == null) {
            return null;
        }

        let camelCase = Casing.toCamel(s);
        return camelCase.substring(0, 1).toUpperCase() + camelCase.substring(1);
    },
}
