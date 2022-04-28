package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * コードマスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MCodeSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MCodeRegistForm.class);

    /** コードマスタ登録フォームのリスト */
    @Valid
    private List<MCodeRegistForm> mCodeGrid;

    /**
     * @return コードマスタ登録フォームのリスト
     */
    public List<MCodeRegistForm> getMCodeGrid() {
        return mCodeGrid;
    }

    /**
     * @param p コードマスタ登録フォームのリスト
     */
    public void setMCodeGrid(final List<MCodeRegistForm> p) {
        this.mCodeGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
