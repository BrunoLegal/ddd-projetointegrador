/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.views.convenio;

import br.edu.imepac.controladores.ConvenioController;
import br.edu.imepac.entidades.Convenio;
import br.edu.imepac.utils.IRolesForms;
import br.edu.imepac.views.BaseForm;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
/**
 *
 * @author morei
 */
public class AtualizarConvenio extends BaseForm implements IRolesForms<Convenio> {
    ConvenioController convenioController;
    /**
     * Creates new form AtualizarFuncionario
     */
    public AtualizarConvenio() {
        initComponents();
        this.convenioController = new ConvenioController(this);
        this.loadTable();
    }
    
        private void clearFields(){
        nomeField.setText("");
        cnpjField.setText("");
        telefoneField.setText("");
    }
        
           public Convenio createEntityViewRepresentation() {
        return new Convenio(
                Long.parseLong(convenioTable.getValueAt(convenioTable.getSelectedRow(), 0).toString()),
                nomeField.getText(),
                cnpjField.getText(),
                telefoneField.getText());
    }
        @Override   
               public boolean isFieldsFormsValidate() {
        if(nomeField.getText().isBlank() || nomeField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de Nome!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(cnpjField.getText().isBlank() || cnpjField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de CNPJ!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(telefoneField.getText().isBlank() || telefoneField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de Telefone!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
               
        private void loadTable() {
        ArrayList<Convenio> convenios = this.convenioController.findAllConvenio();

        DefaultTableModel model = (DefaultTableModel) convenioTable.getModel();
        model.setRowCount(0);
        for(Convenio convenio: convenios){
            model.addRow(new Object[]{
                    convenio.getcodigo_convenio(),
                    convenio.getempresa_convenio(),
                    convenio.getcnpj(),
                    convenio.gettelefone()
            });
        }
    }
        
        
    /**
     * Creates new form AtualizarConvenio
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cnpjField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefoneField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        convenioTable = new javax.swing.JTable();
        atualizarButton = new javax.swing.JButton();
        preencherButton = new javax.swing.JButton();
        DeletarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Atualizar Convênio");

        jLabel2.setText("Nome do Convênio: ");

        jLabel3.setText("Digite o CNPJ: ");

        jLabel4.setText("Digite o Telefone: ");

        convenioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CNPJ", "Telefone"
            }
        ));
        convenioTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                convenioTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(convenioTable);

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        preencherButton.setText("Preencher");
        preencherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preencherButtonActionPerformed(evt);
            }
        });

        DeletarButton.setText("Deletar");
        DeletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeField)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cnpjField)
                            .addComponent(telefoneField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)))
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atualizarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(preencherButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeletarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atualizarButton)
                            .addComponent(preencherButton)
                            .addComponent(DeletarButton))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        // TODO add your handling code here:
            if(isFieldsFormsValidate()){
            try {
                if(this.showConfirmYesOrNoDialog("Deseja mesmo atualizar os dados do convenio " + convenioTable.getValueAt(convenioTable.getSelectedRow(), 1)+"?")==0) {
                    this.convenioController.updateConvenio(createEntityViewRepresentation());
                    this.showSuccessMessage("convenio Atualizado");
                    nomeField.setText("");
                    cnpjField.setText("");
                    telefoneField.setText("");
                    this.loadTable();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                this.showWarningMessage("Selecione um convenio para atualizar!");
            }
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void preencherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preencherButtonActionPerformed
        // TODO add your handling code here:
         try {
            int row = convenioTable.getSelectedRow();
            nomeField.setText(convenioTable.getValueAt(row, 1).toString());
            cnpjField.setText(convenioTable.getValueAt(row, 2).toString());
            telefoneField.setText(convenioTable.getValueAt(row, 3).toString());
            
            }catch (ArrayIndexOutOfBoundsException e){
            this.showWarningMessage("Selecione um funcionario para auto preencher os dados!");
        }   
    }//GEN-LAST:event_preencherButtonActionPerformed

    private void convenioTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_convenioTableFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_convenioTableFocusGained

    private void DeletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarButtonActionPerformed
        try{
            if(this.showConfirmYesOrNoDialog("Deseja mesmo deletar o convenio "+convenioTable.getValueAt(convenioTable.getSelectedRow(),1).toString() +"?") == 0){
                this.convenioController.deleteConvenio(Long.parseLong(convenioTable.getValueAt(convenioTable.getSelectedRow(),0).toString()));
                this.showSuccessMessage("Convenio deletado com sucesso");
                clearFields();
                this.loadTable();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            this.showWarningMessage("Escolha um convenio para excluir");
        }
        
    }//GEN-LAST:event_DeletarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AtualizarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarConvenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarConvenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletarButton;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField cnpjField;
    private javax.swing.JTable convenioTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JButton preencherButton;
    private javax.swing.JTextField telefoneField;
    // End of variables declaration//GEN-END:variables
}
