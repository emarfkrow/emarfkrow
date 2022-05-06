package jp.co.golorp.emarf.servlet.http;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

import jp.co.golorp.emarf.generator.BeanGenerator;
import jp.co.golorp.emarf.io.FileUtil;

/**
 * Application Lifecycle Listener implementation class EmarfListener
 *
 */
@WebListener
public class EmarfListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener,
        HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener, HttpSessionIdListener,
        ServletRequestListener, ServletRequestAttributeListener, AsyncListener {

    /** プロジェクトディレクトリ */
    private String projectDir;

    /**
     * Default constructor.
     */
    public EmarfListener() {
    }

    /* *****************************
     * コンテキスト
     ******************************/

    /**
     * @param sce
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(final ServletContextEvent sce) {
    }

    /**
     * @param sce
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(final ServletContextEvent sce) {
    }

    /* *****************************
     * コンテキスト属性
     ******************************/

    /**
     * @param event
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(final ServletContextAttributeEvent event) {
    }

    /**
     * @param event
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(final ServletContextAttributeEvent event) {
    }

    /**
     * @param event
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(final ServletContextAttributeEvent event) {
    }

    /* *****************************
     * セッション
     ******************************/

    /**
     * @param se
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(final HttpSessionEvent se) {
    }

    /**
     * @param se
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(final HttpSessionEvent se) {
    }

    /* *****************************
     * セッション属性
     ******************************/

    /**
     * @param event
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(final HttpSessionBindingEvent event) {
    }

    /**
     * @param event
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(final HttpSessionBindingEvent event) {
    }

    /**
     * @param event
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(final HttpSessionBindingEvent event) {
    }

    /* *****************************
     * セッション アクティベーション
     ******************************/

    /**
     * @param se
     * @see HttpSessionActivationListener#sessionWillPassivate(HttpSessionEvent)
     */
    public void sessionWillPassivate(final HttpSessionEvent se) {
    }

    /**
     * @param se
     * @see HttpSessionActivationListener#sessionDidActivate(HttpSessionEvent)
     */
    public void sessionDidActivate(final HttpSessionEvent se) {
    }

    /* *****************************
     * セッション バインディング
     ******************************/

    /**
     * @param event
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(final HttpSessionBindingEvent event) {
    }

    /**
     * @param event
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(final HttpSessionBindingEvent event) {
    }

    /* *****************************
     * セッションID
     ******************************/

    /**
     * @param event
     * @param oldSessionId
     * @see HttpSessionIdListener#sessionIdChanged(HttpSessionEvent, String)
     */
    public void sessionIdChanged(final HttpSessionEvent event, final String oldSessionId) {
    }

    /* *****************************
     * リクエスト
     ******************************/

    /**
     * @param sre
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(final ServletRequestEvent sre) {

        if (projectDir == null) {

            projectDir = sre.getServletContext().getRealPath("");

            BeanGenerator.generate(projectDir, false);

            FileUtil.setContextDir(projectDir);
        }
    }

    /**
     * @param sre
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(final ServletRequestEvent sre) {
    }

    /* *****************************
     * リクエスト属性
     ******************************/

    /**
     * @param srae
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(final ServletRequestAttributeEvent srae) {
    }

    /**
     * @param srae
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(final ServletRequestAttributeEvent srae) {
    }

    /**
     * @param srae
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(final ServletRequestAttributeEvent srae) {
    }

    /* *****************************
     * 非同期通信
     ******************************/

    /**
     * @param event
     * @see AsyncListener#onStartAsync(AsyncEvent)
     */
    public void onStartAsync(final AsyncEvent event) throws java.io.IOException {
    }

    /**
     * @param event
     * @see AsyncListener#onError(AsyncEvent)
     */
    public void onError(final AsyncEvent event) throws java.io.IOException {
    }

    /**
     * @param event
     * @see AsyncListener#onTimeout(AsyncEvent)
     */
    public void onTimeout(final AsyncEvent event) throws java.io.IOException {
    }

    /**
     * @param event
     * @see AsyncListener#onComplete(AsyncEvent)
     */
    public void onComplete(final AsyncEvent event) throws java.io.IOException {
    }

}
