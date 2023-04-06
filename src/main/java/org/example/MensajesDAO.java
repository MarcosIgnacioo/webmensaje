package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public static void leerMensajesDB() throws SQLException {
        if (dbConnect == null){
            dbConnect = new Conexion();
        }
        try (Connection conexion = dbConnect.getConnection()){
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "SELECT * FROM mensajes";
                ps = conexion.prepareStatement(query);
                rs = ps.executeQuery(); // ejectua la consulta sin transacciones
                while(rs.next()){
                    System.out.println("Id: " + rs.getInt("id_mensaje"));
                    System.out.println("Mensaje: " + rs.getString("mensaje"));
                    System.out.println("Autor del mensaje: " + rs.getString("autor_mensaje"));
                    System.out.println("Fecha del mensaje: " + rs.getString("fecha_mensaje"));
                    System.out.println("");}

            }catch (Exception ex){
                System.out.println(ex);
            }
        }
    }

    public static void borrarMensajesDB(int id) throws SQLException {
        if (dbConnect == null){
            dbConnect = new Conexion();
        }
        try (Connection conexion = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "DELETE FROM mensajes WHERE mensajes . id_mensaje = ?";
                ps = conexion.prepareStatement(query); // se prepara el statement
                ps.setString(1,String.valueOf(id)); // se actualizan los datos
                ps.executeUpdate();// se ejecuta la version actualizada asi debe de ser en ese orden!!!!!!
                System.out.println("Se borro el mensajito");
            }catch (Exception e){
                System.out.println(e);
            }
        }

    }

    public static void actualizarMensajeDB(Mensajes mensaje) throws SQLException {
        if (dbConnect == null){
            dbConnect = new Conexion();
        }
        try (Connection conexion = dbConnect.getConnection()){
            PreparedStatement ps = null;
            try{
                String query = "UPDATE mensajes SET mensaje = ? WHERE mensajes . id_mensaje = ?";
                ps = conexion.prepareStatement(query);
                ps.setString(1,String.valueOf(mensaje.getMensaje()));
                ps.setString(2,String.valueOf(mensaje.getIdMensaje()));
                ps.executeUpdate();
                System.out.println("Se actualizo el mensajito");
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
