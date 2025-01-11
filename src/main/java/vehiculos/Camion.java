package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;

    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        Vehiculo.incrementarCantidad("Camion");
        System.out.println("Creando camión: " + this);
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "placa='" + getPlaca() + '\'' +
                ", ejes=" + ejes +
                '}';
    }
}