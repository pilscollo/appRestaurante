package app;

import java.util.Calendar;

public class Puntuacion {
    private int valor;
    private String nombreUsuario;
    private String comentario;
    private Calendar fecha;

    public Puntuacion(int valor, String nombreUsuario, String comentario) {
        this.valor = valor;
        this.nombreUsuario = nombreUsuario;
        this.comentario = comentario;
        this.fecha = Calendar.getInstance();
    }
    ///Getters------------------------------------------------------------------------------------------------

    public int getValor() {
        return valor;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getComentario() {
        return comentario;
    }

    public Calendar getFecha() {
        return fecha;
    }
    ///SETTERS---------------------------------------------------------------------------------------------------

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }


}
