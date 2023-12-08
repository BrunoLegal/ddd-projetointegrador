/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.entidades;

/**
 *
 * @author
 */
public class Usuario {
    private long IDusuario;

    private String senhaDeAcesso;

    public long getIDusuario() {
        return IDusuario;
    }

    public void setIDusuario(long IDusuario) {
        this.IDusuario = IDusuario;
    }
    public String getSenhaDeAcesso() {
        return senhaDeAcesso;
    }

    public void setSenhaDeAcesso(String senhaDeAcesso) {
        this.senhaDeAcesso = senhaDeAcesso;
    }

    public Usuario(long IDusuario, String senhaDeAcesso) {
        this.IDusuario = IDusuario;
        this.senhaDeAcesso = senhaDeAcesso;
    }

    public Usuario() {
    }
}
