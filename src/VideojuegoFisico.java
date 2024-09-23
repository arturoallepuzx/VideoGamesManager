public class VideojuegoFisico extends Videojuego {
    private final double shipping;

    public VideojuegoFisico(String titulo, String consola, double precioBase, String Genre, double shipping) {
        super(titulo, consola, precioBase, Genre);
        this.shipping = shipping;
    }

    public double calcularPrecioFinal() {
        double precioFinal = precioBase + shipping;
        return precioFinal;
    }
}
