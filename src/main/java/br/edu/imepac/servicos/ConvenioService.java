
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.servicos;


import br.edu.imepac.daos.ConvenioDao;
import br.edu.imepac.entidades.Convenio;

import java.sql.SQLException;
import java.util.ArrayList;

public class ConvenioService {
    private final ConvenioDao convenioDao;

    public ConvenioService(){ this.convenioDao = new ConvenioDao(); }

    public int addConvenio(Convenio esp) throws SQLException {
        return this.convenioDao.save(esp);
    }

    public int updateConvenio(Convenio esp) throws SQLException {
        return this.convenioDao.update(esp);
    }
    public int deleteConvenio(Long id) throws SQLException {
        return this.convenioDao.delete(id);
    }
    public Convenio findConvenio(Long id) throws SQLException {
        return this.convenioDao.read(id);
    }
    public ArrayList findAllConvenio() throws SQLException {
        return this.convenioDao.findAll();
    }


}
