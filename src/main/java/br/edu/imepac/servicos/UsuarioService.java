/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.servicos;

import br.edu.imepac.daos.UsuarioDao;
import br.edu.imepac.entidades.Usuario;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class UsuarioService {
    private final UsuarioDao usuarioDao;

    public UsuarioService(){
        this.usuarioDao = new UsuarioDao();
    }
    public int addUsuario(Usuario user) throws SQLException {
        return this.usuarioDao.save(user);
    }
    public int deleteUsuario(Long id) throws SQLException {
        return this.usuarioDao.delete(id);
    }
    public int updateUsuario(Usuario user) throws SQLException {
        return this.usuarioDao.update(user);
    }
    public Usuario findUsuario(Long id) throws SQLException {
        return this.usuarioDao.read(id);
    }
    public ArrayList findAllUsuario() throws SQLException {
        return this.usuarioDao.findAll();
    }

}
