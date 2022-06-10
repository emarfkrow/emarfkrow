package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 人事マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MJinjiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MJinjiRegistForm.class);

    /** 社員番号 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 4)
    private String shainNo;

    /**
     * @return 社員番号
     */
    public String getShainNo() {
        return shainNo;
    }

    /**
     * @param p 社員番号
     */
    public void setShainNo(final String p) {
        this.shainNo = p;
    }

    /** 社員名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String shainMei;

    /**
     * @return 社員名
     */
    public String getShainMei() {
        return shainMei;
    }

    /**
     * @param p 社員名
     */
    public void setShainMei(final String p) {
        this.shainMei = p;
    }

    /** 人事所属コード */
    @jakarta.validation.constraints.Size(max = 6)
    private String jinjiShozokucd;

    /**
     * @return 人事所属コード
     */
    public String getJinjiShozokucd() {
        return jinjiShozokucd;
    }

    /**
     * @param p 人事所属コード
     */
    public void setJinjiShozokucd(final String p) {
        this.jinjiShozokucd = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
