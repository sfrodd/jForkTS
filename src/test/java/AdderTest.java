import junit.framework.TestCase;

public class AdderTest extends TestCase {
    Adder a = new Adder();
    public void testAdd() {
        int x = a.add(3, 4);
        int y=a.add(5,-6);
        assertEquals(7, x);
        assertEquals(-1,y);
        assertEquals("Hello World",a.sayHello("Hello","World"));
    }
}