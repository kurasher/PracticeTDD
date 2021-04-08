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

    @Test
    public void testGetMonth(){
        Modulo modulo = new Modulo(2021, 2, 1);
        assertEquals(14, modulo.getMonth());
    }

    @Test
    public void testZeller(){
        Modulo modulo = new Modulo(2021, 4, 1);
        assertEquals("木", modulo.calcZeller());
    }

    @Test
    public void testYearLimit(){
        Modulo modulo = new Modulo(1581, 4, 1);
        assertEquals("西暦は1582年以降を入力してください", modulo.calcZeller());
    }
}
