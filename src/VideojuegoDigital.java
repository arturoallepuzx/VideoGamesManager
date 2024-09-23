public class VideojuegoDigital extends Videojuego {
   private double descuento;

    public VideojuegoDigital(String titulo, String consola, double precioBase, String Genre, double descuento) {
        super(titulo, consola, precioBase, Genre);
        this.descuento = descuento;
    }

    public double calcularPrecioFinal() {

        double precioFinal = precioBase - descuento;
        return precioFinal;
    }
}

