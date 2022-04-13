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
    ///----------------------------------------------------------------------------------------------------------
    /** funciones restaurante
     * calcular puntuacion con puntuaciones x
     * Hacer pedido x
     * horario valido (con horario pasado por parametro)
     * pasar de pedido a historico x
     * generar item x
     * agregar a lista de item x
     * agregar puntuacion x
     */
    //---------------puntuaciones------------------------------------------------------------------------------
    public float calcularPuntuacion()
    {
        //se tiene que usar cada vez que se agrega una puntuacion
        int rta=0;
        int val=0;
        for (int i = 0; i <listadoDePuntuaciones.length ; i++) {
            if(listadoDePuntuaciones[i].getValor()!=0)
            {
                val++;
                rta= rta+listadoDePuntuaciones[i].getValor();
            }
        }
        setPuntuacion((float)rta/(float) val);
        return  getPuntuacion();
    }
    private int validosPuntuaciones()
    {
        int val = 0;

        for (int i = 0; i < getListadoDePuntuaciones().length; i++) {
           if(getListadoDePuntuaciones()[i]!=null)
           {
               val++;
           }
        }
        return val;
    }

    public void agregarPuntuacion(int valor, String nombre,String comentario)
    {
        int val= validosPuntuaciones();
        Puntuacion puntuacion= new Puntuacion(valor,nombre,comentario);
        Puntuacion listado[]= getListadoDePuntuaciones();
        listado[val]= puntuacion;
        setListadoDePuntuaciones(listado);
    }
    //---------------Item-------------------------------------------------------------------------------------
    public  Item generarItem(Plato plato,int cant)
    {
        Item item= new Item(plato.getId(),cant,(plato.getPrecio()*cant));
        return item;
    }

    public int validosItem(Item listaItem[])
    {
        int val = 0;

        for (int i = 0; i < listaItem.length; i++) {
            if(listaItem[i]!=null)
            {
                val++;
            }
        }
        return val;
    }
    public Item[] agregarAlistaItem(Item listaItem[],Plato plato,int cant)
    {
        int val= validosItem(listaItem);
        listaItem[val]= generarItem(plato,cant);
        return listaItem;
    }
    ///esta bien que esto este aca?
    ///----------hacer pedido-----------------------------------------------------------------------------------

    private int validosPedidos()
    {
        int val=0;

        for (int i = 0; i < getPedidos().length; i++) {
            if(getPedidos()[i]!=null)
            {
                val++;
            }
        }
        return val;
    }

    private void agregarPedidoALista(Pedido pedido)
    {
        int val= validosPedidos();
        Pedido listaPedidos[]= getPedidos();
        listaPedidos[val]= pedido;
        setPedidos(listaPedidos);

    }

    public Pedido hacerPedido(Item listaItem[])
    {

        int costoEnvio=0;
        int estadoPedido=0;

        if(isDelivery()==true)
        {
            costoEnvio=100;
            estadoPedido=1;
        }
        Pedido pedido= new Pedido(costoEnvio,getId(),estadoPedido,listaItem);


        pedido.calcularPrecioTotal();
        agregarPedidoALista(pedido);
        return pedido;

    }
    // cuando el pedido cambia de estado al ultimo estado tengo que pasar el pedido de pedidos a historico
    private int validosHistorico()
    {
        int val=0;

        for (int i = 0; i < getHistoricos().length; i++) {
            if(getHistoricos()[i]!=null)
            {
                val++;
            }
        }
        return val;
    }

    public void pasarDePedidoAhistorico(int posPedido)
    {
        int valHistorico= validosHistorico();
        this.historicos[valHistorico]= this.pedidos[posPedido];
        this.pedidos[posPedido]=null;
    }
    //------validacion del horario-----------------------------------------------------------------------------
    public boolean validarHorario(float horario)
    {
        boolean rta= false;

        for (int i = 0; i < getHorarios().length; i++) {
            if(getHorarios()[i]!=null)
            {

                if(getHorarios()[i].getHoraInicio()<=horario && getHorarios()[i].getHoraFin()>=horario)
                {
                    rta= true;
                }
            }
        }

        return rta;
    }






}
