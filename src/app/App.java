package app;

import java.util.Calendar;

public class App {
    private Restaurante []restaurantes;
    private Usuario []usuarios;

    public App(Restaurante[] restaurantes, Usuario[] usuarios) {
        this.restaurantes = restaurantes;
        this.usuarios = usuarios;
    }
    ///Getters-----------------------------------------------------------------------------------------------
    public Restaurante[] getRestaurantes() {
        return restaurantes;
    }

    public Usuario[] getUsuarios() {
        return usuarios;
    }
    ///Setters------------------------------------------------------------------------------------------------

    public void setRestaurantes(Restaurante[] restaurantes) {
        this.restaurantes = restaurantes;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }
    ///funciones de usuario
    public int registroUsuario(int valUsuario,String direccion,String id,String contrasena,String nombreyapellido,String telefono)
    {
        if(valUsuario<usuarios.length) {
            Usuario nuevo = new Usuario(id, direccion, contrasena, nombreyapellido, telefono, null);
            usuarios[valUsuario] = nuevo;
            return valUsuario+1;
        }else
        {
            return -1;
        }

    }
    ///funciones para hacer pedido

    public Restaurante devolverRestaurante(int idRestaurante)
    {
        return getRestaurantes()[idRestaurante];
    }

    public boolean validacionPlato(int idPlato,int idRestaurante)
    {
        boolean result = false;
        Restaurante restaurante = devolverRestaurante(idRestaurante);
        Plato plato = restaurante.getListaDePlatos()[idPlato];
        Calendar ahora= Calendar.getInstance();
        float minutos = ahora.get(Calendar.MINUTE) * (0.010f);
        float hora= ahora.get(Calendar.HOUR_OF_DAY);
        float horario = hora+ minutos;

        if(plato.hayStock()==true && restaurante.validarHorario(horario)==true)
        {
            result= true;
        }

        return result;

    }
    public boolean validacionHorario(int idRestaurante)
    {
        boolean result = false;
        Restaurante restaurante = devolverRestaurante(idRestaurante);
        Calendar ahora= Calendar.getInstance();
        float minutos = ahora.get(Calendar.MINUTE) * (0.010f);
        float hora= ahora.get(Calendar.HOUR_OF_DAY);
        float horario = hora+ minutos;

        if(restaurante.validarHorario(horario)==true)
        {
            result= true;
        }

        return result;

    }
    public Plato[]devolverPlatos(int idRestaurante)
    {
        Restaurante restaurante= devolverRestaurante(idRestaurante);

        return restaurante.getListaDePlatos();
    }
    //hacer pedido
    ///primero hago la validacion del horario y stock en el item y despues la hago para el pedido general
    public Pedido hacerPedido(int posRestaurante,Item listitem[])
    {
        Restaurante restaurante= devolverRestaurante(posRestaurante);
        if(validacionHorario(posRestaurante)) {
            return restaurante.hacerPedido(listitem);

        }else
        {
            return null;
        }
    }
    //para mostrar al restaurante------------------------------------------------------------------------------
    public  Restaurante[] restaurantesAbiertos()
    {
        Calendar ahora= Calendar.getInstance();
        float minutos = ahora.get(Calendar.MINUTE) * (0.010f);
        float hora= ahora.get(Calendar.HOUR_OF_DAY);
        float horario = hora+ minutos;
        Restaurante restaurante[]= new Restaurante[100];

        int a=0;
        for (int i = 0; i < getRestaurantes().length; i++) {

            if(getRestaurantes()[i]!=null)
            {
                if(getRestaurantes()[i].validarHorario(horario))
                {
                    restaurante[a]= getRestaurantes()[i];
                    a++;
                }
            }
        }
        return restaurante;
    }

    public  Horario[] devolverHorarios(int pos)
    {
        return restaurantes[pos].getHorarios();
    }

    public  String[] devolverCategorias(int pos)
    {
        return restaurantes[pos].getListaDecategorías();
    }


}
