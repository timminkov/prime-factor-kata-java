/**
 * Created with IntelliJ IDEA.
 * User: Greg2
 * Date: 8/15/13
 * Time: 1:22 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;
import java.lang.*;

public class PrimeFactors {
    public static ArrayList<Integer> generate(int factoredNum, int divisor, ArrayList<Integer> primes){
        if(divisor > factoredNum){
            return primes;
        }
        while (factoredNum % divisor == 0){
            primes.add(divisor);
            factoredNum /= divisor;
        }
        divisor += 1;
        return PrimeFactors.generate(factoredNum, divisor, primes);
    }
}