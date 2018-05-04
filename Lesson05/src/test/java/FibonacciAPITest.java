import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FibonacciAPITest {
    FibonacciAPI fibonacciAPI;

    @Before
    public void init(){
        fibonacciAPI = new FibonacciAPI();
    }
    @After
    public void after(){
        fibonacciAPI = null;
    }

    @Test
    public void testRightFibonacciNumber() throws Exception {
        assertEquals(new BigInteger("55"), fibonacciAPI.findFibonacciNumber(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNehativeNumber(){
        fibonacciAPI.findFibonacciNumber(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThen200Position(){
        fibonacciAPI.findFibonacciNumber(201);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullValue(){
        fibonacciAPI.findFibonacciNumber(null);
    }

}