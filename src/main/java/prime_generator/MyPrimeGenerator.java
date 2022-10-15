package prime_generator;

import java.util.ArrayList;
import java.util.List;

public class MyPrimeGenerator implements PrimeNumberGenerator {

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        int minValue = startingValue<endingValue? startingValue:endingValue;
        int maxValue = startingValue>endingValue? startingValue:endingValue;

        List<Integer> listOfPrimeNumbers = new ArrayList<>();
        for (int i = minValue; i<= maxValue; i++){
            if(isPrime(i)){
                listOfPrimeNumbers.add(i);
            }
        }
       return listOfPrimeNumbers;
    }

    @Override
    public boolean isPrime(int value) {
        int count=0;
        for(int i=1;i<=value;i++)
        {
            if(value%i==0){
                count++;
            }
            if (count>2){
                return false;
            }
        }
        return count == 2;
    }
}
