package test;

import modelo.Pelicula;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeliculaTest {

    @Test
    public void testCrearPelicula() {
        Pelicula p = new Pelicula(1, "Matrix", 136, "Warner Bros");
        assertEquals("Matrix", p.getTitulo());
        assertEquals(136, p.getDuracionMinutos());
        assertEquals("Warner Bros", p.getProductora());
        assertEquals("Película", p.getTipo());
    }

	private void assertEquals(String string, String productora) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
