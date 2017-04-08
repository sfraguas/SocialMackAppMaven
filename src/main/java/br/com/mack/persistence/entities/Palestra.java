package br.com.mack.persistence.entities;

import java.io.Serializable;


public class Palestra implements Serializable{
    
    private long id_palestra;
    private String tema;
    private int codigo;
    
    public Palestra(){
        
    }
    
    public long getId_palestra(){
        return this.id_palestra;
    }
    
    public void setId_palestra(long id_palestra){
        this.id_palestra = id_palestra;
    }
    
    public String getTema(){
        return this.tema;
    }
    
    public void setTema(String tema){
        this.tema = tema;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    } 
    
    @Override
    public String toString(){
        return "Palestra{" + "id_palestra=" + id_palestra + ", tema=" + tema + ", codigo=" + codigo + '}';
    }
}