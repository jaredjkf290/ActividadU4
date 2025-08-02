package modelopersistencia;

import modelo.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class LectorCSV {

    private static String construirRuta(String archivo) {
        return System.getProperty("user.dir") + File.separator + "data" + File.separator + archivo;
    }

    public static List<Pelicula> leerPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(construirRuta("peliculas.csv")), StandardCharsets.UTF_8))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String titulo = partes[1];
                    int duracion = Integer.parseInt(partes[2]);
                    String productora = partes[3];
                    peliculas.add(new Pelicula(id, titulo, duracion, productora));
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo películas: " + e.getMessage());
        }
        return peliculas;
    }

    public static List<SerieTV> leerSeries() {
        List<SerieTV> series = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(construirRuta("series.csv")), StandardCharsets.UTF_8))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String titulo = partes[1];
                    int duracion = Integer.parseInt(partes[2]);
                    int temporadas = Integer.parseInt(partes[3]);
                    series.add(new SerieTV(id, titulo, duracion, temporadas));
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo series: " + e.getMessage());
        }
        return series;
    }

    public static List<Documental> leerDocumentales() {
        List<Documental> documentales = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(construirRuta("documentales.csv")), StandardCharsets.UTF_8))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String titulo = partes[1];
                    int duracion = Integer.parseInt(partes[2]);
                    String tema = partes[3];
                    documentales.add(new Documental(id, titulo, duracion, tema));
                }
            }
        } catch (IOException e) {
            System.err.println("Error leyendo documentales: " + e.getMessage());
        }
        return documentales;
    }
}
