package app;


public class Plato {
    private static int id;
    private String nombre;
    private float precio;
    private int tipoUnidad; // 1. kilos 2. unidades 3. litros
    private int tiempoDemora; // en minutos
    private int stock;
    private String[] taks;

    ///constructores
    public Plato(String nombre, float precio, int tipoUnidad, int tiempoDemora, int stock, String[] taks) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoUnidad = tipoUnidad;
        this.tiempoDemora = tiempoDemora;
        this.stock = stock;
        this.taks = taks;
        this.id++;
    }

    public Plato() {
        this.nombre = " ";
        this.precio = 0;
        this.tipoUnidad = 0;
        this.tiempoDemora = 0;
        this.stock = 0;
        this.taks = null;
        this.id++;
    }

    ///Getters


    public static int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getTipoUnidad() {
        return tipoUnidad;
    }

    public int getTiempoDemora() {
        return tiempoDemora;
    }

    public int getStock() {
        return stock;
    }

    public String[] getTaks() {
        return taks;
    }
    ///----------------------------------------------------------------------------------------------------------
    //SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setTipoUnidad(int tipoUnidad) {
        this.tipoUnidad = tipoUnidad;
    }

    public void setTiempoDemora(int tiempoDemora) {
        this.tiempoDemora = tiempoDemora;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setTaks(String[] taks) {
        this.taks = taks;
    }

    ///------------------------------------------------------------------------------------------------------
    /// FUNCIONES FASE 1:
    public boolean reducirStock(int cant)
    {
        /// comprueba si hay stock esta funcion dirve para las comprobaciones del pedido
        boolean rta = false;
        if(getStock()>0 && (getStock()-cant)>=0)
        {
            setStock(getStock()-cant);
        }

        return  rta;
    }
    public boolean hayStock()
    {
        if(getStock()>0)
        {
            return  true;
        }else
        {
            return false;
        }
    }
}
