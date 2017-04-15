package br.com.mack.persistence;

import br.com.mack.persistence.entities.Participante;
import br.com.mack.singletonconnection.SingletonConnection;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.postgresql.util.PSQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParticipanteDAO implements GenericDAO<Participante> {

    private static Connection connection = SingletonConnection.getInstance().getConnection();

    @Override
    public void create(Participante part){
        
        try {
            String sql = "INSERT INTO pessoa(nome,email,id_tipo,senha)VALUES(?,?,1,123)";
            
            PreparedStatement ps = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,part.getNome());
            ps.setString(2,part.getEmail());
            ps.execute();
            ResultSet keys = ps.getGeneratedKeys();
            keys.next();
            part.setId_pessoa(keys.getInt(1));
            
            String sql2 = "INSERT INTO participante(id_pessoa)VALUES(?)";
            PreparedStatement ps2 = connection.prepareStatement(sql2);
            ps2.setLong(1,part.getId_pessoa());
            ps2.execute();

            ps.close();
            ps2.close();
            
            System.out.println("************* FUNCIONOU *****************");
        catch(SQLException ex) {
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