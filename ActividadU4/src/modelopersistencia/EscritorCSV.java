package modelopersistencia;

import modelo.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class EscritorCSV {

    private static String construirRuta(String archivo) {
        return System.getProperty("user.dir") + File.separator + "data" + File.separator + archivo;
    }

    public static void guardarPeliculas(List<Pelicula> peliculas) {
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(construirRuta("peliculas.csv")), StandardCharsets.UTF_8))) {

            for (Pelicula p : peliculas) {
                pw.println(p.getId() + "," + p.getTitulo() + "," + p.getDuracionMinutos() + "," + p.getProductora());
            }
        } catch (IOException e) {
            System.err.println("Error guardando películas: " + e.getMessage());
        }
    }

    public static void guardarSeries(List<SerieTV> series) {
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(construirRuta("series.csv")), StandardCharsets.UTF_8))) {

            for (SerieTV s : series) {
                pw.println(s.getId() + "," + s.getTitulo() + "," + s.getDuracionMinutos() + "," + s.getTemporadas());
            }
        } catch (IOException e) {
            System.err.println("Error guardando series: " + e.getMessage());
        }
    }

    public static void guardarDocumentales(List<Documental> documentales) {
        try (PrintWriter pw = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(construirRuta("documentales.csv")), StandardCharsets.UTF_8))) {

            for (Documental d : documentales) {
                pw.println(d.getId() + "," + d.getTitulo() + "," + d.getDuracionMinutos() + "," + d.getTema());
            }
        } catch (IOException e) {
            System.err.println("Error guardando documentales: " + e.getMessage());
        }
    }
}
