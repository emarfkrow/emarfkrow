/*
Copyright 2022 golorp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package jp.co.golorp.emarf.report;

/**
 * セル範囲クラス
 *
 * @author golorp
 */
public class Range {

    /** 開始行 */
    private Integer boR = Integer.MAX_VALUE;

    /**
     * @return 開始行
     */
    public Integer getBoR() {
        return boR;
    }

    /**
     * @param r 開始行
     */
    public void setBoR(final Integer r) {
        if (boR > r) {
            boR = r;
        }

    }

    /** 終了行 */
    private Integer eoR = 0;

    /**
     * @return 終了行
     */
    public Integer getEoR() {
        return eoR;
    }

    /**
     * @param r 終了行
     */
    public void setEoR(final Integer r) {
        if (eoR < r) {
            eoR = r;
        }
    }

    /** 開始列 */
    private Integer boC = Integer.MAX_VALUE;

    /**
     * @return 開始列
     */
    public Integer getBoC() {
        return boC;
    }

    /**
     * @param c 開始列
     */
    public void setBoC(final Integer c) {
        if (boC > c) {
            boC = c;
        }
    }

    /** 終了列 */
    private Integer eoC = 0;

    /**
     * @return 終了列
     */
    public Integer getEoC() {
        return eoC;
    }

    /**
     * @param c 終了列
     */
    public void setEoC(final Integer c) {
        if (eoC < c) {
            eoC = c;
        }
    }

}
