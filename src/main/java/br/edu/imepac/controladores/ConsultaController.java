/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.controladores;

import br.edu.imepac.entidades.Consulta;
import br.edu.imepac.servicos.ConsultaService;
import br.edu.imepac.views.BaseForm;

import java.sql.SQLException;
import java.util.ArrayList;

public class ConsultaController {
    private final ConsultaService consultaService;
    private final BaseForm baseForm;

    public ConsultaController(BaseForm baseForm){
        this.consultaService = new ConsultaService();
        this.baseForm = baseForm;
    }

    public void addConsulta(Consulta cons){
        try{
            this.consultaService.addConsulta(cons);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public void updateConsulta(Consulta cons){
        try{
            this.consultaService.updateConsulta(cons);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public void deleteConsulta(Long id){
        try{
            this.consultaService.deleteConsulta(id);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }
    public Consulta findConvenio(Long id){
        try{
            return this.consultaService.findConsulta(id);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
        return null;
    }

    public ArrayList findAllConsulta() {
        try {
            return this.consultaService.findAllConsulta();
        } catch (SQLException e) {
            baseForm.showErrorInternal(e.getMessage());
        }
        return null;
    }
}
