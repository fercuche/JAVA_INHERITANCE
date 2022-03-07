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
public class Rectangulo implements CalculosFormas {
    
    private Float base;
    
    private Float altura;

    public Rectangulo() {
    }
    
    public Rectangulo(Float base, Float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    @Override
    public Float calcularArea() {
        return base*altura;
    }

    @Override
    public Float calcularPerimetro() {
        return (base+altura)*2;
    }

    @Override
    public String toString() {
        return "Área del rectángulo: " + this.calcularArea() +"\nPerímetro del rectángulo: "+this.calcularPerimetro();
    }
    
    
}
