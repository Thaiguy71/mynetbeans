/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr.nb.zip.wizard;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.event.ChangeListener;
import org.openide.util.ChangeSupport;
import org.openide.util.NbBundle;
import org.pr.nb.zip.UserSelections;

@NbBundle.Messages({
    "ExportZipVisualPanel2_NAME=Contents to archive",
    "ExportZipVisualPanel2.addSelectedButton.text=>",
    "ExportZipVisualPanel2.addAllButton.text=>>",
    "ExportZipVisualPanel2.removeSelectedButton.text=<",
    "ExportZipVisualPanel2.removeAllButton.text=<<"
})
public final class ExportZipVisualPanel2 extends JPanel implements ComponentMessagingInterface {


    
    /**
     * Creates new form ExportZipVisualPanel2
     */
    public ExportZipVisualPanel2() {
        initComponents();
        support = new ChangeSupport(this);
    }

    @Override
    public String getName() {
        return Bundle.ExportZipVisualPanel2_NAME();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane2 = new javax.swing.JScrollPane();
        originalSelectionList = new javax.swing.JList<ExportArchiveListValueObject>();
        jPanel1 = new javax.swing.JPanel();
        addSelectedButton = new javax.swing.JButton();
        addAllButton = new javax.swing.JButton();
        removeSelectedButton = new javax.swing.JButton();
        removeAllButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        newSelectionList = new javax.swing.JList<ExportArchiveListValueObject>();

        originalSelectionList.setCellRenderer(new ExportArchiveListCellRenderer());
        jScrollPane2.setViewportView(originalSelectionList);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(addSelectedButton, Bundle.ExportZipVisualPanel2_addSelectedButton_text());
        addSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionButtonsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(addSelectedButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(addAllButton, Bundle.ExportZipVisualPanel2_addAllButton_text());
        addAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionButtonsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(addAllButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(removeSelectedButton, Bundle.ExportZipVisualPanel2_removeSelectedButton_text());
        removeSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionButtonsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(removeSelectedButton, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(removeAllButton, Bundle.ExportZipVisualPanel2_removeAllButton_text());
        removeAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionButtonsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel1.add(removeAllButton, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jLabel2, gridBagConstraints);

        newSelectionList.setCellRenderer(new ExportArchiveListCellRenderer());
        jScrollPane1.setViewportView(newSelectionList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectionButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionButtonsActionPerformed

        if (evt.getSource() == addSelectedButton) {
            migrateValues(originalSelectionList, newSelectionList, false);
        } else if (evt.getSource() == addAllButton) {
            migrateValues(originalSelectionList, newSelectionList, true);
        } else if (evt.getSource() == removeSelectedButton) {
            migrateValues(newSelectionList, originalSelectionList, false);
        } else if (evt.getSource() == removeAllButton) {
            migrateValues(newSelectionList, originalSelectionList, true);
        }
    }//GEN-LAST:event_selectionButtonsActionPerformed
    
    private void migrateValues(JList<ExportArchiveListValueObject> fromList, JList<ExportArchiveListValueObject> toList, boolean all){
        ExportArchiveListModel fromModel = (ExportArchiveListModel)fromList.getModel();
        ExportArchiveListModel toModel = (ExportArchiveListModel)toList.getModel();
        List<ExportArchiveListValueObject> selectedValues = null;
        if(all){
            selectedValues = fromModel.getItems();
        }else{
            selectedValues = fromList.getSelectedValuesList();
        }
        if(selectedValues == null){
            selectedValues = new ArrayList<ExportArchiveListValueObject>();
        }
        toModel.addAll(selectedValues);
        fromModel.removeAll(selectedValues);
        support.fireChange();
    }

    @Override
    public void setValue(UserSelections selections) {
        this.selections = selections;
        if (this.selections != null) {
            ListModel<ExportArchiveListValueObject> model = new ExportArchiveListModel(selections.getOriginalSelectedFiles());
            originalSelectionList.setModel(model);
            model = new ExportArchiveListModel(selections.getUserSelectedFilesInWizard());
            newSelectionList.setModel(model);
        }
    }

    @Override
    public UserSelections getValue() {
        if (selections != null) {
            ExportArchiveListModel model = (ExportArchiveListModel) originalSelectionList.getModel();
            selections.setOriginalSelectedFiles(model.getItems());
            model = (ExportArchiveListModel) newSelectionList.getModel();
            selections.setUserSelectedFilesInWizard(model.getItems());
        }
        return selections;
    }

    @Override
    public Boolean isPanelValid() {
        ExportArchiveListModel model = (ExportArchiveListModel) newSelectionList.getModel();
        return model.getSize() > 0;
    }
    
    public void addChangeListener(ChangeListener l) {
        support.addChangeListener(l);
    }

    public void removeChangeListener(ChangeListener l) {
        support.removeChangeListener(l);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAllButton;
    private javax.swing.JButton addSelectedButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<ExportArchiveListValueObject> newSelectionList;
    private javax.swing.JList<ExportArchiveListValueObject> originalSelectionList;
    private javax.swing.JButton removeAllButton;
    private javax.swing.JButton removeSelectedButton;
    // End of variables declaration//GEN-END:variables
    private UserSelections selections;

    private ChangeSupport support;
}
