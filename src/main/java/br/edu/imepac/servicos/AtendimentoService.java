/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.servicos;

import br.edu.imepac.daos.AtendimentoDao;
import br.edu.imepac.entidades.Atendimento;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class AtendimentoService {
    private final AtendimentoDao atendimentoDao;

    public AtendimentoService(){
        this.atendimentoDao = new AtendimentoDao();
    }

    public int addAtendimento(Atendimento att) throws SQLException {
        return this.atendimentoDao.save(att);
    }

    public Atendimento findAtendimento(Long id) throws SQLException {
        return this.atendimentoDao.read(id);
    }

    public int updateAtendimento(Atendimento att) throws SQLException {
        return this.atendimentoDao.update(att);
    }
    public int deleteAtendimento(Long id) throws SQLException {
        return this.atendimentoDao.delete(id);
    }

    public ArrayList findAllAtendimento() throws SQLException {
        return this.atendimentoDao.findAll();
    }
}
