package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ履歴登録フォーム
 *
 * @author emarfkrow
 */
public class TEntityHisRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntityHisRegistForm.class);

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

    /** 履歴連番 */
    @Size(max = 10)
    private String historySn;

    /**
     * @return 履歴連番
     */
    public String getHistorySn() {
        return historySn;
    }

    /**
     * @param p 履歴連番
     */
    public void setHistorySn(final String p) {
        this.historySn = p;
    }

    /** エンティティ名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String entityMei;

    /**
     * @return エンティティ名
     */
    public String getEntityMei() {
        return entityMei;
    }

    /**
     * @param p エンティティ名
     */
    public void setEntityMei(final String p) {
        this.entityMei = p;
    }

    /** 参照１ID */
    @Size(max = 10)
    private String sansho1Id;

    /**
     * @return 参照１ID
     */
    public String getSansho1Id() {
        return sansho1Id;
    }

    /**
     * @param p 参照１ID
     */
    public void setSansho1Id(final String p) {
        this.sansho1Id = p;
    }

    /** 参照１名 */
    @Size(max = 30)
    private String sansho1Mei;

    /**
     * @return 参照１名
     */
    public String getSansho1Mei() {
        return sansho1Mei;
    }

    /**
     * @param p 参照１名
     */
    public void setSansho1Mei(final String p) {
        this.sansho1Mei = p;
    }

    /** 参照２ID */
    @Size(max = 10)
    private String sansho2Id;

    /**
     * @return 参照２ID
     */
    public String getSansho2Id() {
        return sansho2Id;
    }

    /**
     * @param p 参照２ID
     */
    public void setSansho2Id(final String p) {
        this.sansho2Id = p;
    }

    /** 参照２名 */
    @Size(max = 30)
    private String sansho2Mei;

    /**
     * @return 参照２名
     */
    public String getSansho2Mei() {
        return sansho2Mei;
    }

    /**
     * @param p 参照２名
     */
    public void setSansho2Mei(final String p) {
        this.sansho2Mei = p;
    }

    /** 別参照１ID */
    @Size(max = 10)
    private String betsuSansho1Id;

    /**
     * @return 別参照１ID
     */
    public String getBetsuSansho1Id() {
        return betsuSansho1Id;
    }

    /**
     * @param p 別参照１ID
     */
    public void setBetsuSansho1Id(final String p) {
        this.betsuSansho1Id = p;
    }

    /** 別参照１名 */
    @Size(max = 30)
    private String betsuSansho1Mei;

    /**
     * @return 別参照１名
     */
    public String getBetsuSansho1Mei() {
        return betsuSansho1Mei;
    }

    /**
     * @param p 別参照１名
     */
    public void setBetsuSansho1Mei(final String p) {
        this.betsuSansho1Mei = p;
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
