/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.controladores;

import br.edu.imepac.entidades.Atendimento;
import br.edu.imepac.servicos.AtendimentoService;
import br.edu.imepac.views.BaseForm;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class AtendimentoController {
    private final AtendimentoService atendimentoService;
    private final BaseForm baseForm;

    public AtendimentoController(BaseForm baseForm){
        this.atendimentoService = new AtendimentoService();
        this.baseForm = baseForm;
    }

    public void addAtendimento(Atendimento att){
        try{
            this.atendimentoService.addAtendimento(att);
        }catch (SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public void updateAtendimento(Atendimento att){
        try {
            this.atendimentoService.updateAtendimento(att);
        }catch (SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public void deleteAtendimento(Long id){
        try {
            this.atendimentoService.deleteAtendimento(id);
        }catch (SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public Atendimento findAtendimento(Long id){
        try {
            return this.atendimentoService.findAtendimento(id);
        }catch (SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
        return null;
    }

    public ArrayList findAll(){
        try {
            return this.atendimentoService.findAllAtendimento();
        }catch (SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
        return null;
    }
}
