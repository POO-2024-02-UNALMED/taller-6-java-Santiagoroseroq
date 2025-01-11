package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static List<Vehiculo> vehiculos = new ArrayList<>();
    private static List<Fabricante> fabricantes = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this); // Agregar el fabricante a la lista
    }

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

    public static void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante fabricanteMayorVentas = null;
        int maxVentas = 0;

        for (Fabricante fabricante : fabricantes) {
            int ventas = 0;
            for (Vehiculo vehiculo : vehiculos) {
                if (vehiculo.getFabricante().equals(fabricante)) {
                    ventas++;
                }
            }

            if (ventas > maxVentas) {
                maxVentas = ventas;
                fabricanteMayorVentas = fabricante;
            } else if (ventas == maxVentas) {
                // Si hay más de un fabricante con la misma cantidad de ventas,
                // devolver el primero que se encuentre
                return fabricante;
            }
        }

        return fabricanteMayorVentas;
    }

    public static List<Fabricante> getFabricantes() {
        return fabricantes;
    }

    public static List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Fabricante{" +
                "nombre='" + nombre + '\'' +
                ", pais=" + pais +
                '}';
    }
}