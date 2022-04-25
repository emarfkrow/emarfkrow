package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MSansho1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSansho1RegistForm.class);

    /** 参照１マスタ */
    @Valid
    private List<MSansho1RegistForm> mSansho1Grid;

    /**
     * @return 参照１マスタ
     */
    public List<MSansho1RegistForm> getMSansho1Grid() {
        return mSansho1Grid;
    }

    /**
     * @param p
     */
    public void setMSansho1Grid(final List<MSansho1RegistForm> p) {
        this.mSansho1Grid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
