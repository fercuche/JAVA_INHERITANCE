package herencia_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* Lavadora lavadora = new Lavadora();
        System.out.println("Lavadora");
        lavadora.crearLavadora();
        System.out.println(lavadora);
        
        Televisor televisor=new Televisor();
        System.out.println("\nTelevisor");
        televisor.crearTelevisor();
        System.out.println(televisor);*/
        
        Double precioTotal= 0D;
        
        ArrayList<Electrodomestico> ed = new ArrayList<>();

        Lavadora lavadora1 = new Lavadora(1000D, "rojo", 'F', 90D, 30);
        Lavadora lavadora2 = new Lavadora(1000D, "azul", 'F', 90D, 40);
        Televisor tv1 = new Televisor(40, true, 1000D, "blanco", 'A', 10D);
        Televisor tv2 = new Televisor(30, false, 1000D, "negro", 'A', 10D);
        ed.add(lavadora1);
        ed.add(lavadora2);
        ed.add(tv1);
        ed.add(tv2);

        for (Electrodomestico electro : ed) {
            electro.precioFinal();
            System.out.println("El precio de " + electro.getClass().getSimpleName() + " es $" + electro.precio);
            precioTotal += electro.precio;
        }
        System.out.println("El precio total de los eletrodomésticos es: $"+precioTotal);
        
        

    }

}
