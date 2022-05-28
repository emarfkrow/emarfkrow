package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_MATERIAL登録フォーム
 *
 * @author emarfkrow
 */
public class MstMaterialRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstMaterialRegistForm.class);

    /** MATERIAL */
    @jakarta.validation.constraints.Size(max = 5)
    private String material;

    /**
     * @return MATERIAL
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param p MATERIAL
     */
    public void setMaterial(final String p) {
        this.material = p;
    }

    /** MATERIAL_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String materialName;

    /**
     * @return MATERIAL_NAME
     */
    public String getMaterialName() {
        return materialName;
    }

    /**
     * @param p MATERIAL_NAME
     */
    public void setMaterialName(final String p) {
        this.materialName = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
