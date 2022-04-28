package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 参照２マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSansho2RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSansho2RegistForm.class);

    /** 参照２ID */
    @Size(max = 6)
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
    @jakarta.validation.constraints.NotBlank
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
