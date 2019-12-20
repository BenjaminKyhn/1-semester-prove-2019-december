import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    /**Tester Quickmarths sum()-metode*/
    @Test
    public void testSum() {
        Quickmaths quickmaths = new Quickmaths();

        assertEquals(15, quickmaths.sum(7,8));
    }

    /**Tester Quickmaths gennemsnit()-metode*/
    @Test
    public void testGennemsnit() {
        Quickmaths quickmaths = new Quickmaths();

        assertEquals(20, quickmaths.gennemsnit(13,27));
    }

}