/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.entidades;


import java.sql.*;

public class Consulta {

    public Consulta() {
    }

    public Consulta(Long registro_agenda,
                    Long registro_usuario,
                    Long codigo_paciente,
                    Long codigo_medico,
                    Date data,
                    Time hora,
                    String retorno,
                    String cancelado,
                    String motivo_cancelamento) {
        this.registro_agenda = registro_agenda;
        this.registro_usuario = registro_usuario;
        this.codigo_paciente = codigo_paciente;
        this.codigo_medico = codigo_medico;
        this.data = data;
        this.hora = hora;
        this.retorno = retorno;
        this.cancelado = cancelado;
        this.motivo_cancelamento = motivo_cancelamento;
    }

    public Consulta(Long registro_usuario,
                    Long codigo_paciente,
                    Long codigo_medico,
                    Date data,
                    Time hora,
                    String retorno,
                    String cancelado,
                    String motivo_cancelamento) {
        this.registro_usuario = registro_usuario;
        this.codigo_paciente = codigo_paciente;
        this.codigo_medico = codigo_medico;
        this.data = data;
        this.hora = hora;
        this.retorno = retorno;
        this.cancelado = cancelado;
        this.motivo_cancelamento = motivo_cancelamento;
    }

    public Consulta(Date data,
                    Time hora,
                    String retorno,
                    String cancelado,
                    String motivo_cancelamento) {
        this.data = data;
        this.hora = hora;
        this.retorno = retorno;
        this.cancelado = cancelado;
        this.motivo_cancelamento = motivo_cancelamento;
    }


    private Long registro_agenda;
    private Long registro_usuario;
    private Long codigo_paciente;
    private Long codigo_medico;
    private Date data;
    private Time hora;
    private String retorno;
    private String cancelado;
    private String motivo_cancelamento;

    public Long getregistro_agenda() {
        return registro_agenda;
    }

    public void setregistro_agenda(Long registro_agenda) {
        this.registro_agenda = registro_agenda;
    }

    public Long getregistro_usuario() {
        return registro_usuario;
    }

    public void setregistro_usuario(Long registro_usuario) {
        this.registro_usuario = registro_usuario;
    }

    public Long getcodigo_paciente() {
        return codigo_paciente;
    }

    public void setcodigo_paciente(Long codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
    }

    public Long getcodigo_medico() {
        return codigo_medico;
    }

    public void setcodigo_medico(Long codigo_medico) {
        this.codigo_medico = codigo_medico;
    }

    public Date getdata() {
        return data;
    }

    public void setdata(Date data) {
        this.data = data;
    }

    public Time gethora() {
        return hora;
    }

    public void sethora(Time hora) {
        this.hora = hora;
    }

    public String getretorno() {
        return retorno;
    }

    public void setretorno(String retorno) {
        this.retorno = retorno;
    }

    public String getcancelado() {
        return cancelado;
    }

    public void setcancelado(String cancelado) {
        this.cancelado = cancelado;
    }

    public String getmotivo_cancelamento() {
        return motivo_cancelamento;
    }

    public void setmotivo_cancelamento(String motivo_cancelamento) {
        this.motivo_cancelamento = motivo_cancelamento;
    }

}
    

