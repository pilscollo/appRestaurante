package app;

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
}
