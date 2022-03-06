/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package herencia_1;


public class Main {

   
    public static void main(String[] args) {
        
        Animal perro = new Perro("Puflito", "carne", 4, "Chihuahua");
        perro.alimentarse();
        
        Perro perro2 = new Perro ("Sam", "alimento", 10, "Doberman");
        perro2.alimentarse();
        
        Animal gato = new Gato("Gorda", "atún", 3, "Tricolor");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Tronquito", "alfalfa", 5, "Alazán");
        caballo.alimentarse();
    }
    
}
