package co.edu.uniquindio.poo;

public class Proyecto {
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    private double costoTotal;
    private ParqueInfantil parqueInfantil; // Objeto de tipo ParqueInfantil

    // Constructor de la clase Proyecto
    public Proyecto(String nombre, double costoTotal) {
        this.nombre = nombre;
        this.costoTotal = costoTotal;
    }

    // Método para obtener el parque infantil asociado al proyecto
    public ParqueInfantil getParqueInfantil() {
        return parqueInfantil;
    }

    // Método para establecer un nuevo parque infantil asociado al proyecto
    public void setParqueInfantil(ParqueInfantil parqueInfantil) {
        this.parqueInfantil = parqueInfantil;
    }

}
