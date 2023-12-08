/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.controladores;

import br.edu.imepac.entidades.Convenio;
import br.edu.imepac.servicos.ConvenioService;
import br.edu.imepac.views.BaseForm;

import java.sql.SQLException;
import java.util.ArrayList;

public class ConvenioController {
    private final ConvenioService convenioService;
    private final BaseForm baseForm;

    public ConvenioController(BaseForm baseForm){
        this.convenioService = new ConvenioService();
        this.baseForm = baseForm;
    }

    public void addConvenio(Convenio user){
        try{
            this.convenioService.addConvenio(user);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public void updateConvenio(Convenio user){
        try{
            this.convenioService.updateConvenio(user);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public void deleteConvenio(Long id){
        try{
            this.convenioService.deleteConvenio(id);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }
    public Convenio findConvenio(Long id){
        try{
            return this.convenioService.findConvenio(id);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
        return null;
    }

    public ArrayList findAllConvenio() {
        try {
            return this.convenioService.findAllConvenio();
        } catch (SQLException e) {
            baseForm.showErrorInternal(e.getMessage());
        }
        return null;
    }
}
