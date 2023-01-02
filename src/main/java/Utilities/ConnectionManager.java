package Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionManager {
    public static Connection con;
    public static Statement stat;
    private Connection connection;
    private String DB_URL = "jdbc:mysql://localhost:3306/smart_clinic";
    private String username;
    private String password;
    
    public String getDB_URL() {
        return DB_URL;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    String url = "jdbc:mysql://localhost:3306/database_w5";
    String user = "root";
    String pwd = "";
    
    public Connection LogOn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pwd);  
            stat = con.createStatement();
        }catch (Exception ex){
            System.out.println(ex);
        }
        return con;
    }
    
    public void LogOff(){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection connect() {
       if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(getDB_URL(), 
                        getUsername(), getPassword());
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ConnectionManager.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
    public Connection disconnect() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}

