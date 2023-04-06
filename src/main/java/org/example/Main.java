package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scn = new Scanner(System.in);
        int opcion = 0;
        Conexion c = new Conexion();
        try(Connection cnx = Conexion.getConnection()){

        }catch (Exception e){
            System.out.println(e);
        }
        do {
            System.out.println("########################");
            System.out.println("App mensajes");
            System.out.println("1.- Crear mensaje");
            System.out.println("2.- Listar los mensajes");
            System.out.println("3.- Editar mensaje");
            System.out.println("4.- Eliminar mensaje");
            System.out.println("5.- Salir");
            opcion = scn.nextInt();
            switch (opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    break;
                default:
                    System.out.println("No ha escogido nada");
                    break;
            }

        }while(opcion != 5);
    }
}