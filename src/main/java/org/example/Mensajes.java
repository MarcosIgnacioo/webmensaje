package org.example;

public class Mensajes {
    int id_mensaje;
    String mensaje;
    String autorMensaje;
    String fechaDeMensaje;


    public Mensajes(String mensaje, String autorMensaje, String fechaDeMensaje) {
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaDeMensaje = fechaDeMensaje;
    }

    public Mensajes(){

    }

    public int getIdMensaje() {
        return id_mensaje;
    }

    public void setIdMensaje(int id_mensaje) {
        this.id_mensaje = id_mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaDeMensaje() {
        return fechaDeMensaje;
    }

    public void setFechaDeMensaje(String fechaDeMensaje) {
        this.fechaDeMensaje = fechaDeMensaje;
    }
}
