package app;

public class Restaurante {
    private static int  id;
    private String nombre;
    private String dirección;
    private String teléfono;
    private String [] listaDecategorías;
    private float puntuacion;
    private Plato [] listaDePlatos;
    private boolean TakeAway;
    private boolean Delivery;
    private Puntuacion [] listadoDePuntuaciones;
    private Horario[] horarios;
    private Pedido [] pedidos;
    private Pedido [] historicos;

    public Restaurante(String nombre, String dirección, String teléfono, String[] listaDecategorías, Plato[] listaDePlatos, boolean takeAway, boolean delivery, Puntuacion[] listadoDePuntuaciones, Horario[] horarios, Pedido[] pedidos, Pedido[] historicos) {
        this.id++;
        this.nombre = nombre;
        this.dirección = dirección;
        this.teléfono = teléfono;
        this.listaDecategorías = listaDecategorías;
        this.puntuacion =0;
        this.listaDePlatos = listaDePlatos;
        TakeAway = takeAway;// costo envio 0
        Delivery = delivery;//costo envio 100
        this.listadoDePuntuaciones = listadoDePuntuaciones;
        this.horarios = horarios;
        this.pedidos = new Pedido[100];
        this.historicos = new Pedido[100];
    }

    ///Getters-----------------------------------------------------------------------------------------------

    public static int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public String[] getListaDecategorías() {
        return listaDecategorías;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public Plato[] getListaDePlatos() {
        return listaDePlatos;
    }

    public boolean isTakeAway() {
        return TakeAway;
    }

    public boolean isDelivery() {
        return Delivery;
    }

    public Puntuacion[] getListadoDePuntuaciones() {
        return listadoDePuntuaciones;
    }

    public Horario[] getHorarios() {
        return horarios;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public Pedido[] getHistoricos() {
        return historicos;
    }

    ///Setters------------------------------------------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public void setListaDecategorías(String[] listaDecategorías) {
        this.listaDecategorías = listaDecategorías;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setListaDePlatos(Plato[] listaDePlatos) {
        this.listaDePlatos = listaDePlatos;
    }

    public void setTakeAway(boolean takeAway) {
        TakeAway = takeAway;
    }

    public void setDelivery(boolean delivery) {
        Delivery = delivery;
    }

    public void setListadoDePuntuaciones(Puntuacion[] listadoDePuntuaciones) {
        this.listadoDePuntuaciones = listadoDePuntuaciones;
    }

    public void setHorarios(Horario[] horarios) {
        this.horarios = horarios;
    }

    public void setPedidos(Pedido[] pedidos) {
        this.pedidos = pedidos;
    }

    public void setHistoricos(Pedido[] historicos) {
        this.historicos = historicos;
    }
}
