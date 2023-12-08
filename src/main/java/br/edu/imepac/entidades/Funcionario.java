/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.imepac.entidades;

//@author Alfredo

public class Funcionario {
    //declaração de atributos:
    private String nome;
    private int RG;
    private String orgaoEmissor;
    private long CPF;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private long telefone;
    private long celular;
    private long CTPS;// formato de número ctps: 1234567/1234
    private long PIS;// formato de número PIS: "XXX. XXXXX. XX-X".

   //getters e setters:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getCTPS() {
        return CTPS;
    }

    public void setCTPS(long CTPS) {
        this.CTPS = CTPS;
    }

    public long getPIS() {
        return PIS;
    }

    public void setPIS(long PIS) {
        this.PIS = PIS;
    }

    //construtor:

    public Funcionario(String nome, int RG, String orgaoEmissor, long CPF, String endereco, int numero, String complemento, String bairro, String cidade, String estado, long telefone, long celular, long CTPS, long PIS) {
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
    }

    public Funcionario() {
    }
}