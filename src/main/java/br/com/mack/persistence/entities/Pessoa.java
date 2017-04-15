package br.com.mack.persistence.entities;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private long id_pessoa;
    private String nome, email, senha;
    private double celular;

    public Pessoa() {
    }

    public Pessoa(long id_pessoa, String nome, String email, String senha, double celular) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(long id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getCelular() {
        return celular;
    }

    public void setCelular(double celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id_pessoa=" + id_pessoa + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", celular=" + celular + '}';
    }

}
