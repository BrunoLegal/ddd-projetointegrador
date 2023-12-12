/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.servicos;

import br.edu.imepac.DAOs.PacienteDao;
import br.edu.imepac.entidades.Paciente;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alfredo
 */
public class PacienteService {

    private final PacienteDao pacienteDao;

    public PacienteService() {
        this.pacienteDao = new PacienteDao();
    }

    public int addPaciente(Paciente paciente) throws SQLException {
        return this.pacienteDao.save(paciente);
    }

    public Paciente findPaciente(Long id) throws SQLException {
        return this.pacienteDao.read(id);
    }

    public ArrayList<Paciente> findAllPaciente() throws SQLException {
        return this.pacienteDao.findAll();
    }

    public int removePaciente(Long id) throws SQLException {
        return this.pacienteDao.delete(id);
    }

    public int updatePaciente(Paciente paciente) throws SQLException {
        return this.pacienteDao.update(paciente);
    }
}
