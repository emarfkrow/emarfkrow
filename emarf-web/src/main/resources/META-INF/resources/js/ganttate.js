
let Ganttate = {

    gantts: {},

    refresh: function(ganttId, data) {
        let tasks = T00KouteiGanttTasks.load(data);
        Ganttate.gantts[ganttId].refresh(tasks);
    },

    options: {

        header_height: 50,
        column_width: 30,
        step: 24,
        view_mode: 'Day',
        language: 'ja',
        container_height: 600,
        /*
         * タスククリック
         */
        on_click: function(task) {
            for (let k in task) {
                if (k.startsWith('_') || k == 'dependencies' || k == 'actual_duration' || k == 'ignored_duration') {
                    continue; // 内部プロパティはスキップ
                }
                $('#' + k).val(task[k]);
            }
            $modal.css('display', 'flex').hide().fadeIn(200);
        },
        /*
         * タスクドラッグ
         */
        on_date_change: function(task, start, end) {
            task.start = start.toISOString().split('T')[0];
            task.end = end.toISOString().split('T')[0];
        },
        /*
         * 進捗ドラッグ
         */
        on_progress_change: function(task, progress) {
            task.progress = progress;
        }
    }

};

$(function() {

    $('.gantt').each(function() {

        let ganttId = this.id;

        const $modal = $('#' + ganttId + 'Modal');

        const gantt = new Gantt("#" + ganttId, [], Ganttate.options);

        Ganttate.gantts[ganttId] = gantt;

        // 列定義を取得
        gantt.taskDefs = eval(this.id + 'Tasks');

        // 3. フォームの「保存」処理
        $('#' + ganttId + 'ModalForm').on('submit', function(e) {

            e.preventDefault();

            const id = $('#id').val();

            const task = tasks.find(t => t.id === id);

            if (task) {
                for (let k in task) {
                    if (k.startsWith('_') || k == 'dependencies' || k == 'actual_duration' || k == 'ignored_duration') {
                        continue; // 内部プロパティはスキップ
                    }
                    task[k] = $('#' + k).val();
                }
                gantt.refresh(tasks);
            }

            $modal.fadeOut(200);
        });

        // 4. キャンセルボタンの処理
        $('#' + ganttId + 'ModalForm').find('#btnCancel').on('click', function() {
            $modal.fadeOut(200);
        });

        // 背景クリックで閉じる処理
        $modal.on('click', function(e) {
            if ($(e.target).is($modal)) {
                $modal.fadeOut(200);
            }
        });
    });
});
