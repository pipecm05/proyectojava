package co.edu.uniquindio.poo;

public enum Municipio {
    ARMENIA(0),
    CALARCA(10000),
    MONTENEGRO(20000),
    QUIMBAYA(30000),
    TEBAIDA(15000),
    CIRCASIA(18000),
    FILANDIA(22000),
    GÉNOVA(10000),
    SALENTO(50000),
    PIJAO(40000),
    CORDOBA(30000),
    BUENAVISTA(35000);

    private final int sobrecosto;

    // Constructor privado para asignar el sobrecosto a cada municipio
    private Municipio(int sobrecosto) {
        this.sobrecosto = sobrecosto;
    }

    // Método para obtener el sobrecosto de un municipio
    public int getSobrecosto() {
        return sobrecosto;
    }
}
