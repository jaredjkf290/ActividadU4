package controlador;

import modelo.*;
import modelopersistencia.*;
import java.util.*;

public class ControladorContenido {
    private List<Pelicula> peliculas;
    private List<SerieTV> series;
    private List<Documental> documentales;

    public ControladorContenido() {
        peliculas = new ArrayList<>();
        series = new ArrayList<>();
        documentales = new ArrayList<>();
    }

    public void cargarDatos() {
        // ¡Ahora no se pasan rutas porque LectorCSV usa rutas automáticas!
        peliculas = LectorCSV.leerPeliculas();
        series = LectorCSV.leerSeries();
        documentales = LectorCSV.leerDocumentales();
    }

    public void guardarDatos() {
        // Lo mismo con la escritura
        EscritorCSV.guardarPeliculas(peliculas);
        EscritorCSV.guardarSeries(series);
        EscritorCSV.guardarDocumentales(documentales);
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public List<SerieTV> getSeries() {
        return series;
    }

    public List<Documental> getDocumentales() {
        return documentales;
    }

    public void agregarPelicula(Pelicula p) {
        peliculas.add(p);
    }

    public void agregarSerie(SerieTV s) {
        series.add(s);
    }

    public void agregarDocumental(Documental d) {
        documentales.add(d);
    }
}
