package colores;

public enum Color {
    AMARILLO("#FFFF00"), AZUL("#0000FF"), NARANJA("FF8C00"), ROJO("#FF0000"), VERDE("#00FF00"), VIOLETA("8A2BE2"),
    NEGRO("#000000"), BLANCO("#FFFFFF"), GRIS("#808080");

    private String codigoHexa;

    private Color(String codigoHexa) {
        this.codigoHexa = codigoHexa;
    }

    public String getCodigoHexa() {
        return codigoHexa;
    }
}