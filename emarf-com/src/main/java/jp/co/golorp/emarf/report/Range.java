package jp.co.golorp.emarf.report;

public class Range {

    /**
     *
     */
    private Integer boR = Integer.MAX_VALUE;

    /**
     * @return Integer
     */
    public Integer getBoR() {
        return boR;
    }

    /**
     * @param r
     */
    public void setBoR(final Integer r) {
        if (boR > r) {
            boR = r;
        }

    }

    /**
     *
     */
    private Integer eoR = 0;

    /**
     * @return Integer
     */
    public Integer getEoR() {
        return eoR;
    }

    /**
     * @param r
     */
    public void setEoR(final Integer r) {
        if (eoR < r) {
            eoR = r;
        }
    }

    /**
     *
     */
    private Integer boC = Integer.MAX_VALUE;

    /**
     * @return Integer
     */
    public Integer getBoC() {
        return boC;
    }

    /**
     * @param c
     */
    public void setBoC(final Integer c) {
        if (boC > c) {
            boC = c;
        }
    }

    /**
     *
     */
    private Integer eoC = 0;

    /**
     * @return Integer
     */
    public Integer getEoC() {
        return eoC;
    }

    /**
     * @param c
     */
    public void setEoC(final Integer c) {
        if (eoC < c) {
            eoC = c;
        }
    }

}
