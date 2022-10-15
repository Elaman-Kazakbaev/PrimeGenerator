package prime_generator;

import java.util.Scanner;

public class Utils {
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter starting value: ");
        int startingValue = scanner.nextInt();
        System.out.println("Please enter ending value: ");
        int endingValue = scanner.nextInt();

        MyPrimeGenerator generator = new MyPrimeGenerator();
        System.out.println("List of prime numbers: \n"+generator.generate(startingValue,endingValue));
    }
}
