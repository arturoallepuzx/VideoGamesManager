import java.util.Objects;

public abstract class Videojuego {
    protected String titulo;
    protected String consola;
    protected double precioBase;
    protected String Genre;

    public Videojuego(String titulo, String consola, double precioBase, String Genre) {
        this.titulo = titulo;
        this.consola = consola;
        this.precioBase = precioBase;
        this.Genre = Genre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getConsola() {
        return consola;
    }
    public void setConsola(String consola) {
        this.consola = consola;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public String getGenre() {
        return Genre;
    }
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Double.compare(precioBase, that.precioBase) == 0 && Objects.equals(titulo, that.titulo) && Objects.equals(consola, that.consola) && Objects.equals(Genre, that.Genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, consola, precioBase, Genre);
    }
}

