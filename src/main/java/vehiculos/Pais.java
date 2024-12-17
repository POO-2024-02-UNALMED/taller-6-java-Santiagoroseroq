package vehiculos;

public class Pais {

    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Método estático para poder ser llamado desde los tests sin necesidad de instanciar un objeto
    public static Pais paisMasVendedor() {
        // Implementa la lógica que determine el país con más ventas
        return new Pais("Ecuador"); // Ejemplo, puedes cambiarlo por la lógica real
    }
}
