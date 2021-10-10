import utils.NumberUtils;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program to display the next higher number using the same digits of given input number");
        System.out.println("Please enter a number");
        findNextHigherNumber(System.in); //TODO: decouple to test this
        System.out.println("Completed");
    }

    public static void findNextHigherNumber(InputStream stream) {
        Scanner sc = new Scanner(stream);
        int input = 0;
        while (sc.hasNext()) {
            try {
                input = sc.nextInt(); //TODO: take str/long to avoid out-of-range for large numbers
            } catch (InputMismatchException ex) {
                System.out.println("Input not properly formatted, use number greater than 0 : ");
            }
            if (input == 0) {
                break;
            }
            int[] digits = NumberUtils.numberToDigitConverter(input);
            int[] output = NextHigherNum.findNext(digits);
            if (output != null) {
                System.out.println("Next higher with same digit : ");
                for (int i = 0; i < output.length; i++)
                    System.out.print(output[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}
