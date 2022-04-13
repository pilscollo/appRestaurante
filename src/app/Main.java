package app;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        ///punteacion
        sc= new Scanner(System.in);
        Puntuacion putuancion1= new Puntuacion(10,"Pedro Rodriguez","muy bueno");
        Puntuacion puntuacion2= new  Puntuacion(5,"Juan Rodriguez","no muy bueno");
        Puntuacion putuancion3= new Puntuacion(6,"Pablo sinhueso","regular");
        Puntuacion puntuacion4= new  Puntuacion(4,"Juan miguel","no muy bueno");


        Puntuacion []puntuaciones1={putuancion1,puntuacion2};
        Puntuacion []puntuaciones2={putuancion3,puntuacion4};
        ///categorias
        String []categoria1={"carne","pastas","pizza"};
        String []categoria2={"pastas","postres","dulces"};

        ///platos:
        Plato plato1= new Plato("Pastas con tuco",1700.00f,2,20,100,categoria1);
        Plato plato2= new Plato("Pollo",3000.00f,1,30,100,categoria1);
        Plato plato3= new Plato("ChocoTorta",500.00f,2,10,50,categoria2);
        Plato plato4= new Plato("Facturas",30.00f,2,100,100,categoria2);

        Plato []platos1= {plato1,plato2};
        Plato []platos2= {plato3,plato4};

        /// horarios
        Horario horario1= new Horario(9,13);
        Horario horario2= new Horario(15,23);
        Horario horario3= new Horario(8,12);
        Horario horario4= new Horario(13,18);

        Horario []horarios1= {horario1,horario2};
        Horario []horarios2= {horario3,horario4};
        ///harcodeo de restaurante
        Restaurante restaurante1 = new Restaurante("MacDonals","San lorenzo 333","45679088",categoria1,platos1,true,true,puntuaciones1,horarios1,null,null);
        Restaurante restaurante2 = new Restaurante("rincon durce","san luis 222","458979088",categoria2,platos2,true,false,puntuaciones2,horarios2,null,null);
        Restaurante []listaRestaurante = {restaurante1,restaurante2};
        /// usuarios
        Pedido []lista= new Pedido[50];
        Usuario usuario1 = new Usuario("maria@gmail.com","san luis 333","1234","maria rodriguez","23453464",lista);
        Usuario []listaUsuarios={usuario1};
        int valUsuarios=1;
        int valRestaurantes=2;
        App app= new App(listaRestaurante,listaUsuarios);

        Calendar ahora= Calendar.getInstance();
        float minutos = ahora.get(Calendar.MINUTE) * (0.010f);
        float hora= ahora.get(Calendar.HOUR_OF_DAY);
        float horario = hora+ minutos;
        System.out.println(horario);
        mostrarRestaurantes(app);

    }
    // MOSTRAR------------------------------------------------------------------------------------------------
    public static int mostrarPlatos(App app,int posRestaurante)
    {
        Plato platos[]=app.devolverPlatos(posRestaurante);
        Restaurante restaurante= app.devolverRestaurante(posRestaurante);
        int val=0;
        for (int i = 0; i <platos.length ; i++) {

            if(platos[i]!=null)
            {
                System.out.println("------------------------------");
                System.out.println("posicion: "+ i);
                System.out.println("nombre: "+ platos[i].getNombre() );
                System.out.println("tiempo demora: "+platos[i].getTiempoDemora());
                System.out.println("Restaurante: "+restaurante.getNombre());
                System.out.println("------------------------------");
            }
        }
        return val;
    }

    public static void mostrarStrings(String arreglo[])
    {
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]!=null)
            {
                System.out.println(i+". "+arreglo[i]);
            }
        }
    }
    public static void mostrarHorarios(Horario horarios[])
    {
        for (int i = 0; i <horarios.length; i++){

            System.out.println("*******************************");
            System.out.println("Horario "+(i+1)+": "+horarios[i].getHoraInicio()+"-"+horarios[i].getHoraFin());
            System.out.println("*******************************");

        }
    }
    public static int mostrarRestaurantes(App app)
    {
        Restaurante restaurantes[]= app.restaurantesAbiertos();
        int val=0;
        for (int i = 0; i<restaurantes.length; i++) {

            if(restaurantes[i]!=null)
            {
                System.out.println("------------------------------");
                System.out.println("posición: "+ i);
                System.out.println("nombre: "+  restaurantes[i].getNombre());
                System.out.println("puntuacion: "+ restaurantes[i].calcularPuntuacion());
                mostrarStrings(app.devolverCategorias(i));
                mostrarHorarios(app.devolverHorarios(i));
                System.out.println("------------------------------");
                val++;

            }

        }
        return val;

    }
    //para hacer el pedido------------------------------------------------------------------------------------------------

    public static void elegirRestaurante(App app) {
        int op = -1;
        int val = 0;
        while (op < 0)
        {
            val = mostrarRestaurantes(app);
            System.out.println(val + ". SALIR");
            op = sc.nextInt();
            if (op != val && op >= 0) {
                ///elegirplatos
            }else if(op<0)
            {
                System.out.println("Opcion invalida");
            }
        }
    }

    public  static void elegirPlato(int posRestaurante, App app)
    {
        int op = -1;
        int val = 0;
        while (op < 0)
        {
            val = mostrarPlatos(app,posRestaurante);
            System.out.println(val + ". SALIR");
            op = sc.nextInt();
            if (op != val && op >= 0) {

                // lo puedo hacer recursivo?
            }else if(op<0)
            {
                System.out.println("Opcion invalida");
            }
        }
    }



}
