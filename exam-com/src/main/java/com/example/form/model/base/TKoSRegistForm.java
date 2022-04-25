package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class TKoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TKoRegistForm.class);

    /** 子 */
    @Valid
    private List<TKoRegistForm> tKoGrid;

    /**
     * @return 子
     */
    public List<TKoRegistForm> getTKoGrid() {
        return tKoGrid;
    }

    /**
     * @param p
     */
    public void setTKoGrid(final List<TKoRegistForm> p) {
        this.tKoGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
