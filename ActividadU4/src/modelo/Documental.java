package modelo;

public class Documental extends ContenidoAudiovisual {
    private String tema;

    public Documental(int id, String titulo, int duracionMinutos, String tema) {
        super(id, titulo, duracionMinutos);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public String getTipo() {
        return "Documental";
    }
}
