package utils;

public class NumberUtils {

    //Converts input number to digit
    public static int[] numberToDigitConverter(int n) {
        int len = String.valueOf(n).length();
        int[] digitsArr = new int[len];
        int i = len - 1;
        while (n > 0) {
            digitsArr[i] = (n%10);
            i--;
            n/=10;
        }
        //System.out.println(Arrays.toString(digitsArr));
        return digitsArr;
    }


    //Simple swap
    public static void swap(int [] ar, int i, int j)
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

}
