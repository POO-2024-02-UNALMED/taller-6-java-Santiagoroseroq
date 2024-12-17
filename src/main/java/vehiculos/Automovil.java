package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    // Constructor
    public Automovil(String placa, double precio, double peso, String nombre, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        incrementarContador("Automovil");  // Incrementar contador de automóviles
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
