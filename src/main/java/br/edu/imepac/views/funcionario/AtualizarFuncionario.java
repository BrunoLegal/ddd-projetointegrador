/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.views.funcionario;

import br.edu.imepac.controladores.FuncionarioController;
import br.edu.imepac.entidades.Funcionario;
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
 * @author 231-001278
 */
public class AtualizarFuncionario extends BaseForm {
    FuncionarioController funcionarioController;
    /**
     * Creates new form AtualizarFuncionario
     */
    public AtualizarFuncionario() {
        initComponents();
        this.funcionarioController = new FuncionarioController(this);
        this.loadTable();
    }

    private void clearFields(){
        nomeField.setText("");
        rgField.setText("");
        orgaoemissorField.setText("");
        cpfField.setText("");
        enderecoField.setText("");
        numeroField.setText("");
        complementoField.setText("");
        bairroField.setText("");
        cidadeField.setText("");
        estadoCB.setSelectedItem(1);
        telefoneField.setText("");
        ctpsField.setText("");
        pisField.setText("");
        dataNascimentoField.setText("DD/MM/AAAA");

    }

    public Funcionario createEntityViewRepresentation() {
        return new Funcionario(
                Long.parseLong(funcionarioTable.getValueAt(funcionarioTable.getSelectedRow(), 0).toString()),
                nomeField.getText(),
                rgField.getText(),
                orgaoemissorField.getText(),
                cpfField.getText(),
                enderecoField.getText(),
                numeroField.getText(),
                complementoField.getText(),
                bairroField.getText(),
                cidadeField.getText(),
                estadoCB.getItemAt(estadoCB.getSelectedIndex()),
                telefoneField.getText(), celularField.getText(),
                ctpsField.getText(),
                pisField.getText(),
                stringToSql(dataNascimentoField.getText()));
    }

