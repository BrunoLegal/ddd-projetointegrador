package br.edu.imepac.entidades;


public class Convenio {

    private Integer codigo_convenio;
    private String empresa_convenio;
    private String cnpj;
    private String telefone;

    public Convenio() {
    }

    public Convenio(String empresa_convenio, String cnpj, String telefone) {
        this.codigo_convenio = null;
        this.empresa_convenio = empresa_convenio;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    public Convenio(Integer codigo_convenio, String empresa_convenio, String cnpj, String telefone) {
        this.codigo_convenio = codigo_convenio;
        this.empresa_convenio = empresa_convenio;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }

    public Integer getcodigo_convenio() {
        return codigo_convenio;
    }

    public void setcodigo_convenio(Integer codigo_convenio) {
        this.codigo_convenio = codigo_convenio;
    }git stat
    public String getempresa_convenio() {
        return empresa_convenio;
    }

    public void setempresa_convenio(String empresa_convenio) {
        this.empresa_convenio = empresa_convenio;
    }

    public String getcnpj() {
        return cnpj;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String gettelefone() {
        return telefone;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

}