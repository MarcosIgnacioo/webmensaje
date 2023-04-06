package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensajesDAO {
    static Conexion dbConnect = null;
    public  static void crearMensajeDB(Mensajes mensaje)throws SQLException {
        if (dbConnect == null){
            dbConnect = new Conexion();
        }
        try (Connection conexion = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO mensajes (mensaje,autor_mensaje) VALUES (?,?)";
                ps = conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2, mensaje.getAutorMensaje());
                ps.executeUpdate();
                System.out.println("Se hizo el mensajito");
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

    public static void leerMensajesDB(){

    }

    public static void borrarMensajesDB(int id){

    }

    public static void actualizarMensajeDB(Mensajes mensaje){

    }
}
