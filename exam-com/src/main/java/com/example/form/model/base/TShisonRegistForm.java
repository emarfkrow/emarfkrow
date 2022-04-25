package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class TShisonRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TShisonRegistForm.class);

    /** 祖先ID */
    @Size(max = 10)
    private String sosenId;

    /**
     * @return 祖先ID
     */
    public String getSosenId() {
        return sosenId;
    }

    /**
     * @param p
     */
    public void setSosenId(final String p) {
        this.sosenId = p;
    }

    /** 親連番 */
    @Size(max = 10)
    private String oyaSn;

    /**
     * @return 親連番
     */
    public String getOyaSn() {
        return oyaSn;
    }

    /**
     * @param p
     */
    public void setOyaSn(final String p) {
        this.oyaSn = p;
    }

    /** エンティティ連番 */
    @Size(max = 10)
    private String entitySn;

    /**
     * @return エンティティ連番
     */
    public String getEntitySn() {
        return entitySn;
    }

    /**
     * @param p
     */
    public void setEntitySn(final String p) {
        this.entitySn = p;
    }

    /** 子連番 */
    @Size(max = 10)
    private String koSn;

    /**
     * @return 子連番
     */
    public String getKoSn() {
        return koSn;
    }

    /**
     * @param p
     */
    public void setKoSn(final String p) {
        this.koSn = p;
    }

    /** 子孫連番 */
    @Size(max = 10)
    private String shisonSn;

    /**
     * @return 子孫連番
     */
    public String getShisonSn() {
        return shisonSn;
    }

    /**
     * @param p
     */
    public void setShisonSn(final String p) {
        this.shisonSn = p;
    }

    /** 子孫名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String shisonMei;

    /**
     * @return 子孫名
     */
    public String getShisonMei() {
        return shisonMei;
    }

    /**
     * @param p
     */
    public void setShisonMei(final String p) {
        this.shisonMei = p;
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
     * @param p
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