    private Date stringToSql(String stringDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date sqlDate = null;
        try {
            sqlDate = new Date(sdf.parse(stringDate).getTime());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return sqlDate;
    }

    public boolean isFieldsFormsValidate() {
        if(nomeField.getText().isBlank() || nomeField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de Nome!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(rgField.getText().isBlank() || rgField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de RG!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(orgaoemissorField.getText().isBlank() || orgaoemissorField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de Orgão Emissor!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(cpfField.getText().isBlank() || cpfField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de CPF!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(enderecoField.getText().isBlank() || enderecoField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de Endereço!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(numeroField.getText().isBlank() || numeroField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de Número de endereço!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }if(bairroField.getText().isBlank() || bairroField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de Bairro!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(cidadeField.getText().isBlank() || cidadeField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Preencha o campo de Cidade!", "Alerta", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(telefoneField.getText().isBlank() || telefoneField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de Telefone!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(ctpsField.getText().isBlank() || ctpsField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de CTPS!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(pisField.getText().isBlank() || pisField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o campo de PIS!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(dataNascimentoField.getText().isBlank() || dataNascimentoField.getText().isEmpty() || dataNascimentoField.getText().equals("DD/MM/AAAA")){
            JOptionPane.showMessageDialog(null, "Preencha a data de nascimento!", "Alerta!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void loadTable() {
        ArrayList<Funcionario> funcionarios = this.funcionarioController.loadAllData();

        DefaultTableModel model = (DefaultTableModel) funcionarioTable.getModel();
        model.setRowCount(0);
        for(Funcionario funcionario: funcionarios){
            model.addRow(new Object[]{
                    funcionario.getCodigo_funcionario(),
                    funcionario.getNome(),
                    funcionario.getRG(),
                    funcionario.getOrgaoEmissor(),
                    funcionario.getCPF(),
                    funcionario.getEndereco(),
                    funcionario.getNumero(),
                    funcionario.getComplemento(),
                    funcionario.getBairro(),
                    funcionario.getCidade(),
                    funcionario.getEstado(),
                    funcionario.getTelefone(),
                    funcionario.getCelular(),
                    funcionario.getCTPS(),
                    funcionario.getPIS(),
                    funcionario.getData_nascimento()
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        funcionarioTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        rgField = new javax.swing.JTextField();
        orgaoemissorField = new javax.swing.JTextField();
        cpfField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        enderecoField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        numeroField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        complementoField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bairroField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cidadeField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        estadoCB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        telefoneField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        celularField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ctpsField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        pisField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        dataNascimentoField = new javax.swing.JTextField();
        atualizarButton = new javax.swing.JButton();
        deletarButton = new javax.swing.JButton();
        preencherButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Atualizar Funcionarios");

        funcionarioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "RG", "Orgao Emissor", "CPF", "Endereco", "Numero", "Complemento", "Bairro", "Cidade", "Estado", "Telefone", "Celular", "CTPS", "PIS", "Data de Nascimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        funcionarioTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        funcionarioTable.getTableHeader().setReorderingAllowed(false);
        funcionarioTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                funcionarioTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(funcionarioTable);

        jLabel2.setText("Nome");

        jLabel3.setText("RG");

        jLabel4.setText("Orgao Emissor");

        jLabel5.setText("CPF");

        jLabel6.setText("Endereço");

        jLabel7.setText("Numero");

        jLabel8.setText("Complemento");

        jLabel9.setText("Bairro");

        jLabel10.setText("Cidade");

        jLabel11.setText("Estado");

        estadoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel12.setText("Telefone");

        jLabel13.setText("Celular");

        jLabel14.setText("CTPS");

        jLabel15.setText("PIS");

        jLabel16.setText("Data de Nascimento");

        dataNascimentoField.setText("DD/MM/AAAA");
        dataNascimentoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataNascimentoFieldFocusGained(evt);
            }
        });

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        deletarButton.setText("Deletar");
        deletarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarButtonActionPerformed(evt);
            }
        });

        preencherButton.setText("Preencher");
        preencherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preencherButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(atualizarButton)
                                .addGap(18, 18, 18)
                                .addComponent(deletarButton)
                                .addGap(18, 18, 18)
                                .addComponent(preencherButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(complementoField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12)
                                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14)
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabel15)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel9)
                                                                .addGap(58, 58, 58))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(bairroField, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel10))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel11))
                                                    .addComponent(celularField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel16))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel3)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(92, 92, 92)
                                                .addComponent(jLabel6)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(28, 28, 28)
                                                        .addComponent(jLabel7))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(orgaoemissorField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(estadoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ctpsField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pisField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dataNascimentoField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rgField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orgaoemissorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(complementoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(celularField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataNascimentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ctpsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(preencherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataNascimentoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataNascimentoFieldFocusGained
        // TODO add your handling code here:
        dataNascimentoField.setText("");
    }//GEN-LAST:event_dataNascimentoFieldFocusGained

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        // TODO add your handling code here:
        if(isFieldsFormsValidate()){
            try {
                if(this.showConfirmYesOrNoDialog("Deseja mesmo atualizar os dados do funcionario " + funcionarioTable.getValueAt(funcionarioTable.getSelectedRow(), 1)+"?")==0) {
                    funcionarioController.updateFuncionario(createEntityViewRepresentation());
                    this.showSuccessMessage("Funcionario Atualizado");
                    this.clearFields();
                    this.loadTable();
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                this.showWarningMessage("Selecione um funcionario para atualizar!");
            }
        }
    }//GEN-LAST:event_atualizarButtonActionPerformed

    private void funcionarioTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_funcionarioTableFocusGained

    }//GEN-LAST:event_funcionarioTableFocusGained

    private void preencherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preencherButtonActionPerformed
        try {
            int row = funcionarioTable.getSelectedRow();
            nomeField.setText(funcionarioTable.getValueAt(row, 1).toString());
            rgField.setText(funcionarioTable.getValueAt(row, 2).toString());
            orgaoemissorField.setText(funcionarioTable.getValueAt(row, 3).toString());
            cpfField.setText(funcionarioTable.getValueAt(row, 4).toString());
            enderecoField.setText(funcionarioTable.getValueAt(row, 5).toString());
            numeroField.setText(funcionarioTable.getValueAt(row, 6).toString());
            complementoField.setText(funcionarioTable.getValueAt(row, 7).toString());
            bairroField.setText(funcionarioTable.getValueAt(row, 8).toString());
            cidadeField.setText(funcionarioTable.getValueAt(row, 9).toString());
            estadoCB.setSelectedItem(funcionarioTable.getValueAt(row, 10));
            telefoneField.setText(funcionarioTable.getValueAt(row, 11).toString());
            celularField.setText(funcionarioTable.getValueAt(row, 12).toString());
            ctpsField.setText(funcionarioTable.getValueAt(row, 13).toString());
            pisField.setText(funcionarioTable.getValueAt(row, 14).toString());

            String unfDate = funcionarioTable.getValueAt(row, 15).toString();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            java.util.Date date = null;
            try {
                date = sdf.parse(unfDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            sdf.applyPattern("dd/MM/yyyy");
            dataNascimentoField.setText(sdf.format(date));

        }catch (ArrayIndexOutOfBoundsException e){
            this.showWarningMessage("Selecione um funcionario para auto preencher os dados!");
        }
    }//GEN-LAST:event_preencherButtonActionPerformed

    private void deletarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarButtonActionPerformed
        // TODO add your handling code here:
            try {
                Long id = Long.parseLong(funcionarioTable.getValueAt(funcionarioTable.getSelectedRow(), 0).toString());
                if (showConfirmYesOrNoDialog("Deseja mesmo apagar o funcionario " + funcionarioTable.getValueAt(funcionarioTable.getSelectedRow(), 1) + "?") == 0) {
                    Funcionario funcionario = funcionarioController.findFuncionario(id);
                    funcionarioController.deleteFuncionario(funcionario);
                    loadTable();
                    showSuccessMessage("Funcionario " + funcionario.getNome() + " Deletado com sucesso!" );
                }
            }catch (ArrayIndexOutOfBoundsException e){
                this.showWarningMessage("Selecione um funcionario para apagar!");
            }
    }//GEN-LAST:event_deletarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JTextField bairroField;
    private javax.swing.JTextField celularField;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JTextField complementoField;
    private javax.swing.JTextField cpfField;
    private javax.swing.JTextField ctpsField;
    private javax.swing.JTextField dataNascimentoField;
    private javax.swing.JButton deletarButton;
    private javax.swing.JTextField enderecoField;
    private javax.swing.JComboBox<String> estadoCB;
    private javax.swing.JTable funcionarioTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField numeroField;
    private javax.swing.JTextField orgaoemissorField;
    private javax.swing.JTextField pisField;
    private javax.swing.JButton preencherButton;
    private javax.swing.JTextField rgField;
    private javax.swing.JTextField telefoneField;
    // End of variables declaration//GEN-END:variables
}
