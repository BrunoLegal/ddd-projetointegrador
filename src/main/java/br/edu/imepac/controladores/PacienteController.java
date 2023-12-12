/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.controladores;

import br.edu.imepac.entidades.Paciente;
import br.edu.imepac.servicos.PacienteService;
import br.edu.imepac.views.BaseForm;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class PacienteController {

    private final PacienteService pacienteService;
    private final BaseForm baseForm;

    public PacienteController(BaseForm bseForm) {
        this.pacienteService = new PacienteService();
        this.baseForm = bseForm;
    }

    public void savePaciente(Paciente paciente) {
        try {
            this.pacienteService.addPaciente(paciente);
        } catch (SQLException sqlException) {
            baseForm.showErrorInternal(sqlException.getMessage());
        }
    }

    public void deletePaciente(Paciente paciente) {
        try {
            this.pacienteService.removePaciente(paciente.getCodigo_paciente());
        } catch (SQLException sqlException) {
            baseForm.showErrorInternal(sqlException.getMessage());
        }
    }

    public ArrayList<Paciente> loadAllData() {
        try {
            return this.pacienteService.findAllPaciente();
        } catch (SQLException sqlException) {
            baseForm.showErrorInternal(sqlException.getMessage());
        }
        return null;
    }

    public void updatePaciente(Paciente paciente) {
        try {
            this.pacienteService.updatePaciente(paciente);
        } catch (SQLException sqlException) {
            baseForm.showErrorInternal(sqlException.getMessage());
        }
    }

}
