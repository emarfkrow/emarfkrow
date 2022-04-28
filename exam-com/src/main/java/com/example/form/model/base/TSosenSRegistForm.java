package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 祖先一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TSosenSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TSosenRegistForm.class);

    /** 祖先登録フォームのリスト */
    @Valid
    private List<TSosenRegistForm> tSosenGrid;

    /**
     * @return 祖先登録フォームのリスト
     */
    public List<TSosenRegistForm> getTSosenGrid() {
        return tSosenGrid;
    }

    /**
     * @param p 祖先登録フォームのリスト
     */
    public void setTSosenGrid(final List<TSosenRegistForm> p) {
        this.tSosenGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
