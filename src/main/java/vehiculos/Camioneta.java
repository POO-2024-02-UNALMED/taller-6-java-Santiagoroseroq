package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;

    // Constructor actualizado para coincidir con el test
    public Camioneta(String placa, int numPuertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        // Llamada al constructor de la clase base Vehiculo con los parámetros adecuados
        super(placa, numPuertas, peso, nombre, precio, fabricante, "4X4");
        this.volco = volco;
    }

    // Getter y Setter
    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
