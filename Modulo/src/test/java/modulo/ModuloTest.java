package modulo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuloTest {
    @Test
    public void testFirst2Digits(){
        Modulo modulo = new Modulo();
        assertEquals(20, modulo.getFirst2Digits(2021));
    }
}
