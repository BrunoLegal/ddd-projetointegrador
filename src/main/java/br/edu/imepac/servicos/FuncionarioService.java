/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.servicos;

import br.edu.imepac.daos.FuncionarioDao;
import br.edu.imepac.entidades.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alfredo
 */
public class FuncionarioService {
    private final FuncionarioDao funcionarioDao;

    public FuncionarioService() {
        this.funcionarioDao = new FuncionarioDao();
    }

    public int addFuncionario(Funcionario funcionario) throws SQLException {
        return this.funcionarioDao.save(funcionario);
    }

    public Funcionario findFuncionario(Long id) throws SQLException {
        return this.funcionarioDao.read(id);
    }

    public ArrayList<Funcionario> findAllFuncionario() throws SQLException {
        return this.funcionarioDao.findAll();
    }

    public int removeFuncionario(Long id) throws SQLException {
        return this.funcionarioDao.delete(id);
    }

    public int updateFuncionario(Funcionario funcionario) throws SQLException {
        return this.funcionarioDao.update(funcionario);
    }
}
