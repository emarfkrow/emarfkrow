package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MSansho2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSansho2RegistForm.class);

    /** 参照２マスタ */
    @Valid
    private List<MSansho2RegistForm> mSansho2Grid;

    /**
     * @return 参照２マスタ
     */
    public List<MSansho2RegistForm> getMSansho2Grid() {
        return mSansho2Grid;
    }

    /**
     * @param p
     */
    public void setMSansho2Grid(final List<MSansho2RegistForm> p) {
        this.mSansho2Grid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
