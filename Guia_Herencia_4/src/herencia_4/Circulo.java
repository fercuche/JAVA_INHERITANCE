/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_4;

/**
 *
 * @author Ferchu
 */
public class Circulo implements CalculosFormas {
    
    private Float radio;

    public Circulo() {
    }

    public Circulo(Float radio) {
        this.radio = radio;
    }

    @Override
    public Float calcularArea() {
        return PI*radio*radio;
    }

    @Override
    public Float calcularPerimetro() {
        return 2*PI*radio;
    }

    @Override
    public String toString() {
        return "Área del círculo: " + this.calcularArea() +"\nPerímetro del círculo: "+this.calcularPerimetro();
    }
    
    
    
    
    
}
