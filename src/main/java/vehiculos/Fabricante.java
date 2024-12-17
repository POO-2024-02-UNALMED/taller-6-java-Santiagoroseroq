package vehiculos;

public class Fabricante {
    private String nombre;
    private Pais pais;

    // Constructor
    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    // Método estático para obtener el fabricante con más ventas
    public static Fabricante fabricaMayorVentas() {
        // Implementa la lógica para determinar el fabricante con mayores ventas
        // Este es solo un ejemplo con un fabricante de nombre "Renault" y país "Ecuador"
        return new Fabricante("Renault", new Pais("Ecuador"));
    }
}
