package app;

import java.util.Calendar;

public class Item{
    private int idPlato;
    private int cantidad; //x unidad
    private float precioItem; //precio(plato)xcantidad

    public Item(int idPlato, int cantidad, float precioItem) {
        this.idPlato = idPlato;
        this.cantidad = cantidad;
        this.precioItem = precioItem;
    }
    ///GETTERS--------------------------------------------------------------------------------------------------

    public int getIdPlato() {
        return idPlato;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecioItem() {
        return precioItem;
    }


    ///SETTERS--------------------------------------------------------------------------------------------------

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioItem(float precioItem) {
        this.precioItem = precioItem;
    }
}
