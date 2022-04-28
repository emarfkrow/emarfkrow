package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * コード値マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MCodeValueRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MCodeValueRegistForm.class);

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

    /** コード値 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 2)
    private String codeValue;

    /**
     * @return コード値
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * @param p コード値
     */
    public void setCodeValue(final String p) {
        this.codeValue = p;
    }

    /** コード値名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String codeValueMei;

    /**
     * @return コード値名
     */
    public String getCodeValueMei() {
        return codeValueMei;
    }

    /**
     * @param p コード値名
     */
    public void setCodeValueMei(final String p) {
        this.codeValueMei = p;
    }

    /** 表示順 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 10)
    private String hyojiJun;

    /**
     * @return 表示順
     */
    public String getHyojiJun() {
        return hyojiJun;
    }

    /**
     * @param p 表示順
     */
    public void setHyojiJun(final String p) {
        this.hyojiJun = p;
    }

    /** 取得条件 */
    @Size(max = 200)
    private String criteria;

    /**
     * @return 取得条件
     */
    public String getCriteria() {
        return criteria;
    }

    /**
     * @param p 取得条件
     */
    public void setCriteria(final String p) {
        this.criteria = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
