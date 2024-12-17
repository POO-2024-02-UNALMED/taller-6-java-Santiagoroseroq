package vehiculos;

public class Vehiculo {

    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String marca;
    private double precio;
    private double peso;
    protected String traccion;
    private Fabricante fabricante;

    private static int cantidadVehiculos = 0;
    private static int cantidadAutomoviles = 0;
    private static int cantidadCamionetas = 0;
    private static int cantidadCamiones = 0;

    // Constructor
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String marca, double precio, double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.marca = marca;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;

        cantidadVehiculos++;  // Incrementa el total de vehículos
    }


    // Método para contar vehículos por tipo
    public static String vehiculosPorTipo() {
        return "Automoviles: " + cantidadAutomoviles + "\n" +
               "Camionetas: " + cantidadCamionetas + "\n" +
               "Camiones: " + cantidadCamiones;
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    // Método añadido para cumplir con los tests
    public String getNombre() {
        return marca;  // Devuelve la marca como 'nombre'
    }

    // Métodos adicionales
    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidad) {
        cantidadVehiculos = cantidad;
    }
}
