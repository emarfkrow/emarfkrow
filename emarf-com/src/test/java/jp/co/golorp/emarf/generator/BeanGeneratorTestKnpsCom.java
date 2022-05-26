/**
 *
 */
package jp.co.golorp.emarf.generator;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * @author toshiyuki
 *
 */
public class BeanGeneratorTestKnpsCom {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * {@link jp.co.golorp.emarf.generator.BeanGenerator#generate(java.lang.String, boolean)} のためのテスト・メソッド。
     */
    @Test
    public final void testGenerate() {
        String s = "C:\\Users\\toshiyuki\\Tools\\pleiades-2021-12-java-win-64bit-jre_20220106\\pleiades\\runtime-Eclipseアプリケーション\\knps-com";
        ResourceBundles.getSrcPaths().add(s + File.separator + "src\\main\\resources");
        BeanGenerator.generate(s, true);
    }

}
