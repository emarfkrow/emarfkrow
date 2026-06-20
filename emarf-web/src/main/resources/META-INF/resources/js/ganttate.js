
let Ganttate = {

    gantts: {},

    refresh: function(ganttId, data) {
        let gantt = Ganttate.gantts[ganttId];
        let tasks = gantt.taskDefs.load(data);
        gantt.refresh(tasks);
    },

    options: {

        header_height: 50,
        column_width: 30,
        step: 24,
        view_mode: 'Day',
        language: 'ja',
        container_height: 'auto',

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
        }
    }

};

$(function() {

    $('.gantt').each(function() {

        let ganttId = this.id;
        let gantt = new Gantt("#" + ganttId, [], Ganttate.options);
        Ganttate.gantts[ganttId] = gantt;

        gantt.taskDefs = eval(this.id + 'Tasks');

        let dataHref = $(this).attr('data-href');
        let dialogId = dataHref.replace(/(^.+\/|\.html(\?.+)?$)/g, '') + 'Dialog';
        gantt.dialogId = dialogId;

        Dialogate.enable(this, "  ", $(this).hasClass('refer'));

        //        const $modal = $('#' + ganttId + 'Modal');
        //
        //        // 3. フォームの「保存」処理
        //        $('#' + ganttId + 'ModalForm').on('submit', function(e) {
        //
        //            e.preventDefault();
        //
        //            const id = $('#id').val();
        //
        //            const task = tasks.find(t => t.id === id);
        //
        //            if (task) {
        //                for (let k in task) {
        //                    if (k.startsWith('_') || k == 'dependencies' || k == 'actual_duration' || k == 'ignored_duration') {
        //                        continue; // 内部プロパティはスキップ
        //                    }
        //                    task[k] = $('#' + k).val();
        //                }
        //                gantt.refresh(tasks);
        //            }
        //
        //            $modal.fadeOut(200);
        //        });
        //
        //        // 4. キャンセルボタンの処理
        //        $('#' + ganttId + 'ModalForm').find('#btnCancel').on('click', function() {
        //            $modal.fadeOut(200);
        //        });
        //
        //        // 背景クリックで閉じる処理
        //        $modal.on('click', function(e) {
        //            if ($(e.target).is($modal)) {
        //                $modal.fadeOut(200);
        //            }
        //        });
    });
});
