package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子登録フォーム
 *
 * @author emarfkrow
 */
public class TKoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TKoRegistForm.class);

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
     * @param p 祖先ID
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
     * @param p 親連番
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
     * @param p エンティティ連番
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
     * @param p 子連番
     */
    public void setKoSn(final String p) {
        this.koSn = p;
    }

    /** 子名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String koMei;

    /**
     * @return 子名
     */
    public String getKoMei() {
        return koMei;
    }

    /**
     * @param p 子名
     */
    public void setKoMei(final String p) {
        this.koMei = p;
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

    /** 子孫 */
    @jakarta.validation.Valid
    private List<TShisonRegistForm> tShisonGrid;

    /**
     * @return 子孫
     */
    public List<TShisonRegistForm> getTShisonGrid() {
        return tShisonGrid;
    }

    /**
     * @param p
     */
    public void setTShisonGrid(final List<TShisonRegistForm> p) {
        this.tShisonGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
