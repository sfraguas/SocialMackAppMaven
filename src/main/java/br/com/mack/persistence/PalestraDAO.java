package br.com.mack.persistence;

import br.com.mack.persistence.entities.Palestra;
import br.com.mack.singletonconnection.SingletonConnection;
import br.com.mack.persistence.GenericDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class PalestraDAO implements GenericDAO<Palestra>{
    public static Connection connection = SingletonConnection.getInstance().getConnection();
    
    @Override
    public void create(Palestra p){
        
    }
    
    @Override
    public void List<Palestra> readAll(){
        List<Palestra> palestras = new ArrayList<>();
         
        //Declarar String de busca
        String sql = "SELECT * FROM palestra";
        
        try{
            Statement ps = connection.createStatement();
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Palestra palestra = new Palestra();
                palestra.setId_palestra(rs.getLong("id"));
                palestra.setTema(rs.getString("tema"));
                palestra.setCodigo(rs.getInt("codigo"));
                palestras.add();
            }
            ps.close();
            
        }catch(SQLException ex){
            
        }
        
        return palestras;
    }
    
    @Override
    public Palestra readById(){
        return null;
    }
    
    @Override
    public void update(Palestra p){
        
    }
    
    @Override
    public void delete(Palestra p){
        
    }
    
}