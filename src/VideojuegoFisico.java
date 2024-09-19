public class VideojuegoFisico extends Videojuego {
    public VideojuegoFisico(String titulo, String consola,double precioBase, double envio) {
        super(titulo, consola, precioBase,envio);
    }
    public double calcularPrecioFinal() {
        double precioFinal = precioBase + envio;
        return precioFinal;
    }
}
