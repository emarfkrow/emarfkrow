package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 添付ファイル一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TTenpuFileSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TTenpuFileRegistForm.class);

    /** 添付ファイル登録フォームのリスト */
    @Valid
    private List<TTenpuFileRegistForm> tTenpuFileGrid;

    /**
     * @return 添付ファイル登録フォームのリスト
     */
    public List<TTenpuFileRegistForm> getTTenpuFileGrid() {
        return tTenpuFileGrid;
    }

    /**
     * @param p 添付ファイル登録フォームのリスト
     */
    public void setTTenpuFileGrid(final List<TTenpuFileRegistForm> p) {
        this.tTenpuFileGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
