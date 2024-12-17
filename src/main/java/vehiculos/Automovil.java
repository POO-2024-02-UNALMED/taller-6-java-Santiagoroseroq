package vehiculos;

public class Automovil extends Vehiculo {
    private int numAsientos;

    // Constructor con los parámetros adecuados
    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int numAsientos) {
        super(placa, 4, 180, nombre, precio, peso, "RWD", fabricante);  // Llamada al constructor de la clase padre Vehiculo
        this.numAsientos = numAsientos;
    }

    // Getter y setter para 'numAsientos'
    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
}
