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

    private Long registro_usuario;

    public Usuario(){

    }

    public Usuario(Long registro_usuario,
                   String identificacao_usuario,
                   String senha_acesso,
                   String cadastro_funcionario,
                   String cadastro_usuario,
                   String cadastro_paciente,
                   String cadastro_especialidade,
                   String cadastro_medico,
                   String cadastro_convenio,
                   String agendamento_consulta,
                   String cancelamento_consulta,
                   String modulo_administrativo,
                   String modulo_agendamento,
                   String modulo_atendimento)
    {
        this.registro_usuario = registro_usuario;
        this.identificacao_usuario = identificacao_usuario;
        this.senha_acesso = senha_acesso;
        this.cadastro_funcionario = cadastro_funcionario;
        this.cadastro_usuario = cadastro_usuario;
        this.cadastro_paciente = cadastro_paciente;
        this.cadastro_especialidade = cadastro_especialidade;
        this.cadastro_medico = cadastro_medico;
        this.cadastro_convenio = cadastro_convenio;
        this.agendamento_consulta = agendamento_consulta;
        this.cancelamento_consulta = cancelamento_consulta;
        this.modulo_administrativo = modulo_administrativo;
        this.modulo_agendamento = modulo_agendamento;
        this.modulo_atendimento = modulo_atendimento;
    }

    public Usuario(String identificacao_usuario,
                   String senha_acesso,
                   String cadastro_funcionario,
                   String cadastro_usuario,
                   String cadastro_paciente,
                   String cadastro_especialidade,
                   String cadastro_medico,
                   String cadastro_convenio,
                   String agendamento_consulta,
                   String cancelamento_consulta,
                   String modulo_administrativo,
                   String modulo_agendamento,
                   String modulo_atendimento)
    {
        this.identificacao_usuario = identificacao_usuario;
        this.senha_acesso = senha_acesso;
        this.cadastro_funcionario = cadastro_funcionario;
        this.cadastro_usuario = cadastro_usuario;
        this.cadastro_paciente = cadastro_paciente;
        this.cadastro_especialidade = cadastro_especialidade;
        this.cadastro_medico = cadastro_medico;
        this.cadastro_convenio = cadastro_convenio;
        this.agendamento_consulta = agendamento_consulta;
        this.cancelamento_consulta = cancelamento_consulta;
        this.modulo_administrativo = modulo_administrativo;
        this.modulo_agendamento = modulo_agendamento;
        this.modulo_atendimento = modulo_atendimento;
    }

    private String identificacao_usuario;
    private String senha_acesso;
    private String cadastro_funcionario;
    private String cadastro_usuario;
    private String cadastro_paciente;
    private String cadastro_especialidade;
    private String cadastro_medico;
    private String cadastro_convenio;
    private String agendamento_consulta;
    private String cancelamento_consulta;
    private String modulo_administrativo;
    private String modulo_agendamento;
    private String modulo_atendimento;

    public Long getRegistro_usuario() {
        return registro_usuario;
    }

    public void setRegistro_usuario(Long registro_usuario) {
        this.registro_usuario = registro_usuario;
    }

    public String getIdentificacao_usuario() {
        return identificacao_usuario;
    }

    public void setIdentificacao_usuario(String identificacao_usuario) {
        this.identificacao_usuario = identificacao_usuario;
    }

    public String getSenha_acesso() {
        return senha_acesso;
    }

    public void setSenha_acesso(String senha_acesso) {
        this.senha_acesso = senha_acesso;
    }

    public String getCadastro_funcionario() {
        return cadastro_funcionario;
    }

    public void setCadastro_funcionario(String cadastro_funcionario) {
        this.cadastro_funcionario = cadastro_funcionario;
    }

    public String getCadastro_usuario() {
        return cadastro_usuario;
    }

    public void setCadastro_usuario(String cadastro_usuario) {
        this.cadastro_usuario = cadastro_usuario;
    }

    public String getCadastro_paciente() {
        return cadastro_paciente;
    }

    public void setCadastro_paciente(String cadastro_paciente) {
        this.cadastro_paciente = cadastro_paciente;
    }

    public String getCadastro_especialidade() {
        return cadastro_especialidade;
    }

    public void setCadastro_especialidade(String cadastro_especialidade) {
        this.cadastro_especialidade = cadastro_especialidade;
    }

    public String getCadastro_medico() {
        return cadastro_medico;
    }

    public void setCadastro_medico(String cadastro_medico) {
        this.cadastro_medico = cadastro_medico;
    }

    public String getCadastro_convenio() {
        return cadastro_convenio;
    }

    public void setCadastro_convenio(String cadastro_convenio) {
        this.cadastro_convenio = cadastro_convenio;
    }

    public String getAgendamento_consulta() {
        return agendamento_consulta;
    }

    public void setAgendamento_consulta(String agendamento_consulta) {
        this.agendamento_consulta = agendamento_consulta;
    }

    public String getCancelamento_consulta() {
        return cancelamento_consulta;
    }

    public void setCancelamento_consulta(String cancelamento_consulta) {
        this.cancelamento_consulta = cancelamento_consulta;
    }

    public String getModulo_administrativo() {
        return modulo_administrativo;
    }

    public void setModulo_administrativo(String modulo_administrativo) {
        this.modulo_administrativo = modulo_administrativo;
    }

    public String getModulo_agendamento() {
        return modulo_agendamento;
    }

    public void setModulo_agendamento(String modulo_agendamento) {
        this.modulo_agendamento = modulo_agendamento;
    }

    public String getModulo_atendimento() {
        return modulo_atendimento;
    }

    public void setModulo_atendimento(String modulo_atendimento) {
        this.modulo_atendimento = modulo_atendimento;
    }
}
