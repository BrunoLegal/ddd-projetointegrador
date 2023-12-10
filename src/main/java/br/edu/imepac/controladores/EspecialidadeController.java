/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.controladores;

import br.edu.imepac.entidades.Especialidade;
import br.edu.imepac.servicos.EspecialidadeService;
import br.edu.imepac.views.BaseForm;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class EspecialidadeController {
    private final EspecialidadeService especialidadeService;
    private final BaseForm baseForm;

    public EspecialidadeController(BaseForm baseForm){
        this.especialidadeService = new EspecialidadeService();
        this.baseForm = baseForm;
    }

    public void saveEspecialidade(Especialidade esp){
        try{
            this.especialidadeService.addEspecialidade(esp);
        }catch(SQLException sql){
            baseForm.showErrorInternal(sql.getMessage());
        }
    }

    public void deleteEspecialidae(Especialidade esp){
        try{
            this.especialidadeService.deleteEspecialidade(esp.getCodigo_especialidade());
        }catch(SQLException sql){
            baseForm.showErrorInternal(sql.getMessage());
        }
    }

    public void updateEspecialidade(Especialidade esp){
        try{
            this.especialidadeService.updateEspecialidade(esp);
        }catch(SQLException sql){
            baseForm.showErrorInternal(sql.getMessage());
        }
    }

    public Especialidade findEspecialidade(Long id){
        try{
            return this.especialidadeService.findEspecialidade(id);
        }catch (SQLException sql){
            baseForm.showErrorInternal(sql.getMessage());
        }
        return null;
    }

    public ArrayList findAllEspecialidade(){
        try{
            return this.especialidadeService.findAllEspecialidade();
        }catch(SQLException sql){
            baseForm.showErrorInternal(sql.getMessage());
        }
        return null;
    }
}
