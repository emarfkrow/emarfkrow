/**
 *
 */
package jp.co.golorp.emarf.generator;

import java.io.File;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * @author toshiyuki
 *
 */
class BeanGeneratorTest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @BeforeEach
    void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterEach
    void tearDown() throws Exception {
    }

    /**
     * {@link jp.co.golorp.emarf.generator.BeanGenerator#generate(java.lang.String, boolean)} のためのテスト・メソッド。
     */
    @Test
    final void testGenerate() {
        //String s = "C:\\Users\\toshiyuki\\git\\emarfkrow\\exam-com";
        String s = "C:\\Users\\toshiyuki\\Tools\\pleiades-2021-12-java-win-64bit-jre_20220106\\pleiades\\runtime-Eclipseアプリケーション\\knps-com";
        ResourceBundles.getSrcPaths().add(s + File.separator + "src\\main\\resources");
        BeanGenerator.generate(s, true);
    }

}
