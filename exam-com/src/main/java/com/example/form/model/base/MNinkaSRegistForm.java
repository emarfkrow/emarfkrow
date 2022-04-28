package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 認可マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MNinkaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MNinkaRegistForm.class);

    /** 認可マスタ登録フォームのリスト */
    @Valid
    private List<MNinkaRegistForm> mNinkaGrid;

    /**
     * @return 認可マスタ登録フォームのリスト
     */
    public List<MNinkaRegistForm> getMNinkaGrid() {
        return mNinkaGrid;
    }

    /**
     * @param p 認可マスタ登録フォームのリスト
     */
    public void setMNinkaGrid(final List<MNinkaRegistForm> p) {
        this.mNinkaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
