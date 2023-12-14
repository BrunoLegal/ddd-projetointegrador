/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.views.medico;

import br.edu.imepac.controladores.EspecialidadeController;
import br.edu.imepac.controladores.MedicoController;
import br.edu.imepac.entidades.Especialidade;
import br.edu.imepac.entidades.Funcionario;
import br.edu.imepac.entidades.Medico;
import br.edu.imepac.utils.IRolesForms;
import br.edu.imepac.views.BaseForm;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class AtualizarMedico extends BaseForm implements IRolesForms<Medico> {
    MedicoController medicoController;
    EspecialidadeController especialidadeController;
    /**
     * Creates new form AtualizarMedico
     */
    public AtualizarMedico() {
        initComponents();
        medicoController = new MedicoController(this);
        especialidadeController = new EspecialidadeController(this);
        this.loadTables();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atualizarButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        crmField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        especialidadeTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomeMedicoField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicoTable = new javax.swing.JTable();
        preencherButton = new javax.swing.JButton();
        removerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        atualizarButton.setBackground(new java.awt.Color(51, 153, 255));
        atualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("CRM");

        jLabel20.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Especialidade");

        especialidadeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(especialidadeTable);
        if (especialidadeTable.getColumnModel().getColumnCount() > 0) {
            especialidadeTable.getColumnModel().getColumn(0).setMinWidth(30);
            especialidadeTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            especialidadeTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel2.setText("Atualizar Medico");

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Nome Completo");

        medicoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CRM", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicoTable.setColumnSelectionAllowed(true);
        medicoTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(medicoTable);
        medicoTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        preencherButton.setBackground(new java.awt.Color(51, 153, 255));
        preencherButton.setForeground(new java.awt.Color(255, 255, 255));
        preencherButton.setText("Preencher");
        preencherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preencherButtonActionPerformed(evt);
            }
        });

        removerButton.setBackground(new java.awt.Color(51, 153, 255));
        removerButton.setForeground(new java.awt.Color(255, 255, 255));
        removerButton.setText("Remover");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(crmField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(nomeMedicoField, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(256, 256, 256))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(atualizarButton)
                        .addGap(18, 18, 18)
                        .addComponent(removerButton)
                        .addGap(18, 18, 18)
                        .addComponent(preencherButton)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeMedicoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(preencherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        if(isFieldsFormsValidate()){
            try {
                if(this.showConfirmYesOrNoDialog("Deseja mesmo atualizar os dados do medico " + medicoTable.getValueAt(medicoTable.getSelectedRow(), 1)+"?")==0) {
                    medicoController.updateMedico(createEntityViewRepresentation());
                    this.showSuccessMessage("Medico Atualizado");
                    this.clearFields();
                    this.loadTables();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                this.showWarningMessage("Selecione um medico para atualizar!");
            }
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void clearFields(){
        nomeMedicoField.setText("");
        crmField.setText("");
        especialidadeTable.changeSelection(0,0, false, false);
    }
    private static int acharID(TableModel model, Object id){
        int i;
        for(i = model.getRowCount()-1;i>=0;i--){
            if(model.getValueAt(i, 0) == id){
                return i;
            }
        }
        return -1;
    }

    private void preencherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preencherButtonActionPerformed
        try {
            nomeMedicoField.setText(medicoTable.getValueAt(medicoTable.getSelectedRow(), 1).toString());
            crmField.setText(medicoTable.getValueAt(medicoTable.getSelectedRow(),2).toString());
            especialidadeTable.changeSelection(acharID(especialidadeTable.getModel(), medicoTable.getValueAt(medicoTable.getSelectedRow(),3)), 0, false, false);
        }catch (ArrayIndexOutOfBoundsException e){
            this.showWarningMessage("Selecione um medico para autopreencher!");
        }
    }//GEN-LAST:event_preencherButtonActionPerformed

    private void removerButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        try {
            Long id = Long.parseLong(medicoTable.getValueAt(medicoTable.getSelectedRow(), 0).toString());
            if (showConfirmYesOrNoDialog("Deseja mesmo apagar o medico " + medicoTable.getValueAt(medicoTable.getSelectedRow(), 1) + "?") == 0) {
                Medico medico = medicoController.findMedico(id);
                medicoController.deleteMedico(id);
                loadTables();
                showSuccessMessage("Medico " + medico.getNome_Medico() + " Deletado com sucesso!" );
            }
        }catch (ArrayIndexOutOfBoundsException e){
            this.showWarningMessage("Selecione um medico para apagar!");
        }
    }//GEN-LAST:event_removerButtonActionPerformed
    @Override
    public Medico createEntityViewRepresentation() {
        return new Medico(
                Long.parseLong(medicoTable.getValueAt(medicoTable.getSelectedRow(), 0).toString()),
                medicoTable.getValueAt(medicoTable.getSelectedRow(),1).toString(),
                medicoTable.getValueAt(medicoTable.getSelectedRow(),2).toString(),
                Long.parseLong(especialidadeTable.getValueAt(especialidadeTable.getSelectedRow(),0).toString())
        );
    }

    private void loadTables(){
        ArrayList<Especialidade> especialidades = this.especialidadeController.findAllEspecialidade();
        ArrayList<Medico> medicos = this.medicoController.findAllMedico();

        DefaultTableModel model = (DefaultTableModel)especialidadeTable.getModel();
        model.setRowCount(0);
        for(Especialidade especialidade : especialidades){
            model.addRow(new Object[]{
                    especialidade.getCodigo_especialidade(),
                    especialidade.getDescricao_especialidade()
            });

        }
        model = (DefaultTableModel)medicoTable.getModel();
        model.setRowCount(0);
        for(Medico medico : medicos){
            model.addRow(new Object[]{
                    medico.getCodigo_Medico(),
                    medico.getNome_Medico(),
                    medico.getCRM(),
                    medico.getCodigo_Especialidade()
            });
        }


    }

    @Override
    public boolean isFieldsFormsValidate() {
        if(nomeMedicoField.getText().isEmpty() || nomeMedicoField.getText().isBlank()){
            this.showWarningMessage("Preencha o campo de nome!");
            return false;
        }
        if(crmField.getText().isEmpty() || crmField.getText().isBlank()){
            this.showWarningMessage("Preencha o campo de CRM!");
            return false;
        }
        if(especialidadeTable.getSelectedRow() == -1){
            this.showWarningMessage("Escolha uma especialidade!");
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(AtualizarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField crmField;
    private javax.swing.JTable especialidadeTable;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable medicoTable;
    private javax.swing.JTextField nomeMedicoField;
    private javax.swing.JButton preencherButton;
    private javax.swing.JButton removerButton;
    // End of variables declaration//GEN-END:variables
}
