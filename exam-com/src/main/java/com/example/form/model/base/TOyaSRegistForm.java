package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class TOyaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TOyaRegistForm.class);

    /** 親 */
    @Valid
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
