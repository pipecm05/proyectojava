package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica {

    private final double radio;

    public Circulo(double radio) {
        assert radio > 0.0;

        this.radio = radio;
    }

    /**
     * Método para obtener el valor del radio del círculo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método para calcular el área del círculo usando el radio definido
     */
    public double calcularArea() {
        System.out.println(Math.PI * radio * radio);
        return Math.PI * radio * radio;
    }

}
