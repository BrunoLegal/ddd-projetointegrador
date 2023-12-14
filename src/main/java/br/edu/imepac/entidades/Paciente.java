package br.edu.imepac.entidades;

import br.edu.imepac.enums.Sexo;
import br.edu.imepac.enums.Sim_ou_Nao;

import java.sql.Date;// pra formatar o dado de tata de nascimento pro formato de Date igual ao do SQL
public class Paciente {
    private long codigo_paciente;
    private String nome;
    private String RG;
    private String orgaoEmissor;
    private String CPF;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;
    private Date dataNascimento;
    private String sexo;// esse aqui depois tem que alterar pra só receber M (sexo masculino) ou F (sexo feminino)
    private String possuiConvenio;
    private long convenio;

    public long getCodigo_paciente() {
        return codigo_paciente;
    }

    public void setCodigo_paciente(long codigo_paciente) {
        this.codigo_paciente = codigo_paciente;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPossuiConvenio() {
        return possuiConvenio;
    }

    public void setPossuiConvenio(String possuiConvenio) {
        this.possuiConvenio = possuiConvenio;
    }

    public long getConvenio() {
        return convenio;
    }

    public void setConvenio(long convenio) {
        this.convenio = convenio;
    }

    public Paciente(long codigo_paciente, String nome, String RG, String orgaoEmissor, String CPF, String endereco, String complemento, String bairro, String cidade, String estado, String telefone, String celular, Date dataNascimento, String sexo, String possuiConvenio, long convenio) {
        this.codigo_paciente = codigo_paciente;
        this.nome = nome;
        this.RG = RG;
        this.orgaoEmissor = orgaoEmissor;
        this.CPF = CPF;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.possuiConvenio = possuiConvenio;
        this.convenio = convenio;
    }

    public Paciente(String nome, String RG, String orgaoEmissor, String CPF, String endereco, String complemento, String bairro, String cidade, String estado, String telefone, String celular, Date dataNascimento, String sexo, String possuiConvenio, long convenio) {
        this.nome = nome;
        this.RG = RG;
        this.orgaoEmissor = orgaoEmissor;
        this.CPF = CPF;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.possuiConvenio = possuiConvenio;
        this.convenio = convenio;
    }

    public Paciente() {
    }
}
