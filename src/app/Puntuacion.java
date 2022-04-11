package app;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class Puntuacion {
    private int valor;
    private String nombreUsuario;
    private String comentario;
    private LocalDate fecha;

    public Puntuacion(int valor, String nombreUsuario, String comentario) {
        this.valor = valor;
        this.nombreUsuario = nombreUsuario;
        this.comentario = comentario;
        this.fecha = LocalDate.now();
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

    public LocalDate getFecha() {
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
