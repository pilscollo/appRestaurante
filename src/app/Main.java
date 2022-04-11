package app;

import java.time.LocalDate;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        ///punteacion
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
        Horario horario2= new Horario(15,20);
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
    }
}
