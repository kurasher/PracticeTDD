package modulo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuloTest {
    @Test
    public void testGetMethod(){
        Modulo modulo = new Modulo(2021, 4, 1);
        assertEquals(20, modulo.getFirst2Digits());
        assertEquals(21, modulo.getLast2Digits());
        assertEquals(4, modulo.getMonth());
        assertEquals(1, modulo.getDay());
    }

    @Test
    public void testGetFirstAndLast2Digits(){
        Modulo modulo = new Modulo(2021, 1, 1);
        assertEquals(20, modulo.getFirst2Digits());
        assertEquals(20, modulo.getLast2Digits());
    }
}
