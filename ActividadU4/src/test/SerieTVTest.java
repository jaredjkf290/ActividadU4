package test;

import modelo.SerieTV;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SerieTVTest {

    @Test
    public void testCrearSerie() {
        SerieTV s = new SerieTV(1, "Breaking Bad", 50, 5);
        assertEquals("Breaking Bad", s.getTitulo());
        assertEquals(50, s.getDuracionMinutos());
        assertEquals(5, s.getTemporadas());
        assertEquals("Serie de TV", s.getTipo());
    }
}
