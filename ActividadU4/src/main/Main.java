package main;

import controlador.ControladorContenido;
import vista.VistaConsola;

public class Main {
    public static void main(String[] args) {
        ControladorContenido controlador = new ControladorContenido();
        controlador.cargarDatos();
        VistaConsola vista = new VistaConsola(controlador);
        vista.mostrarMenu();
    }
}
