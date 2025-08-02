package modelo;

public abstract class ContenidoAudiovisual {
    protected int id;
    protected String titulo;
    protected int duracionMinutos;

    public ContenidoAudiovisual(int id, String titulo, int duracionMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return getTipo() + ": " + titulo + " (" + duracionMinutos + " min)";
    }
}
