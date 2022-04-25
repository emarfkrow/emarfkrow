package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MCodeSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MCodeRegistForm.class);

    /** コードマスタ */
    @Valid
    private List<MCodeRegistForm> mCodeGrid;

    /**
     * @return コードマスタ
     */
    public List<MCodeRegistForm> getMCodeGrid() {
        return mCodeGrid;
    }

    /**
     * @param p
     */
    public void setMCodeGrid(final List<MCodeRegistForm> p) {
        this.mCodeGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
