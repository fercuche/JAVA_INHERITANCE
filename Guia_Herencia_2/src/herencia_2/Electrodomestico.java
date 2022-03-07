
package herencia_2;

import java.util.Locale;
import java.util.Scanner;


public class Electrodomestico {
    
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    protected Double precio;
    protected String color;
    protected char consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.*/
    public void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        
        if (letra < 65 || letra > 70) {
            this.consumo = 'F';
        }else{
            this.consumo=Character.toUpperCase(letra);
        }
    }

    /*Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.*/

    public void comprobarColor(String color) {
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")) {
            this.color = "blanco";
        }
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.*/

    public void crearElectrodomestico() {
        this.precio = 1000.00;
        System.out.println("Ingrese Color del electrodomestico");
        this.color = read.next();
        comprobarColor(this.color);
        System.out.println("Ingrese consumo energetico ");
        this.consumo = read.next().charAt(0);
        comprobarConsumoEnergetico(this.consumo);
        System.out.println("Ingrese peso del armatoste");
        this.peso = read.nextDouble();
       
    }

    public void precioFinal() {
        switch (this.consumo) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;

        }
        if (this.precio>=1 && this.peso<=19) {
            this.precio+=100;
        }else if(this.precio>20 && this.peso<=49){
            this.precio+=500;
        }else if(this.precio>50 && this.peso<=79){
            this.precio+=800;
        }else{
            this.precio+=1000;
        }

    }

    @Override
    public String toString() {
        return "\nprecio = $" + precio + "\ncolor = " + color + "\nconsumo = " + consumo + "\npeso = " + peso +"kg";
    }
}
