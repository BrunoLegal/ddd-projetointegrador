/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.entidades;
import java.sql.Date; // importei essa classe para poder fazer o java formatar automaticamente o tipo de dado "Date" pra ficar idêntico ao tipo de dado "Date" que será usado no banco de dados

//@author Alfredo

public class Funcionario {
    //declaração de atributos:
    private long codigo_funcionario;
    private String nome;
    private String RG;
    private String orgaoEmissor;
    private String CPF;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;
    private String CTPS;// formato de número ctps: 1234567/1234
    private String PIS;// formato de número PIS: "XXX. XXXXX. XX-X".

    private java.sql.Date data_nascimento;

   //getters e setters:

    public long getCodigo_funcionario() {
        return codigo_funcionario;
    }

    public void setCodigo_funcionario(long codigo_funcionario) {
        this.codigo_funcionario = codigo_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCTPS() {
        return CTPS;
    }

    public void setCTPS(String CTPS) {
        this.CTPS = CTPS;
    }

    public String getPIS() {
        return PIS;
    }

    public void setPIS(String PIS) {
        this.PIS = PIS;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public Funcionario(long codigo_funcionario, String nome, String RG, String orgaoEmissor, String CPF, String endereco, String numero, String complemento, String bairro, String cidade, String estado, String telefone, String celular, String CTPS, String PIS, Date data_nascimento) {
        this.codigo_funcionario = codigo_funcionario;
        this.nome = nome;
        this.RG = RG;
        this.orgaoEmissor = orgaoEmissor;
        this.CPF = CPF;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.celular = celular;
        this.CTPS = CTPS;
        this.PIS = PIS;
        this.data_nascimento = data_nascimento;
    }

    public Funcionario(String nome, String RG, String orgaoEmissor, String CPF, String endereco, String numero, String complemento, String bairro, String cidade, String estado, String telefone, String celular, String CTPS, String PIS, java.sql.Date data_nascimento) {
        this.nome = nome;
        this.RG = RG;
        this.orgaoEmissor = orgaoEmissor;
        this.CPF = CPF;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.celular = celular;
        this.CTPS = CTPS;
        this.PIS = PIS;
        this.data_nascimento = data_nascimento;
    }

    public Funcionario() {
    }
}