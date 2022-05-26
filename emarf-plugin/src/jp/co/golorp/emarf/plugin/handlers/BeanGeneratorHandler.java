package jp.co.golorp.emarf.plugin.handlers;

import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.generator.BeanGenerator;
import jp.co.golorp.emarf.util.ResourceBundles;

public class BeanGeneratorHandler extends AbstractHandler {

    /**
     *
     */
    @Override
    public Object execute(final ExecutionEvent event) throws ExecutionException {

        // ワークベンチ取得
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        if (window == null) {
            return null;
        }

        // プロジェクト取得
        IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
        Object firstElement = selection.getFirstElement();
        if (!(firstElement instanceof IAdaptable)) {
            return null;
        }
        IProject project = (IProject) ((IAdaptable) firstElement).getAdapter(IProject.class);

        // プロジェクトのフルパス取得
        String projectDir = project.getLocation().toOSString();

        // クラスパスファイル取得
        File classpathFile = new File(projectDir + File.separator + ".classpath");

        // クラスパスファイルをXMLとして取得
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document = null;
        try {
            document = factory.newDocumentBuilder().parse(classpathFile);
        } catch (Exception e) {
            throw new SysError(e);
        }

        String beanGeneratorPropPath = null;

        // <classpathentry kind="src" path="***"/>のpathをResourceBundleに設定
        Element rootNode = document.getDocumentElement();
        NodeList childNodes = rootNode.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node childNode = childNodes.item(i);
            if (!childNode.getNodeName().equals("classpathentry")) {
                continue;
            }
            NamedNodeMap namedNodeMap = childNode.getAttributes();
            Node kindNode = namedNodeMap.getNamedItem("kind");
            if (kindNode == null) {
                continue;
            }
            String kindNodeValue = kindNode.getNodeValue();
            if (!kindNodeValue.equals("src")) {
                continue;
            }
            Node pathNode = namedNodeMap.getNamedItem("path");
            String srcPath = pathNode.getNodeValue();

            String srcDir = projectDir + File.separator + srcPath;
            if (new File(srcDir + File.separator + "BeanGenerator.properties").exists()) {
                beanGeneratorPropPath = srcDir + File.separator + "BeanGenerator.properties";
            }

            ResourceBundles.getSrcPaths().add(srcDir);
        }

        if (beanGeneratorPropPath == null) {
            MessageDialog.openInformation(window.getShell(), "Plugin",
                    "in project, not exist [BeanGenerator.properties].");
            return null;
        }

        BeanGenerator.generate(projectDir, true);

        // メッセージ表示
        MessageDialog.openInformation(window.getShell(), "Plugin", "generated.");

        return null;
    }

}
