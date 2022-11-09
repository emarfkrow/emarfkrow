package jp.co.golorp.emarf.servlet;

import org.junit.Test;

/**
 * @author golorp
 */
public class ServiceFilterTest {

    /**
     * サービス時間チェック
     */
    @Test
    public void testIsService() {

        //        // 全停止
        //        Assert.assertFalse(ServiceFilter.isService("* * * * *", "* * * * *"));
        //
        //        // 日曜停止
        //        Assert.assertTrue(ServiceFilter.isService("* * * * 0", "* * * * 0"));
        //        // 月曜停止
        //        Assert.assertTrue(ServiceFilter.isService("* * * * 1", "* * * * 1"));
        //        // 火曜停止
        //        Assert.assertTrue(ServiceFilter.isService("* * * * 2", "* * * * 2"));
        //        // 水曜停止
        //        Assert.assertFalse(ServiceFilter.isService("* * * * 3", "* * * * 3"));
        //        // 木曜停止
        //        Assert.assertTrue(ServiceFilter.isService("* * * * 4", "* * * * 4"));
        //        // 金曜停止
        //        Assert.assertTrue(ServiceFilter.isService("* * * * 5", "* * * * 5"));
        //        // 土曜停止
        //        Assert.assertTrue(ServiceFilter.isService("* * * * 6", "* * * * 6"));
        //
        //        // 8:30～9:30停止
        //        Assert.assertTrue(ServiceFilter.isService("30 8 * * *", "30 9 * * *"));
        //        // 9:30～10:30停止
        //        Assert.assertFalse(ServiceFilter.isService("30 9 * * *", "30 10 * * *"));
        //        // 10:30～11:30停止
        //        Assert.assertTrue(ServiceFilter.isService("30 10 * * *", "30 11 * * *"));
        //
        //        // 9:30～翌8:30停止
        //        Assert.assertFalse(ServiceFilter.isService("30 9 * * *", "30 8 * * *"));
        //        // 10:30～翌9:30停止
        //        Assert.assertTrue(ServiceFilter.isService("30 10 * * *", "30 9 * * *"));
        //        // 11:30～翌10:30停止
        //        Assert.assertFalse(ServiceFilter.isService("30 11 * * *", "30 10 * * *"));
        //
        //        // 10/01～10/31停止
        //        Assert.assertTrue(ServiceFilter.isService("* * 1 10 *", "* * 31 10 *"));
        //        // 11/01～4/30停止
        //        Assert.assertFalse(ServiceFilter.isService("* * 1 11 *", "* * 30 4 *"));
        //        // 11/01～11/30停止
        //        Assert.assertFalse(ServiceFilter.isService("* * 1 11 *", "* * 30 11 *"));
        //        // 12/01～12/31停止
        //        Assert.assertTrue(ServiceFilter.isService("* * 1 12 *", "* * 31 12 *"));
    }

}
