package br.edu.imepac.controladores;


import br.edu.imepac.entidades.Medico;

import br.edu.imepac.views.BaseForm;
import java.util.ArrayList;
import java.sql.SQLException;
import br.edu.imepac.servicos.MedicoService;

public class MedicoController {
    private final MedicoService medicoService;
    private final BaseForm baseForm;


    public MedicoController(BaseForm baseForm){
        this.medicoService = new MedicoService();
        this.baseForm = baseForm;
    }


    public void saveMedico(Medico medico){
        try{
            this.medicoService.addMedico(medico);
        }catch(SQLException sql){
            baseForm.showErrorInternal(sql.getMessage());
        }
    }


    public void deleteMedico(Long id){
        try{
            this.medicoService.deleteMedico(id);
        }catch(SQLException sql){
            baseForm.showErrorInternal(sql.getMessage());
        }
    }


}
