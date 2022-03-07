
package herencia_3;

public class Televisor extends Electrodomestico{
    
    private Integer resolucion;
    private boolean tdt;

    public Televisor() {
        super();
    }

    public Televisor(Integer resolucion, boolean tdt, Double precio, String color, char consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void crearTelevisor() {
        String opcion="";
        crearElectrodomestico();
        System.out.println("Ingrese resolucion del televisor en pulgadas");
        this.resolucion = read.nextInt();
        System.out.println("Posee TDT? S/N");
        opcion = read.next();
        if (opcion.equalsIgnoreCase("S")){
            this.tdt = true;
        }
        precioFinal();

    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion>40) {
            this.precio=this.precio*1.3;
        }
        if (tdt) {
            this.precio+=500;
        }
    }

    @Override
    public String toString() {
        return "Televisor:" +super.toString() + "\nresolucion = " + resolucion + " pulgadas\ntdt = " + tdt + "\n}";
    }
    
    
    
}
