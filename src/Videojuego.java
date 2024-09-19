import java.util.Objects;

public abstract class Videojuego {
    public String titulo;
    public String consola;
    public double precioBase;
    public double envio;
    public String Genre;

    public Videojuego(String titulo, String consola, double precioBase, double envio, String Genre) {
        this.titulo = titulo;
        this.consola = consola;
        this.precioBase = precioBase;
        this.envio = envio;
        this.Genre = Genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Double.compare(precioBase, that.precioBase) == 0 && Double.compare(envio, that.envio) == 0 && Objects.equals(titulo, that.titulo) && Objects.equals(consola, that.consola) && Objects.equals(Genre, that.Genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, consola, precioBase, envio, Genre);
    }
}

