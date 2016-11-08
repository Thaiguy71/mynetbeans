/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr.nb.csv.filetype;

import java.awt.BorderLayout;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import org.netbeans.core.spi.multiview.CloseOperationState;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.MultiViewElementCallback;
import org.openide.awt.UndoRedo;
import org.openide.cookies.EditorCookie;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.view.NodeTableModel;
import org.openide.explorer.view.TableView;
import org.openide.filesystems.FileObject;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import org.pr.nb.csv.nodes.CSVSheetNode;
import org.pr.nb.csv.nodes.data.CSVSheet;

@MultiViewElement.Registration(
        displayName = "#LBL_NBCSVFileType_VISUAL",
        iconBase = "org/pr/nb/csv/filetype/text_csv16.png",
        mimeType = "text/x-csv",
        persistenceType = TopComponent.PERSISTENCE_NEVER,
        preferredID = "NBCSVFileTypeVisual"
        
)
@Messages("LBL_NBCSVFileType_VISUAL=Visual")
public final class NBCSVFileTypeVisualElement extends JPanel implements MultiViewElement, ExplorerManager.Provider {

    private NBCSVFileTypeDataObject obj;
    private JToolBar toolbar = new JToolBar();
    private transient MultiViewElementCallback callback;

    private transient final ExplorerManager explorerManager = new ExplorerManager();
    private transient TableView view;

    public NBCSVFileTypeVisualElement(Lookup lkp) {
        obj = lkp.lookup(NBCSVFileTypeDataObject.class);
        assert obj != null;
        initComponents();
        view = new TableView();
        add(view, BorderLayout.CENTER);
    }

    @Override
    public String getName() {
        return "NBCSVFileTypeVisualElement";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public JComponent getVisualRepresentation() {
        return this;
    }

    @Override
    public JComponent getToolbarRepresentation() {
        return toolbar;
    }

    @Override
    public Action[] getActions() {
        return new Action[0];
    }

    @Override
    public Lookup getLookup() {
        return obj.getLookup();
    }

    @Override
    public void componentOpened() {
    }

    @Override
    public void componentClosed() {
    }

    @Override
    public void componentShowing() {
    }

    @Override
    public void componentHidden() {
    }

    @Override
    public void componentActivated() {
        EditorCookie cookie = obj.getLookup().lookup(EditorCookie.class);
        Document doc = cookie.getDocument();
        if (doc != null) {
            try {
                String text = doc.getText(0, doc.getLength());
                FileObject fobj = obj.getPrimaryFile();
                CSVSheet sheetFromText = new CSVSheet(fobj.getNameExt(), fobj, text);
                CSVSheetNode node = new CSVSheetNode(sheetFromText);

                Node[] rowNodes = node.getChildren().getNodes();
                System.out.println("Number of nodes " + rowNodes.length);
                NodeTableModel model = new NodeTableModel();
                model.setNodes(rowNodes);
                model.setProperties(CSVSheetNode.columnNames());
                view.getTable().setModel(model);
                System.out.println("Number of table rows " + view.getTable().getRowCount());
                explorerManager.setRootContext(node);

            } catch (BadLocationException ex) {
                Exceptions.printStackTrace(ex);
            }
        }

    }

    @Override
    public void componentDeactivated() {
    }

    @Override
    public UndoRedo getUndoRedo() {
        return UndoRedo.NONE;
    }

    @Override
    public void setMultiViewCallback(MultiViewElementCallback callback) {
        this.callback = callback;
        callback.updateTitle(obj.getName());
    }

    @Override
    public CloseOperationState canCloseElement() {
        return CloseOperationState.STATE_OK;
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return explorerManager;
    }

}
