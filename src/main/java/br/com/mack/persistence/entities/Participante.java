package br.com.mack.persistence.entities;

import java.io.Serializable;


public class Participante extends Pessoa implements Serializable{
  
    private String formacao;
    
    public Participante() {
    }

    public Participante(String formacao, long id_pessoa,String nome, String email, String senha, double celular) {
        super(id_pessoa,nome, email, senha, celular);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Participante{" + "formacao=" + formacao + '}';
    }

   
}