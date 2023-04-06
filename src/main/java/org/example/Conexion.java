package org.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConnection(){
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if (conection != null){
                System.out.println("Todo good");
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conection;
    }
}
