/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.entidades;

/**
 *
 * @author Usuário
 */
public class Medico {

    private int codigo_medico;
    private String nome_medico;
    private int codigo_especialidade;
    private String crm;

    public Medico() {
    }

    public Medico(String nome_medico, String crm, int codigo_especialidade) {
        this.codigo_medico = null;
        this.nome_medico = nome_medico;
        this.crm = crm;
        this.codigo_especialidade = codigo_especialidade;
    }
    public Medico(int codigo_medico, String nome_medico, String crm, int codigo_especialidade) {
        this.codigo_medico = codigo_medico;
        this.nome_medico = nome_medico;
        this.crm = crm;
        this.codigo_especialidade = codigo_especialidade;
    }
    public int getCodigo_Medico() {
        return codigo_medico;
    }

    public void setCodigo_Medico(int codigo_medico) {
        this.codigo_medico = codigo_medico;
    }

    public String getNome_Medico() {
        return nome_medico;
    }

    public void setNome_Medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    public int getCodigo_Especialidade() {
        return codigo_especialidade;
    }

    public void setCodigo_Especialidade(int codigo_especialidade) {
        this.codigo_especialidade = codigo_especialidade;
    }

    public String getCRM() {
        return crm;
    }

    public void setCRM(String crm) {
        this.crm = crm;
    }


}
