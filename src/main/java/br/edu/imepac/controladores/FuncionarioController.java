/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.controladores;

import br.edu.imepac.entidades.Funcionario;
import br.edu.imepac.servicos.FuncionarioService;
import br.edu.imepac.views.BaseForm;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class FuncionarioController {
    private final FuncionarioService funcionarioService;
    private final BaseForm baseForm;

    public FuncionarioController(BaseForm bseForm) {
        this.funcionarioService = new FuncionarioService();
        this.baseForm = bseForm;
    }

    public void saveFuncionario(Funcionario funcionario) {
        try {
            this.funcionarioService.addFuncionario(funcionario);
        } catch (SQLException sqlException) {
            baseForm.showErrorInternal(sqlException.getMessage());
        }
    }

    public void deleteFuncionario(Funcionario fUncionario) {
        try {
            this.funcionarioService.removeContact(contact.getId());
        } catch (SQLException sqlException) {
            baseForm.showErrorInternal(sqlException.getMessage());
        }
    }

    public ArrayList<Contact> loadAllData() {
        try {
            return this.contactService.findAllContact();
        } catch (SQLException sqlException) {
            baseForm.showErrorInternal(sqlException.getMessage());
        }
        return null;
    }

    public void updateContact(Contact contact) {
        try {
            this.contactService.updateContact(contact);
        } catch (SQLException sqlException) {
            baseForm.showErrorInternal(sqlException.getMessage());
        }
    }
}
