package br.com.mack.persistence.entities;

import java.io.Serializable;


public class Participante implements Serializable{
  
    private long id_participante;
    private String nome,email;
    
    public Participante() {
    }

    public Participante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Participante(String nome, String email, long id_participante) {
        this.nome = nome;
        this.email = email;
        this.id_participante = id_participante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId_participante() {
        return id_participante;
    }

    public void setId_participante(long id_participante) {
        this.id_participante = id_participante;
    }

    

    @Override
    public String toString() {
        return "Participante{" + "nome=" + nome + ", email=" + email + ", id_participante=" + id_participante + '}';
    }
}