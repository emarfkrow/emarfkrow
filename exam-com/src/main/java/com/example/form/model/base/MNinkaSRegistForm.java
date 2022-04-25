package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

public class MNinkaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MNinkaRegistForm.class);

    /** 認可マスタ */
    @Valid
    private List<MNinkaRegistForm> mNinkaGrid;

    /**
     * @return 認可マスタ
     */
    public List<MNinkaRegistForm> getMNinkaGrid() {
        return mNinkaGrid;
    }

    /**
     * @param p
     */
    public void setMNinkaGrid(final List<MNinkaRegistForm> p) {
        this.mNinkaGrid = p;
    }

    /**
     * correlation check
     */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
