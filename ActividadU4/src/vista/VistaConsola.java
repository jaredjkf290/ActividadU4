package vista;

import controlador.ControladorContenido;
import modelo.*;

import java.util.Scanner;

public class VistaConsola {
    private ControladorContenido controlador;
    private Scanner scanner;

    public VistaConsola(ControladorContenido controlador) {
        this.controlador = controlador;
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Listar películas");
            System.out.println("2. Listar series");
            System.out.println("3. Listar documentales");
            System.out.println("4. Agregar película");
            System.out.println("5. Agregar serie");
            System.out.println("6. Agregar documental");
            System.out.println("7. Guardar todos los datos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> listarPeliculas();
                case 2 -> listarSeries();
                case 3 -> listarDocumentales();
                case 4 -> agregarPelicula();
                case 5 -> agregarSerie();
                case 6 -> agregarDocumental();
                case 7 -> guardarTodo();
                case 0 -> System.out.println("Saliendo del sistema.");
                default -> System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 0);
    }

    private void listarPeliculas() {
        System.out.println("\n--- PELÍCULAS ---");
        for (Pelicula p : controlador.getPeliculas()) {
            System.out.println(p);
        }
    }

    private void listarSeries() {
        System.out.println("\n--- SERIES DE TV ---");
        for (SerieTV s : controlador.getSeries()) {
            System.out.println(s);
        }
    }

    private void listarDocumentales() {
        System.out.println("\n--- DOCUMENTALES ---");
        for (Documental d : controlador.getDocumentales()) {
            System.out.println(d);
        }
    }

    private void agregarPelicula() {
        System.out.println("\nAgregar nueva película:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = scanner.nextInt(); scanner.nextLine();
        System.out.print("Productora: ");
        String productora = scanner.nextLine();

        int nuevoId = controlador.getPeliculas().size() + 1;
        Pelicula nueva = new Pelicula(nuevoId, titulo, duracion, productora);
        controlador.agregarPelicula(nueva);
        System.out.println("Película agregada.");
    }

    private void agregarSerie() {
        System.out.println("\nAgregar nueva serie:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Duración por episodio (minutos): ");
        int duracion = scanner.nextInt();
        System.out.print("Número de temporadas: ");
        int temporadas = scanner.nextInt(); scanner.nextLine();

        int nuevoId = controlador.getSeries().size() + 1;
        SerieTV nueva = new SerieTV(nuevoId, titulo, duracion, temporadas);
        controlador.agregarSerie(nueva);
        System.out.println("Serie agregada.");
    }

    private void agregarDocumental() {
        System.out.println("\nAgregar nuevo documental:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Duración (minutos): ");
        int duracion = scanner.nextInt(); scanner.nextLine();
        System.out.print("Tema: ");
        String tema = scanner.nextLine();

        int nuevoId = controlador.getDocumentales().size() + 1;
        Documental nuevo = new Documental(nuevoId, titulo, duracion, tema);
        controlador.agregarDocumental(nuevo);
        System.out.println("Documental agregado.");
    }

    private void guardarTodo() {
        controlador.guardarDatos();
        System.out.println("Todos los datos han sido guardados en los archivos CSV.");
    }
}
