package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class ParqueInfantil {

    private final String nombre;
    private final String descripcion;
    private final Municipio municipio;
    public Municipio getMunicipio() {
        return municipio;
    }

    private final Collection<ZonaParque> zonas;

    public Collection<ZonaParque> getZonas() {
        return zonas;
    }

    public ParqueInfantil(String nombre, String descripcion, Municipio municipio) {
        assert nombre != null;
        assert !nombre.isBlank();
        assert descripcion != null;
        assert !descripcion.isBlank();

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;

        this.zonas = new LinkedList<>();
    }

    /**
     * Método para obtener el nombre del parque infantil
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la descripción del parque infantil
     */
    public String getDescripcion() {
        return descripcion;
    }
}