package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MUserSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MUserRegistForm.class);

    /** ユーザマスタ */
    @Valid
    private List<MUserRegistForm> mUserGrid;

    /**
     * @return ユーザマスタ
     */
    public List<MUserRegistForm> getMUserGrid() {
        return mUserGrid;
    }

    /**
     * @param p
     */
    public void setMUserGrid(final List<MUserRegistForm> p) {
        this.mUserGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
