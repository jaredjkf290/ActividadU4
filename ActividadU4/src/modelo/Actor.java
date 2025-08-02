package modelo;

public class Actor {
    private int id;
    private String nombre;
    private int edad;

    public Actor(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Actor: " + nombre + " (" + edad + " años)";
    }
}
