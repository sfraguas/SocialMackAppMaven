package br.com.mack.persistence;

import br.com.mack.persistence.entities.Participante;
import br.com.mack.singletonconnection.SingletonConnection;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParticipanteDAO implements GenericDAO<Participante> {

    private static Connection connection = SingletonConnection.getInstance().getConnection();

     @Override
    public void create(Participante part){
        
        try {
            String sql = "INSERT INTO participante(nome,email)VALUES(?,?)";
        
            PreparedStatement ps = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,part.getNome());
            ps.setString(2,part.getEmail());
            ps.execute();
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            part.setId_participante(keys.getInt(1));
            ps.close();
        } catch(Exception ex) {
            Logger.getLogger(ParticipanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public List<Participante> readAll() {
        return null;
    }
    
    @Override
    public Participante readById(long id) {
        return null;
    }
    
    @Override
    public void update(Participante participante) {
       
    }
    
    @Override
    public void delete(Participante participante) {
        
    }
}