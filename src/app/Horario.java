package app;

public class Horario{
    private float horaInicio;
    private float  horaFin;

    public Horario(float horaInicio, float horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public float getHoraInicio() {
        return horaInicio;
    }

    public float getHoraFin() {
        return horaFin;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }
}