package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean cuatroXCuatro;  // Cambié el nombre de la variable para evitar el problema con el "4"

    // Constructor
    public Camioneta(String placa, int puertas, String marca, double precio, double peso, Fabricante fabricante, boolean cuatroXCuatro) {
        // Llamamos al constructor de Vehiculo
        super(placa, puertas, 100, marca, precio, peso, "4x4", fabricante);  // "4x4" es un valor predeterminado para la tracción
        this.cuatroXCuatro = cuatroXCuatro;  // Inicializamos la variable
    }

    // Getter y Setter para 'cuatroXCuatro'
    public boolean isCuatroXCuatro() {
        return cuatroXCuatro;
    }

    public void setCuatroXCuatro(boolean cuatroXCuatro) {
        this.cuatroXCuatro = cuatroXCuatro;
    }
}
