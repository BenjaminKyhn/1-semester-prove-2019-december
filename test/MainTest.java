import junit.framework.TestCase;

public class MainTest extends TestCase {

    /**Tester hello()-metoden, når man giver den et navn som parameter*/
    public void testHelloAndras() {

        Main m = new Main();

        assertEquals("Hello András!", m.hello("András"));

    }


    /**Tester hello()-metoden, når man giver den en tom String i stedet for et navn*/
    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World!", m.hello(""));
    }
}