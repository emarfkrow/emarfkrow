package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MSansho1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSansho1RegistForm.class);

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
     * @param p
     */
    public void setSansho1Id(final String p) {
        this.sansho1Id = p;
    }

    /** 参照１名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String sansho1Mei;

    /**
     * @return 参照１名
     */
    public String getSansho1Mei() {
        return sansho1Mei;
    }

    /**
     * @param p
     */
    public void setSansho1Mei(final String p) {
        this.sansho1Mei = p;
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
