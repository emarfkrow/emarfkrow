package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 添付ファイル登録フォーム
 *
 * @author emarfkrow
 */
public class TTenpuFileRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TTenpuFileRegistForm.class);

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

    /** 添付ファイル連番 */
    @Size(max = 10)
    private String tenpuFileSn;

    /**
     * @return 添付ファイル連番
     */
    public String getTenpuFileSn() {
        return tenpuFileSn;
    }

    /**
     * @param p 添付ファイル連番
     */
    public void setTenpuFileSn(final String p) {
        this.tenpuFileSn = p;
    }

    /** 添付ファイル */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 200)
    private String tenpuFile;

    /**
     * @return 添付ファイル
     */
    public String getTenpuFile() {
        return tenpuFile;
    }

    /**
     * @param p 添付ファイル
     */
    public void setTenpuFile(final String p) {
        this.tenpuFile = p;
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
