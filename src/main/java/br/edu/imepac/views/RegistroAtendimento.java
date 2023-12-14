/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.views;

import br.edu.imepac.daos.AtendimentoDao;
import br.edu.imepac.controladores.AtendimentoController;
import br.edu.imepac.entidades.Atendimento;
import br.edu.imepac.utils.IRolesForms;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


/**
 *
 * @author osmar
 */
public class RegistroAtendimento extends BaseForm implements IRolesForms<Atendimento> {
    private final AtendimentoController atendimentoController;
    
    /**
     * Creates new form RegistroPaciente
     */
    public RegistroAtendimento() {
        initComponents();
        this.atendimentoController = new AtendimentoController(this);
        this.loadTable();
    }
    
     private void clearFields(){
        exameField.setText("");
        nreceitaField.setText("");
    }
     
     public Atendimento createEntityViewRepresentation() {
        return new Atendimento(
                Long.parseLong(atendimentotable.getValueAt(atendimentotable.getSelectedRow(), 0).toString()),
                exameField.getText(),
                nreceitaField.getText());
    }
    
private void loadTable() {
        ArrayList<Atendimento> atendimentos = this.atendimentoController.findAll();

        DefaultTableModel model = (DefaultTableModel) atendimentotable.getModel();
        model.setRowCount(0);
        for(Atendimento atendimento: atendimentos){
            model.addRow(new Object[]{
                    atendimento.getRegistro_agenda(),
                    atendimento.getHistorico(),
                    atendimento.getReceituario(),
                    atendimento.getExames()
            });
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        atendimentotable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        exameField = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        nreceitaField = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        adicionarField = new javax.swing.JButton();
        preencherField = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atendimentotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "id Paciente", "historico", "receituario", "exames"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        atendimentotable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                atendimentotableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(atendimentotable);

        jLabel1.setText("Nova receita");

        exameField.setColumns(20);
        exameField.setRows(5);
        jScrollPane2.setViewportView(exameField);

        nreceitaField.setColumns(20);
        nreceitaField.setRows(5);
        jScrollPane3.setViewportView(nreceitaField);

        jLabel2.setText("Exame");

        adicionarField.setText("Adicionar");
        adicionarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarFieldActionPerformed(evt);
            }
        });

        preencherField.setText("Preencher");
        preencherField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preencherFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(adicionarField)
                                .addGap(18, 18, 18)
                                .addComponent(preencherField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(306, 306, 306))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adicionarField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preencherField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void atendimentotableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_atendimentotableAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_atendimentotableAncestorAdded

    private void adicionarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFieldActionPerformed
        // TODO add your handling code here:
        try {
            if(this.showConfirmYesOrNoDialog("Deseja mesmo adicionar o atendimento ao registro " + atendimentotable.getValueAt(atendimentotable.getSelectedRow(), 1)+"?")==0) {
                atendimentoController.updateAtendimento(createEntityViewRepresentation());
                this.showSuccessMessage("atendimento adicionado ao registro");
                this.clearFields();
                this.loadTable();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            this.showWarningMessage("Selecione um paciente para atualizar!");
        }
        
    }//GEN-LAST:event_adicionarFieldActionPerformed

    private void preencherFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preencherFieldActionPerformed
        // TODO add your handling code here:
        try {
            int row = atendimentotable.getSelectedRow();
            exameField.setText(atendimentotable.getValueAt(row, 1).toString());
            nreceitaField.setText(atendimentotable.getValueAt(row, 2).toString());
      
 
        }catch (ArrayIndexOutOfBoundsException e){
            this.showWarningMessage("Selecione uma consulta para auto preencher o registro!");
        }
    }//GEN-LAST:event_preencherFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAtendimento().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarField;
    private javax.swing.JTable atendimentotable;
    private javax.swing.JTextArea exameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea nreceitaField;
    private javax.swing.JButton preencherField;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean isFieldsFormsValidate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}