package br.com.mack.persistence.entities;

import java.io.Serializable;

public class Organizador extends Pessoa implements Serializable {

    private String empresa;
    private int telefone;

    public Organizador() {
    }

    public Organizador(String empresa, int telefone, long id_pessoa,String nome, String email, String senha, double celular) {
        super(id_pessoa, nome, email, senha, celular);
        this.empresa = empresa;
        this.telefone = telefone;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Organizador{" + "empresa=" + empresa + ", telefone=" + telefone + '}';
    }

}
