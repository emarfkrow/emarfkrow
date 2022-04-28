package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ履歴一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TEntityHisSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntityHisRegistForm.class);

    /** エンティティ履歴登録フォームのリスト */
    @Valid
    private List<TEntityHisRegistForm> tEntityHisGrid;

    /**
     * @return エンティティ履歴登録フォームのリスト
     */
    public List<TEntityHisRegistForm> getTEntityHisGrid() {
        return tEntityHisGrid;
    }

    /**
     * @param p エンティティ履歴登録フォームのリスト
     */
    public void setTEntityHisGrid(final List<TEntityHisRegistForm> p) {
        this.tEntityHisGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
