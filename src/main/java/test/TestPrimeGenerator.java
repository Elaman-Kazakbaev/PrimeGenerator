package test;

import org.junit.Assert;
import org.junit.Test;
import prime_generator.MyPrimeGenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestPrimeGenerator {
    MyPrimeGenerator generator = new MyPrimeGenerator();

    @Test
    public void validateEndpointInclusive(){
        List<Integer> generatedListOfPrimes = generator.generate(2, 7);
        Assert.assertEquals(2, (int)generatedListOfPrimes.get(0));
        Assert.assertEquals(7, (int)generatedListOfPrimes.get(generatedListOfPrimes.size()-1));
    }

    @Test
    public void validateInverseRange(){
        List<Integer> generatedListOfPrimes1 = generator.generate(1, 10);
        List<Integer> generatedListOfPrimes2 = generator.generate(10,1);

        Assert.assertEquals(generatedListOfPrimes1,generatedListOfPrimes2);
    }

    @Test
    public void validateRange7900_7920(){
        List<Integer> validPrimeList = Arrays.asList(7901,7907,7919);
        List<Integer> generatedList1 = generator.generate(7900, 7920);
        List<Integer> generatedList2 =generator.generate(7920,7900);

        Assert.assertEquals(validPrimeList,generatedList1);
        Assert.assertEquals(validPrimeList,generatedList2);
    }

    @Test
    public void validateOrderOfList(){
        List<Integer> generatedListOfPrimes1 = generator.generate(1,100);
        List<Integer> generatedListOfPrimes2 = generator.generate(100, 1);
        Collections.sort(generatedListOfPrimes1);

        Assert.assertEquals(generatedListOfPrimes1,generatedListOfPrimes2);
    }

    @Test
    public void validateSamePrimeEnds(){
        List<Integer> generatedListOfPrimes = generator.generate(7, 7);
        Assert.assertTrue(generatedListOfPrimes.contains(7));
    }


    @Test
    public void validateNotPrimeNumber(){
        List<Integer> generatedListOfPrimes = generator.generate(1, 1);
        Assert.assertTrue(generatedListOfPrimes.isEmpty());
    }
}
