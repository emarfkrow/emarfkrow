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

let Ganttate = {

    gantts: {},

    options: {

        header_height: 50,
        column_width: 30,
        step: 24,
        view_mode: 'Day',
        language: 'ja',
        container_height: 'auto',
        //auto_move_label: false,
        //infinite_padding: false,
        readonly: true,

        /*
         * タスククリック
         */
        on_click: function(task) {
            console.log(task);
            // ドラッグ中はクリックイベントを無視
            if (task._isDragging) {
                task._isDragging = false;
                return;
            }
            let $dialogDiv = $('div[id="' + this.dialogId + '"]');
            for (let k in task) {
                if (k.startsWith('_') || k == 'actual_duration' || k == 'ignored_duration') {
                    continue; // 内部プロパティはスキップ
                }
                $dialogDiv.find('[name$=".' + k + '"]').val(task[k]);
            }
            // $modal.css('display', 'flex').hide().fadeIn(200);
            $dialogDiv.attr('data-caller', this.$svg.id);
            $dialogDiv.dialog('open');
        },

        /*
         * タスクドラッグ
         */
        on_date_change: function(task, start, end) {
            task.start = start.toISOString().split('T')[0];
            task.end = end.toISOString().split('T')[0];
            task._isDragging = true;
        },

        /*
         * 進捗ドラッグ
         */
        on_progress_change: function(task, progress) {
            task.progress = progress;
        },

    },

    refresh: function(ganttId, data) {
        let gantt = Ganttate.gantts[ganttId];
        let tasks = gantt.taskDefs.load(data);
        gantt.refresh(tasks);
    },

    arrow: function() {

        $('g.arrow path').each(function() {
            let x;
            let y;
            let w;
            let b;
            //console.log('arrow');
            let d = $(this).attr('d');
            let ds = d.split(/\n/);
            for (let i in ds) {
                let e = ds[i].trim();
                if (e != '') {
                    let es = e.split(' ');
                    let k = es[0];
                    es.shift();
                    if (k == 'M') {
                        //console.log('    AbsMove:' + es);
                        x = es[0];
                        y = es[1];
                    } else if (k == 'm') {
                        //console.log('    RelMove:' + es);
                    } else if (k == 'V') {
                        //console.log('    AbsVert:' + es);
                        b = es[0];
                    } else if (k == 'a') {
                        //console.log('    arc    :' + es);
                    } else if (k == 'L') {
                        //console.log('    AbsLine:' + es);
                        w = es[0];
                    } else if (k == 'l') {
                        //console.log('    RelLine:' + es);
                    } else {
                        //console.log('    ' + k + '       :' + es);
                    }
                }
            }
            d = 'M ' + x + ' ' + y + ' L ' + (w * 1 + 15) + ' ' + y + ' a 5 5 0 0 1 5 5 V ' + (b * 1 - 15) + ' m -5 -5 l 5 5 l 5 -5'
            $(this).attr('d', d);
        });
    }
};

$(function() {

    //    const originalMakeArrows = Gantt.prototype.make_arrows;
    //    Gantt.prototype.make_arrows = function() {
    //        originalMakeArrows.apply(this, arguments);
    //        Ganttate.arrow();
    //    };

    $('svg.gantt').each(function() {

        let ganttId = this.id;
        let gantt = new Gantt("#" + ganttId, [], Ganttate.options);
        Ganttate.gantts[ganttId] = gantt;

        gantt.taskDefs = eval(this.id + 'Tasks');

        let dataHref = $(this).attr('data-href');
        let dialogId = dataHref.replace(/(^.+\/|\.html(\?.+)?$)/g, '') + 'Dialog';
        gantt.dialogId = dialogId;

        Dialogate.enable(this, "  ", $(this).hasClass('refer'));
    });

    const ganttContainer = document.querySelector('.gantt-container');
    if (ganttContainer) {
        ganttContainer.addEventListener('wheel', function(e) {
            // コンテナの総幅が、画面（表示領域）の幅と同じ、または小さい場合
            // （＝画面幅いっぱいに収まっており、本来スクロールする必要がない状態）
            if (ganttContainer.scrollWidth <= ganttContainer.clientWidth) {
                // ホイールによる縦・横スクロールの挙動を完全に無効化する
                e.preventDefault();
            }
        }, { passive: false }); // preventDefaultを動作させるために必要
    }
});
