package modelopersistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerarArchivosCSV {

    public static void main(String[] args) {
        crearCarpetaData();
        crearPeliculas();
        crearSeries();
        crearDocumentales();
        System.out.println("Archivos CSV generados correctamente en la carpeta data/");
    }

    private static void crearCarpetaData() {
        File carpeta = new File("data");
        if (!carpeta.exists()) {
            carpeta.mkdir();
        }
    }

    private static void crearPeliculas() {
        String ruta = "data/peliculas.csv";
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            pw.println("1,Matrix,136,Warner Bros");
            pw.println("2,Inception,148,Legendary Pictures");
            pw.println("3,Interstellar,169,Paramount Pictures");
            pw.println("4,Avatar,162,20th Century Fox");
            pw.println("5,The Dark Knight,152,Warner Bros");
        } catch (IOException e) {
            System.err.println("Error creando peliculas.csv: " + e.getMessage());
        }
    }

    private static void crearSeries() {
        String ruta = "data/series.csv";
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            pw.println("1,Breaking Bad,50,5");
            pw.println("2,Stranger Things,45,4");
            pw.println("3,Game of Thrones,55,8");
            pw.println("4,The Office,22,9");
            pw.println("5,Friends,22,10");
        } catch (IOException e) {
            System.err.println("Error creando series.csv: " + e.getMessage());
        }
    }

    private static void crearDocumentales() {
        String ruta = "data/documentales.csv";
        try (PrintWriter pw = new PrintWriter(new FileWriter(ruta))) {
            pw.println("1,Our Planet,60,Naturaleza");
            pw.println("2,The Last Dance,55,Deporte");
            pw.println("3,Cosmos,45,Ciencia");
            pw.println("4,Inside Job,85,Economía");
            pw.println("5,Blackfish,83,Animales");
        } catch (IOException e) {
            System.err.println("Error creando documentales.csv: " + e.getMessage());
        }
    }
}
