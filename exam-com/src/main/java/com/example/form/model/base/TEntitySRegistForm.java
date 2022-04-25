package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class TEntitySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntityRegistForm.class);

    /** エンティティ */
    @Valid
    private List<TEntityRegistForm> tEntityGrid;

    /**
     * @return エンティティ
     */
    public List<TEntityRegistForm> getTEntityGrid() {
        return tEntityGrid;
    }

    /**
     * @param p
     */
    public void setTEntityGrid(final List<TEntityRegistForm> p) {
        this.tEntityGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
