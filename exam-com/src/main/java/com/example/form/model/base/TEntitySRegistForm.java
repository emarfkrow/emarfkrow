package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TEntitySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntityRegistForm.class);

    /** エンティティ登録フォームのリスト */
    @Valid
    private List<TEntityRegistForm> tEntityGrid;

    /**
     * @return エンティティ登録フォームのリスト
     */
    public List<TEntityRegistForm> getTEntityGrid() {
        return tEntityGrid;
    }

    /**
     * @param p エンティティ登録フォームのリスト
     */
    public void setTEntityGrid(final List<TEntityRegistForm> p) {
        this.tEntityGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
