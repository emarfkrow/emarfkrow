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

package jp.co.golorp.emarf.servlet.http;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequest;
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
import jp.co.golorp.emarf.properties.App;

/**
 * Application Lifecycle Listener implementation class EmarfListener
 *
 * @author golorp
 */
@WebListener
public class EmarfListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener,
        HttpSessionAttributeListener, HttpSessionActivationListener, HttpSessionBindingListener, HttpSessionIdListener,
        ServletRequestListener, ServletRequestAttributeListener, AsyncListener {

    /** プロジェクトディレクトリ */
    private String contextRealPath;

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

        //リクエスト時にプロジェクトパスが未取得なら実行
        //起動後初回アクセス時のみという事
        //時間内にサーブレットが起動しないとエラーになるため
        if (contextRealPath == null) {

            //プロジェクトパスを取得（「実行済み」のフラグとする）
            contextRealPath = sre.getServletContext().getRealPath("");

            //サーブレットURLを退避
            ServletRequest sr = sre.getServletRequest();
            String schema = sr.getScheme();
            String serverName = sr.getServerName();
            int serverPort = sr.getServerPort();
            String contextPath = sre.getServletContext().getContextPath();
            ServletUtil.setServletUrl(schema + "://" + serverName + ":" + serverPort + contextPath);

            //実フォルダパスを退避
            FileUtil.setContextDir(contextRealPath);

            //自動生成を実行
            String isGenerate = App.get("EmarfListener.autogenerate");
            if (isGenerate.toLowerCase().equals("true")) {
                BeanGenerator.generate(contextRealPath);
            }
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
