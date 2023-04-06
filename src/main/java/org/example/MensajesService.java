package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MensajesService {
    static Scanner scn = new Scanner(System.in);
    public static void crearMensaje() throws SQLException {
        System.out.println("Cual es el mensaje que quiere escribir");
        String msg = scn.nextLine();
        System.out.println("Nombre del autor del mensaje");
        String autor = scn.nextLine();
        Mensajes registro = new Mensajes();
        registro.setMensaje(msg);
        registro.setAutorMensaje(autor);
        MensajesDAO.crearMensajeDB(registro);
    }

    public static void listarMensajes() throws SQLException {
        MensajesDAO.leerMensajesDB();
    }

    public static void borrarMensaje() throws SQLException {
        System.out.println("Cual es el id del mensaje que quiere borrar");
        int msgId = scn.nextInt();
        MensajesDAO.borrarMensajesDB(msgId);
    }

    public static void editarMensaje() throws SQLException {

        System.out.println("Cual es el id del mensaje que quiere editar");
        int msgId = scn.nextInt();
        scn.nextLine();
        System.out.println("Cual es el mensaje que quiere escribir");
        String msg = scn.nextLine();
        Mensajes registro = new Mensajes();
        registro.setMensaje(msg);
        registro.setIdMensaje(msgId);
        MensajesDAO.actualizarMensajeDB(registro);
    }
}
