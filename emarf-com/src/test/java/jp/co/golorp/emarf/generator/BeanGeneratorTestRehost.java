/**
 *
 */
package jp.co.golorp.emarf.generator;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

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
public class BeanGeneratorTestRehost {

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

        //プロジェクトパスを取得
        Path currentPath = Paths.get("");

        //パスの文字列を取得
        String absolutePath = currentPath.toAbsolutePath().toString();

        //ソースパスにプロジェクトパスのリソースフォルダを追加
        ResourceBundles.getSrcPaths().add(absolutePath + File.separator + "src\\main\\resources");

        //ジェネレータ起動
        BeanGenerator.generate(absolutePath);
    }

}
