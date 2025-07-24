package lab_4;

import java.util.Locale;
import java.util.Scanner;

public class InputFloatNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Enter Float Number : ");
        float num = input.nextFloat();
        System.out.println(num);
    }
}
