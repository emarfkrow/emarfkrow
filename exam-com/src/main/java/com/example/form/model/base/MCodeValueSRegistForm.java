package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MCodeValueSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MCodeValueRegistForm.class);

    /** コード値マスタ */
    @Valid
    private List<MCodeValueRegistForm> mCodeValueGrid;

    /**
     * @return コード値マスタ
     */
    public List<MCodeValueRegistForm> getMCodeValueGrid() {
        return mCodeValueGrid;
    }

    /**
     * @param p
     */
    public void setMCodeValueGrid(final List<MCodeValueRegistForm> p) {
        this.mCodeValueGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
