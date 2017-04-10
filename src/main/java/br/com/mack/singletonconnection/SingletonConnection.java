package br.com.mack.singletonconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.ClassNotFoundException;

public class SingletonConnection{
    private String dbUrl;
    private Connection connection;
    private static SingletonConnection instance;
    
    private SingletonConnection(){
        
    } 
    
    public static synchronized SingletonConnection getInstance() {
        if (instance == null) {
            instance = new SingletonConnection();
        }
        return instance;
    }
    public Connection getConnection(){
        
        try{
            Class.forName("org.postgresql.Driver");
            //dbUrl = System.getenv("JDBC_DATABASE_URL");
            dbUrl = "postgres://eicemvsqtevdzf:fb16388f8f1b45b3764bf14bca02f06787f46f2e3ea05fe8b29fd63be8da6a47@ec2-23-21-220-48.compute-1.amazonaws.com:5432/d29ubrbji6ovbs";
            connection = DriverManager.getConnection(dbUrl);
        } catch(Exception ex){
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}