package br.com.mack.persistence;

import br.com.mack.persistence.entities.Palestra;
import br.com.mack.singletonconnection.SingletonConnection;
import br.com.mack.persistence.GenericDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
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
    public List<Palestra> readAll(){
        List<Palestra> palestras = new ArrayList<Palestra>();
         
        //Declarar String de busca
        String sql = "SELECT * FROM palestra";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Palestra palestra = new Palestra();
                palestra.setId_palestra(rs.getLong("id"));
                palestra.setTema(rs.getString("tema"));
                palestra.setCodigo(rs.getInt("codigo"));
                palestras.add(palestra);
            }
            ps.close();
            
        }catch(SQLException ex){
            Logger.getLogger(PalestraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return palestras;
    }
    
    @Override
    public Palestra readById(long id){
        return null;
    }
    
    @Override
    public void update(Palestra p){
        
    }
    
    @Override
    public void delete(Palestra p){
        
    }
    
    public void registerInPalestra(long id_participante,long id_palestra){
        
        String sql = "INSERT INTO participante_palestra(id_participante,id_palestra)VALUES(?,?)";
        
        try{
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1,id_participante);
            ps.setLong(2,id_palestra);
            ps.execute();
        }catch(SQLException ex){
            Logger.getLogger(PalestraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}