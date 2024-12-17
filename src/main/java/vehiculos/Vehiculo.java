package vehiculos;

public class Vehiculo {
    private String placa;
    private int numPuertas;
    private double peso;
    private String nombre;
    private int precio;
    private Fabricante fabricante;
    
    // Constructor de Vehiculo con los parámetros correctos
    public Vehiculo(String placa, int numPuertas, double peso, String nombre, int precio, Fabricante fabricante) {
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.peso = peso;
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    // Getters y setters (si es necesario)
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
