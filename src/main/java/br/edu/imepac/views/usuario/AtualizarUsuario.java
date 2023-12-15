/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.views.usuario;

import br.edu.imepac.controladores.UsuarioController;
import br.edu.imepac.entidades.Funcionario;
import br.edu.imepac.entidades.Medico;
import br.edu.imepac.entidades.Usuario;
import br.edu.imepac.utils.IRolesForms;
import br.edu.imepac.views.BaseForm;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class AtualizarUsuario extends BaseForm implements IRolesForms<Usuario> {
    UsuarioController usuarioController;
    /**
     * Creates new form AtualizarUsuario
     */
    public AtualizarUsuario() {
        initComponents();
        this.usuarioController = new UsuarioController(this);
        this.loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cancelamentoCheckBox = new javax.swing.JCheckBox();
        agendaCheckBox = new javax.swing.JCheckBox();
        atendimentoCheckBox = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        funcionarioCheckBox = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        usuarioCheckBox = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        pacienteCheckBox = new javax.swing.JCheckBox();
        atualizarButton = new javax.swing.JButton();
        especialidadeCheckBox = new javax.swing.JCheckBox();
        senhaField = new javax.swing.JTextField();
        medicoCheckBox = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        convenioCheckBox = new javax.swing.JCheckBox();
        confirmSenhaField = new javax.swing.JTextField();
        agendamentoCheckBox = new javax.swing.JCheckBox();
        adminCheckBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        selecionarButton = new javax.swing.JButton();
        deletarButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cancelamentoCheckBox.setText("Cancelamento Consulta");
        cancelamentoCheckBox.setEnabled(false);

        agendaCheckBox.setText("Agendamento");
        agendaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaCheckBoxActionPerformed(evt);
            }
        });

        atendimentoCheckBox.setText("Atendimento");

        jLabel2.setText("Módulos");

        jLabel3.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        jLabel3.setText("Atualizar Usuário");

        jLabel4.setText("Especificos");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        funcionarioCheckBox.setText("Funcionário");
        funcionarioCheckBox.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Senha");

        usuarioCheckBox.setText("Usuário");
        usuarioCheckBox.setEnabled(false);
        usuarioCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioCheckBoxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Login do Usuario");

        pacienteCheckBox.setText("Paciente");
        pacienteCheckBox.setEnabled(false);

        atualizarButton.setBackground(new java.awt.Color(51, 153, 255));
        atualizarButton.setForeground(new java.awt.Color(255, 255, 255));
        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        especialidadeCheckBox.setText("Especialidade");
        especialidadeCheckBox.setEnabled(false);

        medicoCheckBox.setText("Médico");
        medicoCheckBox.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Confirmar Senha");

        convenioCheckBox.setText("Convênio");
        convenioCheckBox.setEnabled(false);

        agendamentoCheckBox.setText("Agendar Consulta");
        agendamentoCheckBox.setEnabled(false);

        adminCheckBox.setText("Administração");
        adminCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCheckBoxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Login", "Senha", "Funcionario", "Usuario", "Paciente", "Especialidade", "Medico", "Convenio", "Agendar", "Cancelar", "Mod.Admin", "Mod.Agendamento", "Mod.Atendimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        selecionarButton.setBackground(new java.awt.Color(51, 153, 255));
        selecionarButton.setForeground(new java.awt.Color(255, 255, 255));
        selecionarButton.setText("Selecionar");
        selecionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarButtonActionPerformed(evt);
            }
        });

        deletarButton1.setBackground(new java.awt.Color(51, 153, 255));
        deletarButton1.setForeground(new java.awt.Color(255, 255, 255));
        deletarButton1.setText("Deletar");
        deletarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Permissões");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(635, 635, 635))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(funcionarioCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usuarioCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(convenioCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(especialidadeCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(medicoCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pacienteCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agendamentoCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelamentoCheckBox))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(adminCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(agendaCheckBox)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(atendimentoCheckBox))
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel14))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmSenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(atualizarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletarButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecionarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmSenhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminCheckBox)
                            .addComponent(agendaCheckBox)
                            .addComponent(atendimentoCheckBox)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(funcionarioCheckBox)
                            .addComponent(usuarioCheckBox)
                            .addComponent(especialidadeCheckBox)
                            .addComponent(jLabel4)
                            .addComponent(convenioCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicoCheckBox)
                            .addComponent(agendamentoCheckBox)
                            .addComponent(cancelamentoCheckBox)
                            .addComponent(pacienteCheckBox))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarButton)
                    .addComponent(selecionarButton)
                    .addComponent(deletarButton1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agendaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaCheckBoxActionPerformed
        autocheck();
    }//GEN-LAST:event_agendaCheckBoxActionPerformed
    private void autocheck(){
        if(agendaCheckBox.isSelected()){
            pacienteCheckBox.setEnabled(true);
            agendamentoCheckBox.setEnabled(true);
            cancelamentoCheckBox.setEnabled(true);
        }else{
            pacienteCheckBox.setEnabled(false);
            agendamentoCheckBox.setEnabled(false);
            cancelamentoCheckBox.setEnabled(false);
            pacienteCheckBox.setSelected(false);
            agendamentoCheckBox.setSelected(false);
            cancelamentoCheckBox.setSelected(false);
        }
        if(adminCheckBox.isSelected()){
            funcionarioCheckBox.setEnabled(true);
            medicoCheckBox.setEnabled(true);
            especialidadeCheckBox.setEnabled(true);
            convenioCheckBox.setEnabled(true);
            usuarioCheckBox.setEnabled(true);
        }else{
            funcionarioCheckBox.setEnabled(false);
            funcionarioCheckBox.setSelected(false);
            medicoCheckBox.setEnabled(false);
            funcionarioCheckBox.setSelected(false);
            especialidadeCheckBox.setSelected(false);
            especialidadeCheckBox.setEnabled(false);
            convenioCheckBox.setEnabled(false);
            convenioCheckBox.setSelected(false);
            usuarioCheckBox.setEnabled(false);
            usuarioCheckBox.setSelected(false);
        }
    }

    private void loadTable() {
        ArrayList<Usuario> usuarios = this.usuarioController.findAllUsuario();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for(Usuario usuario : usuarios){
            model.addRow(new Object[]{
                    usuario.getRegistro_usuario(),
                    usuario.getIdentificacao_usuario(),
                    usuario.getSenha_acesso(),
                    usuario.getCadastro_funcionario(),
                    usuario.getCadastro_usuario(),
                    usuario.getCadastro_paciente(),
                    usuario.getCadastro_especialidade(),
                    usuario.getCadastro_medico(),
                    usuario.getCadastro_convenio(),
                    usuario.getAgendamento_consulta(),
                    usuario.getCancelamento_consulta(),
                    usuario.getModulo_administrativo(),
                    usuario.getModulo_agendamento(),
                    usuario.getModulo_atendimento()
            });
        }
    }
    private void clearFields(){
        jTextField8.setText("");
        senhaField.setText("");
        confirmSenhaField.setText("");
        adminCheckBox.setSelected(false);
        agendaCheckBox.setSelected(false);
        atendimentoCheckBox.setSelected(false);
        autocheck();
    }

    private void usuarioCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioCheckBoxActionPerformed

    private void atualizarButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        if(isFieldsFormsValidate()){
            try {
                if(this.showConfirmYesOrNoDialog("Deseja mesmo atualizar os dados do usuario " + jTable1.getValueAt(jTable1.getSelectedRow(), 1)+"?")==0) {
                    usuarioController.updateUsuario(createEntityViewRepresentation());
                    this.showSuccessMessage("Usuario Atualizado");
                    this.clearFields();
                    this.loadTable();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                this.showWarningMessage("Selecione um usuario para atualizar!");
            }
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void adminCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCheckBoxActionPerformed
        autocheck();
    }//GEN-LAST:event_adminCheckBoxActionPerformed
    @Override
    public Usuario createEntityViewRepresentation() {
        String funcionario, usuario, medico, convenio, especialidade, paciente, agendar, cancelar, mAdmin, mAgen, mAten;
        Long id = Long.parseLong(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        if(usuarioCheckBox.isSelected()) usuario = "y"; else usuario = "n";
        if(funcionarioCheckBox.isSelected()) funcionario = "y"; else funcionario = "n";
        if(medicoCheckBox.isSelected()) medico = "y"; else medico = "n";
        if(convenioCheckBox.isSelected()) convenio = "y"; else convenio = "n";
        if(especialidadeCheckBox.isSelected()) especialidade = "y"; else especialidade = "n";
        if(pacienteCheckBox.isSelected()) paciente = "y"; else paciente = "n";
        if(agendamentoCheckBox.isSelected()) agendar = "y"; else agendar = "n";
        if(cancelamentoCheckBox.isSelected()) cancelar = "y"; else cancelar = "n";
        if(adminCheckBox.isSelected()) mAdmin = "y"; else mAdmin = "n";
        if(agendaCheckBox.isSelected())mAgen = "y"; else mAgen = "n";
        if(atendimentoCheckBox.isSelected()) mAten = "y"; else mAten = "n";

        return new Usuario(
                id,
                jTextField8.getText(),
                senhaField.getText(),
                funcionario,
                usuario,
                paciente,
                especialidade,
                medico,
                convenio,
                agendar,
                cancelar,
                mAdmin,
                mAgen,
                mAten
        );
    }

    @Override
    public boolean isFieldsFormsValidate() {
        if(jTextField8.getText().isBlank() || jTextField8.getText().isEmpty()){
            this.showWarningMessage("Preencha o id do usuario!");
            return false;
        }
        if(senhaField.getText().isBlank() || senhaField.getText().isEmpty()){
            this.showWarningMessage("Insira uma senha!");
            return false;
        }
        String s1 = senhaField.getText();
        String s2 = confirmSenhaField.getText();
        if(!s1.equals(s2)){
            this.showWarningMessage("Confirme a senha corretamente!");
            return false;
        }

        return true;
    }

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void selecionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarButtonActionPerformed
        try{
            jTextField8.setText(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
            senhaField.setText("");
            confirmSenhaField.setText("");
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString().equals("y")) this.funcionarioCheckBox.setSelected(true); else this.funcionarioCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString().equals("y")) this.usuarioCheckBox.setSelected(true); else this.usuarioCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString().equals("y")) this.pacienteCheckBox.setSelected(true); else this.pacienteCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString().equals("y")) this.especialidadeCheckBox.setSelected(true); else this.especialidadeCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString().equals("y")) this.medicoCheckBox.setSelected(true); else this.medicoCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString().equals("y")) this.convenioCheckBox.setSelected(true); else this.convenioCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString().equals("y")) this.agendamentoCheckBox.setSelected(true); else this.agendamentoCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString().equals("y")) this.cancelamentoCheckBox.setSelected(true); else this.cancelamentoCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 11).toString().equals("y")) this.adminCheckBox.setSelected(true); else this.adminCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 12).toString().equals("y")) this.agendaCheckBox.setSelected(true); else this.agendaCheckBox.setSelected(false);
            if(jTable1.getValueAt(jTable1.getSelectedRow(), 13).toString().equals("y")) this.atendimentoCheckBox.setSelected(true); else this.atendimentoCheckBox.setSelected(false);
            autocheck();
        }catch(ArrayIndexOutOfBoundsException e){
            this.showWarningMessage("Selecione um usuário na tabela primeiro!");
        }
    }//GEN-LAST:event_selecionarButtonActionPerformed

    private void deletarButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_deletarButton1ActionPerformed
        try {
            Long id = Long.parseLong(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            if (showConfirmYesOrNoDialog("Deseja mesmo apagar o usuario " + jTable1.getValueAt(jTable1.getSelectedRow(), 1) + "?") == 0) {
                Usuario usuario = usuarioController.findUsuario(id);
                usuarioController.deleteUsuario(id);
                loadTable();
                showSuccessMessage("Usuario " + usuario.getIdentificacao_usuario() + " Deletado com sucesso!" );
            }
        }catch (ArrayIndexOutOfBoundsException e){
            this.showWarningMessage("Selecione um usuario para apagar!");
        }
    }//GEN-LAST:event_deletarButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adminCheckBox;
    private javax.swing.JCheckBox agendaCheckBox;
    private javax.swing.JCheckBox agendamentoCheckBox;
    private javax.swing.JCheckBox atendimentoCheckBox;
    private javax.swing.JButton atualizarButton;
    private javax.swing.JCheckBox cancelamentoCheckBox;
    private javax.swing.JTextField confirmSenhaField;
    private javax.swing.JCheckBox convenioCheckBox;
    private javax.swing.JButton deletarButton1;
    private javax.swing.JCheckBox especialidadeCheckBox;
    private javax.swing.JCheckBox funcionarioCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JCheckBox medicoCheckBox;
    private javax.swing.JCheckBox pacienteCheckBox;
    private javax.swing.JButton selecionarButton;
    private javax.swing.JTextField senhaField;
    private javax.swing.JCheckBox usuarioCheckBox;
    // End of variables declaration//GEN-END:variables
}