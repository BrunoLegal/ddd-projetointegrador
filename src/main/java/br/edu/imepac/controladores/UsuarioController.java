/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.controladores;

import br.edu.imepac.entidades.Funcionario;
import br.edu.imepac.entidades.Usuario;
import br.edu.imepac.servicos.UsuarioService;
import br.edu.imepac.views.BaseForm;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 231-001278
 */
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final BaseForm baseForm;

    public UsuarioController(BaseForm baseForm){
        this.usuarioService = new UsuarioService();
        this.baseForm = baseForm;
    }

    public void addUsuario(Usuario user){
        try{
            this.usuarioService.addUsuario(user);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public void updateUsuario(Usuario user){
        try{
            this.usuarioService.updateUsuario(user);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }

    public void deleteUsuario(Long id){
        try{
            this.usuarioService.deleteUsuario(id);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
    }
    public Usuario findUsuario(Long id){
        try{
            return this.usuarioService.findUsuario(id);
        }catch(SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
        return null;
    }

    public ArrayList<Usuario> findAllUsuario(){
        try{
            return this.usuarioService.findAllUsuario();
        }catch (SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
        return null;
    }

    public Long checkUsuario(String user, String psswd){
        try {
            return this.usuarioService.checkUsuario(user, psswd);
        }catch (SQLException e){
            baseForm.showErrorInternal(e.getMessage());
        }
        return Long.parseLong("-1");
    }
    
}
