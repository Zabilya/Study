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
    public void testFindFibonacciNumberRight() throws Exception {
        assertEquals(new BigInteger("55"), fibonacciAPI.findFibonacciNumber(10)); }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumber(){
        fibonacciAPI.findFibonacciNumber(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMoreThen200Position(){
        fibonacciAPI.findFibonacciNumber(201);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullValue(){ fibonacciAPI.findFibonacciNumber(null); }

    @Test
    public void testFindFirst46FibonacciNumberRight() {
        assertEquals(55, fibonacciAPI.findFirst46FibonacciNumber(10)); }

    @Test(expected  = IllegalArgumentException.class)
    public void testFindFirst46FibonacciValueMoreThen46() {
        fibonacciAPI.findFirst46FibonacciNumber(47); }

    @Test
    public void testFindFirst92FibonacciNumberRight(){
        assertEquals(55, fibonacciAPI.findFirst92FibonacciNumber(10)); }

    @Test(expected = IllegalArgumentException.class)
    public void testFindFirst92FibonacciNumberMoreThen92(){
        fibonacciAPI.findFirst92FibonacciNumber(93); }

    @Test
    public void testRecursivelyFindFibonacciRight(){
        assertEquals(55, fibonacciAPI.recursivelyFindFibonacci(10)); }
}