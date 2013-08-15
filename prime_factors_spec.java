/**
 * Created with IntelliJ IDEA.
 * User: Greg2
 * Date: 8/15/13
 * Time: 1:33 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.*;
import java.lang.*;

public class PrimeFactorsTest {
    @Test
    public void testPrimeOfOne(){
        ArrayList<Integer> expectedPrimes = new ArrayList<Integer>();
        assertEquals("One did not return an empty ArrayList", new ArrayList<Integer>(), PrimeFactors.generate(1,2,expectedPrimes));
    }
    @Test
    public void testPrimeOfTwo(){
        ArrayList<Integer> expectedPrimes = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        two.add(2);
        assertEquals("Two did not return an ArrayList with 2 as the only element", two, PrimeFactors.generate(2,2,expectedPrimes));
    }
    @Test
    public void testPrimeOfFour(){
        ArrayList<Integer> expectedPrimes = new ArrayList<Integer>();
        ArrayList<Integer> four = new ArrayList<Integer>();
        four.add(2);
        four.add(2);
        assertEquals("Four did not return an ArrayList with 2 and 2 as the only elements", four, PrimeFactors.generate(4,2,expectedPrimes));
    }
    @Test
    public void testPrimeOfSix(){
        ArrayList<Integer> expectedPrimes = new ArrayList<Integer>();
        ArrayList<Integer> six = new ArrayList<Integer>();
        six.add(2);
        six.add(3);
        assertEquals("Six did not return an ArrayList with 2 and 3 as the only elements", six, PrimeFactors.generate(6,2,expectedPrimes));
    }
}
