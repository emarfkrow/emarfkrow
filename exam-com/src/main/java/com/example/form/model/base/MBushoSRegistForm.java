package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 部署マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MBushoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MBushoRegistForm.class);

    /** 部署マスタ登録フォームのリスト */
    @Valid
    private List<MBushoRegistForm> mBushoGrid;

    /**
     * @return 部署マスタ登録フォームのリスト
     */
    public List<MBushoRegistForm> getMBushoGrid() {
        return mBushoGrid;
    }

    /**
     * @param p 部署マスタ登録フォームのリスト
     */
    public void setMBushoGrid(final List<MBushoRegistForm> p) {
        this.mBushoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
