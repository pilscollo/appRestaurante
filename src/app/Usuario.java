package app;

public class Usuario {
    private String direccion;
    private String id;
    private String contrasena;
    private String nombreyapellido;
    private String teléfono;
    private Pedido []listaDePedidos;
    private boolean activo;

    public Usuario(String mail,String direccion, String contrasena, String nombreyapellido, String teléfono, Pedido[] listaDePedidos) {
        this.direccion = direccion;
        this.contrasena = contrasena;
        this.nombreyapellido = nombreyapellido;
        this.teléfono = teléfono;
        this.listaDePedidos = listaDePedidos;
        this.activo =true;
        this.id=mail;
    }
    ///Getters-----------------------------------------------------------------------------------------------

    public String getDireccion() {
        return direccion;
    }

    public String getId() {
        return id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public String getTeléfono() {
        return teléfono;
    }

    public Pedido[] getListaDePedidos() {
        return listaDePedidos;
    }

    public boolean isActivo() {
        return activo;
    }

    ///Setters------------------------------------------------------------------------------------------------

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public void setTeléfono(String teléfono) {
        this.teléfono = teléfono;
    }

    public void setListaDePedidos(Pedido[] listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
