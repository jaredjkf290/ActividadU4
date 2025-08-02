package modelo;

public class SerieTV extends ContenidoAudiovisual {
    private int temporadas;

    public SerieTV(int id, String titulo, int duracionMinutos, int temporadas) {
        super(id, titulo, duracionMinutos);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    @Override
    public String getTipo() {
        return "Serie de TV";
    }
}
