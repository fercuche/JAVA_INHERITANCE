
package herencia_2;


public class Main {

    
    public static void main(String[] args) {
        
         Lavadora lavadora = new Lavadora();
        System.out.println("Lavadora");
        lavadora.crearLavadora();
        System.out.println(lavadora);
        
        Televisor televisor=new Televisor();
        System.out.println("\nTelevisor");
        televisor.crearTelevisor();
        System.out.println(televisor);
    }
        
    
    
}
