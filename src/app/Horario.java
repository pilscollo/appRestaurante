package app;

public class Horario{
    private int horaInicio;
    private int  horaFin;

    public Horario(int horaInicio, int horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
}