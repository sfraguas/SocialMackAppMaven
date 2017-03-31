package br.com.mack.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TesteConnection {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String URL = "postgres://cfgphhhbwhsafx:9b4574eee1dffbfb2a7c6b9c4f0e400a9efff7af7ba87fd9dc75575b6e4d8517@ec2-54-235-84-244.compute-1.amazonaws.com:5432/d4nhs86sibbeej";
    private static final String USERNAME = "cfgphhhbwhsafx";
    private static final String PASSWORD = "9b4574eee1dffbfb2a7c6b9c4f0e400a9efff7af7ba87fd9dc75575b6e4d8517";

    public TesteConnection() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");

            try {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(TesteConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (conn != null) {
            System.out.println("Conectando com sucesso");
        }

    }
    
}