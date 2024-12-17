package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;

    // Constructor ajustado para llamar al constructor de Vehiculo
    public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) {
        // Llamar al constructor de Vehiculo con los parámetros adecuados
        super(placa, 2, 100, nombre, precio, peso, "RWD", fabricante);  // "RWD" es un valor de tracción predeterminado
        this.ejes = ejes;
    }

    // Getter y Setter para 'ejes'
    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
}
