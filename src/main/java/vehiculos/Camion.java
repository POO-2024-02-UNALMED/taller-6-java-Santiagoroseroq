package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;

    // Constructor
    public Camion(String placa, double precio, double peso, String nombre, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        incrementarContador("Camion");  // Incrementar contador de camiones
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}
