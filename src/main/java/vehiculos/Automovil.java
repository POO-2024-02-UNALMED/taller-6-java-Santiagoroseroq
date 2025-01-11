package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "Tracción delantera", fabricante);
        this.puestos = puestos;
        Vehiculo.incrementarCantidad("Automovil");
    }

    public Automovil(String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, int puestos) {
        super(placa, puertas, 100, nombre, precio, peso, "Tracción delantera", fabricante);
        this.puestos = puestos;
        Vehiculo.incrementarCantidad("Automovil");
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}