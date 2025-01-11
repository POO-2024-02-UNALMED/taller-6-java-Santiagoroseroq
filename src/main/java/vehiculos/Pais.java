package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private static List<Pais> paises = new ArrayList<>();

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        Pais paisMasVendedor = null;
        int maxVentas = 0;

        for (Pais pais : paises) {
            int ventas = 0;
            for (Fabricante fabricante : Fabricante.getFabricantes()) {
                if (fabricante.getPais().equals(pais)) {
                    for (Vehiculo vehiculo : Fabricante.getVehiculos()) {
                        if (vehiculo.getFabricante().equals(fabricante)) {
                            ventas++;
                        }
                    }
                }
            }

            if (ventas > maxVentas) {
                maxVentas = ventas;
                paisMasVendedor = pais;
            }
        }

        return paisMasVendedor;
    }

    public static List<Pais> getPaises() {
        return paises;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}