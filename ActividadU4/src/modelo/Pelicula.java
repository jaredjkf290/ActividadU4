package modelo;

public class Pelicula extends ContenidoAudiovisual {
    private String productora;

    public Pelicula(int id, String titulo, int duracionMinutos, String productora) {
        super(id, titulo, duracionMinutos);
        this.productora = productora;
    }

    public String getProductora() {
        return productora;
    }

    @Override
    public String getTipo() {
        return "Película";
    }
}
