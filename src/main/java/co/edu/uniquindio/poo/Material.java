package co.edu.uniquindio.poo;

public enum Material {
    ARENA(10000),
    GRAMA_SINTETICA(35000),
    GRAMA_NATURAL(20000),
    ASFALTO(40000);

    // Atributo para el costo por metro cuadrado
    private final int costoPorMetroCuadrado;

    // Constructor privado para asignar el costo por metro cuadrado a cada material
    private Material(int costoPorMetroCuadrado) {
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
    }

    // Método para obtener el costo por metro cuadrado de un material
    public int getCostoPorMetroCuadrado() {
        return costoPorMetroCuadrado;
    }
}