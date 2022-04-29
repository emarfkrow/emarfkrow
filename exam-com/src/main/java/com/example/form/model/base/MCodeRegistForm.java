package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * コードマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MCodeRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MCodeRegistForm.class);

    /** コード名称 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 20)
    private String codeNm;

    /**
     * @return コード名称
     */
    public String getCodeNm() {
        return codeNm;
    }

    /**
     * @param p コード名称
     */
    public void setCodeNm(final String p) {
        this.codeNm = p;
    }

    /** コード名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String codeMei;

    /**
     * @return コード名
     */
    public String getCodeMei() {
        return codeMei;
    }

    /**
     * @param p コード名
     */
    public void setCodeMei(final String p) {
        this.codeMei = p;
    }

    /** 削除フラグ */
    @Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /** コード値マスタ */
    @jakarta.validation.Valid
    private List<MCodeValueRegistForm> mCodeValueGrid;

    /**
     * @return コード値マスタ
     */
    public List<MCodeValueRegistForm> getMCodeValueGrid() {
        return mCodeValueGrid;
    }

    /**
     * @param p
     */
    public void setMCodeValueGrid(final List<MCodeValueRegistForm> p) {
        this.mCodeValueGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
