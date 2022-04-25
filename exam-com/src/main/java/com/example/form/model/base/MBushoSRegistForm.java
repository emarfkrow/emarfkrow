package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MBushoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MBushoRegistForm.class);

    /** 部署マスタ */
    @Valid
    private List<MBushoRegistForm> mBushoGrid;

    /**
     * @return 部署マスタ
     */
    public List<MBushoRegistForm> getMBushoGrid() {
        return mBushoGrid;
    }

    /**
     * @param p
     */
    public void setMBushoGrid(final List<MBushoRegistForm> p) {
        this.mBushoGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
