package lab_4;

import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("Enter Numbers of 2-D Array : ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        System.out.println("==========================");
        printArray2D(arr);
    }
    
    
    public static void printArray2D(int[][] arr){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("arr["+row+"]["+col+"]= "+arr[row][col]+"     ");
            }
            System.out.println("");
        }
    }
}
