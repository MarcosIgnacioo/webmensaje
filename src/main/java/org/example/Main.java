package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexion c = new Conexion();
        try(Connection cnx = Conexion.getConnection()){

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("asdddddd");
        System.out.println("Hello world!");
    }
}