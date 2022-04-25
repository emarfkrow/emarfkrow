package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class TShisonSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TShisonRegistForm.class);

    /** 子孫 */
    @Valid
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

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
