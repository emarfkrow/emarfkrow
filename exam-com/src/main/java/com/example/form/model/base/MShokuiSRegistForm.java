package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 職位マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MShokuiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MShokuiRegistForm.class);

    /** 職位マスタ登録フォームのリスト */
    @Valid
    private List<MShokuiRegistForm> mShokuiGrid;

    /**
     * @return 職位マスタ登録フォームのリスト
     */
    public List<MShokuiRegistForm> getMShokuiGrid() {
        return mShokuiGrid;
    }

    /**
     * @param p 職位マスタ登録フォームのリスト
     */
    public void setMShokuiGrid(final List<MShokuiRegistForm> p) {
        this.mShokuiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
