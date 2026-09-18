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

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.report.PdfUtil;

/**
 * Servlet implementation class XlsxServlet
 *
 * @author golorp
 */
@WebServlet("*.pdf")
public final class PdfServlet extends XlsxServlet {

    private static final long serialVersionUID = 1L;

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PdfServlet.class);

    /**
     * @see jakarta.servlet.http.HttpServlet#HttpServlet()
     */
    public PdfServlet() {
        super();
    }

    /**
     * @param request
     * @param response
     * @see jakarta.servlet.http.HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        String tempFilePath = getGenXlsxPath(request, response);

        if (tempFilePath != null) {

            String pdfPath = PdfUtil.byXlsx(tempFilePath);

            LOG.trace("pdfPath: " + pdfPath);
            ServletUtil.respondDelete(response, pdfPath);
        }
    }

    /**
     * @param request
     * @param response
     * @see jakarta.servlet.http.HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
