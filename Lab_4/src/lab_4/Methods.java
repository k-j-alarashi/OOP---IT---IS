package lab_4;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("sum = "+sum(num1, num2));
        System.out.println("========================");
        multiplication(num1, num2);
    }
    
    // method return value.
    public static int sum(int x , int y) {
        return x+y;
    }
    
    // method does not return value , print only.
    public static void multiplication(int x , int  y){
        System.out.println(x+" x "+y+" = "+x*y);
    } 
}
