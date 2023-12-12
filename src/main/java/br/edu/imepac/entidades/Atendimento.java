/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.entidades;

/**
 * prontuario
 * @author brunoaj
 */
public class Atendimento {
    private Long registro_prontuario;
    private Long registro_agenda;
    private String historico;
    private String receituario;
    private String exames;

    public Atendimento(Long registro_prontuario, Long registro_agenda, String historico, String receituario, String exames){
        this.registro_prontuario = registro_prontuario;
        this.registro_agenda = registro_agenda;
        this.historico = historico;
        this.receituario = receituario;
        this.exames = exames;
    }

    public Atendimento(Long registro_agenda, String historico, String receituario, String exames){
        this.registro_agenda = registro_agenda;
        this.historico = historico;
        this.receituario = receituario;
        this.exames = exames;
    }

    public Long getRegistro_prontuario() {
        return registro_prontuario;
    }

    public void setRegistro_prontuario(Long registro_prontuario) {
        this.registro_prontuario = registro_prontuario;
    }

    public Long getRegistro_agenda() {
        return registro_agenda;
    }

    public void setRegistro_agenda(Long registro_agenda) {
        this.registro_agenda = registro_agenda;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getReceituario() {
        return receituario;
    }

    public void setReceituario(String receituario) {
        this.receituario = receituario;
    }

    public String getExames() {
        return exames;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }
}
