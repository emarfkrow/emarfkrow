package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MShokuiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MShokuiRegistForm.class);

    /** 職位マスタ */
    @Valid
    private List<MShokuiRegistForm> mShokuiGrid;

    /**
     * @return 職位マスタ
     */
    public List<MShokuiRegistForm> getMShokuiGrid() {
        return mShokuiGrid;
    }

    /**
     * @param p
     */
    public void setMShokuiGrid(final List<MShokuiRegistForm> p) {
        this.mShokuiGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
