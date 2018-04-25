import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fib;

    @Before
    public void init(){
        fib = new Fibonacci();
    }
    @After
    public void after(){
        fib = null;
    }

    @Test
    public void findFibo() throws Exception {
        assertEquals(0, fib.findFibo(0));

        assertEquals(1, fib.findFibo(1));

        assertEquals(1, fib.findFibo(2));

        assertEquals(13, fib.findFibo(7));
    }

}