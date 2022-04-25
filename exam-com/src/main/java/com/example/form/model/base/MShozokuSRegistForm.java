package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MShozokuSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MShozokuRegistForm.class);

    /** 所属マスタ */
    @Valid
    private List<MShozokuRegistForm> mShozokuGrid;

    /**
     * @return 所属マスタ
     */
    public List<MShozokuRegistForm> getMShozokuGrid() {
        return mShozokuGrid;
    }

    /**
     * @param p
     */
    public void setMShozokuGrid(final List<MShozokuRegistForm> p) {
        this.mShozokuGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
