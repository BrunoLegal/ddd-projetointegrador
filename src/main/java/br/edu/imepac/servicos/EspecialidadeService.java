/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.servicos;

import br.edu.imepac.daos.EspecialidadeDao;
import br.edu.imepac.entidades.Especialidade;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class EspecialidadeService {
    private final EspecialidadeDao especialidadeDao;

    public EspecialidadeService(){ this.especialidadeDao = new EspecialidadeDao(); }

    public int adicionarEspecialidade(Especialidade esp) throws SQLException {
        return this.especialidadeDao.save(esp);
    }

    public int atualizarEspecialidade(Especialidade esp) throws SQLException {
        return this.especialidadeDao.update(esp);
    }
    public int deletarEspecialidade(Long id) throws SQLException {
        return this.especialidadeDao.delete(id);
    }
    public Especialidade mostrarEspecialidade(Long id) throws SQLException {
        return this.especialidadeDao.read(id);
    }
    public ArrayList mostrarTodos() throws SQLException {
        return this.especialidadeDao.findAll();
    }

}
