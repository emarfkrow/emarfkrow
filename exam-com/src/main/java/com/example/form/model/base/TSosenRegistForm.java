package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.constraints.Size;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class TSosenRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TSosenRegistForm.class);

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

    /** 祖先名 */
    @jakarta.validation.constraints.NotBlank
    @Size(max = 30)
    private String sosenMei;

    /**
     * @return 祖先名
     */
    public String getSosenMei() {
        return sosenMei;
    }

    /**
     * @param p
     */
    public void setSosenMei(final String p) {
        this.sosenMei = p;
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

    /** 親 */
    @jakarta.validation.Valid
    private List<TOyaRegistForm> tOyaGrid;

    /**
     * @return 親
     */
    public List<TOyaRegistForm> getTOyaGrid() {
        return tOyaGrid;
    }

    /**
     * @param p
     */
    public void setTOyaGrid(final List<TOyaRegistForm> p) {
        this.tOyaGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
