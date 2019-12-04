package simpletest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        String t = new App().hello("Hello World");
        assertEquals("Hello World", t);
    }
    @Test
    public void failApp() {
        String f = new App().hello("Goodbye World");
        assertEquals("Goodbye World", f);
    }
}
