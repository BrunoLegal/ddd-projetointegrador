package br.edu.imepac.servicos;

import br.edu.imepac.daos.MedicoDao;
import br.edu.imepac.entidades.Medico;

import java.sql.SQLException;
import java.util.ArrayList;

public class MedicoService {
    private final MedicoDao medicoDao;


    public MedicoService(){
        this.medicoDao = new MedicoDao();
    }


    public int addMedico(Medico esp) throws SQLException {
        return this.medicoDao.save(esp);
    }


    public int updateMedico(Medico esp) throws SQLException {
        return this.medicoDao.update(esp);
    }
    public int deleteMedico(Long id) throws SQLException {
        return this.medicoDao.delete(id);
    }
    public Medico findMedico(Long id) throws SQLException {
        return this.medicoDao.read(id);
    }
    public ArrayList findAllMedico() throws SQLException {
        return this.medicoDao.findAll();
    }
}
