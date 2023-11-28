/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.entidades;

/**
 *
 * @author Usuário
 */
public class Especialidade {
    private Long codigo_especialidade;
    private String descricao_especialidade;

    public Especialidade(){

    }

    public Especialidade(String descricao_especialidade){
        this.codigo_especialidade = null;
        this.descricao_especialidade = descricao_especialidade;
    }

    public Especialidade(Long codigo_especialidade, String descricao_especialidade){
        this.codigo_especialidade = codigo_especialidade;
        this.descricao_especialidade = descricao_especialidade;
    }

    public Long getCodigo_especialidade() {
        return codigo_especialidade;
    }

    public void setCodigo_especialidade(Long codigo_especialidade) {
        this.codigo_especialidade = codigo_especialidade;
    }

    public String getDescricao_especialidade() {
        return descricao_especialidade;
    }

    public void setDescricao_especialidade(String descricao_especialidade) {
        this.descricao_especialidade = descricao_especialidade;
    }
}

