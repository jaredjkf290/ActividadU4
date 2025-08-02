package modelo;

public class Investigador {
    private int id;
    private String nombre;
    private String campoInvestigacion;

    public Investigador(int id, String nombre, String campoInvestigacion) {
        this.id = id;
        this.nombre = nombre;
        this.campoInvestigacion = campoInvestigacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCampoInvestigacion() {
        return campoInvestigacion;
    }

    @Override
    public String toString() {
        return "Investigador: " + nombre + " - Área: " + campoInvestigacion;
    }
}
