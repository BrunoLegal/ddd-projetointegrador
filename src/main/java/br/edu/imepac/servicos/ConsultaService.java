/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.servicos;


import br.edu.imepac.entidades.Consulta;
import br.edu.imepac.daos.ConsultaDao;

import java.sql.SQLException;
import java.util.ArrayList;


public class ConsultaService {

    private final ConsultaDao consultaDao;

    public ConsultaService(){ this.consultaDao = new ConsultaDao(); }

    public int addConsulta(Consulta cons) throws SQLException {
        return this.consultaDao.save(cons);
    }

    public int updateConsulta(Consulta cons) throws SQLException {
        return this.consultaDao.update(cons);
    }
    public int deleteConsulta(Long id) throws SQLException {
        return this.consultaDao.delete(id);
    }
    public Consulta findConsulta(Long id) throws SQLException {
        return this.consultaDao.read(id);
    }
    public ArrayList findAllConsulta() throws SQLException {
        return this.consultaDao.findAll();
    }

}
