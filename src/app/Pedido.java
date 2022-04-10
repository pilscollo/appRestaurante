package app;


import java.util.Calendar;

public class Pedido {
    private Calendar fecha;
    private Item[] listaItem;
    private int costoEnvio;
    private float precioTotal;// suma de los items
    private int idRestaurante;
    private int estadoPedido;// 1.Recibido (delivery), 2.confirmado, 3. en curso, 4. en camino.5 entregado/
    // 0.recibido take away -1 listo -2 retirado


    public Pedido( int costoEnvio, int idRestaurante, int estadoPedido,Item listaItem[]) {
        this.fecha = Calendar.getInstance();
        this.listaItem = listaItem;
        this.costoEnvio = costoEnvio;
        this.precioTotal = 0;
        this.idRestaurante = idRestaurante;
        this.estadoPedido = estadoPedido;
    }
    ///GETTERS--------------------------------------------------------------------------------------------------

    public Calendar getFecha() {
        return fecha;
    }

    public Item[] getListaItem() {
        return listaItem;
    }

    public int getCostoEnvio() {
        return costoEnvio;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public int getIdRestaurante() {
        return idRestaurante;
    }

    public int getEstadoPedido() {
        return estadoPedido;
    }

    ///SETTERS--------------------------------------------------------------------------------------------------

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setListaItem(Item[] listaItem) {
        this.listaItem = listaItem;
    }

    public void setCostoEnvio(int costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setIdRestaurante(int idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public void setEstadoPedido(int estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    ///Funciones: ----------------------------------------------------------------------------------------------

    ///calcular costo total de la lista de items y cambia el precio total (hay que utilizarla para hacer el pedido)

    public void calcularPrecioTotal(){
        float precioTotal = 0f;

        for (int i = 0; i < getListaItem().length; i++) {
            if(getListaItem()[i]!=null) {
                precioTotal = precioTotal + getListaItem()[i].getPrecioItem();
            }
        }
        setPrecioTotal(precioTotal);

    }
}
