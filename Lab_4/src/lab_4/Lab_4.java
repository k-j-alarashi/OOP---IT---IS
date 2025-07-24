package lab_4;

import java.util.Scanner;

public class Lab_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 1-D Array :
        int arr[] = new int[5];
        /*
        1 ) the arrays is fixed length data structure.
        2 ) the indexes of the array start from 0 and end at (length-1)
        3 ) when create array it looks like the following in memory.
        arr[0] = 0
        arr[1] = 0
        arr[2] = 0
        arr[3] = 0
        arr[4] = 0
        */
        System.out.println("Before Input : ");
        printArray(arr);
        System.out.println("Enter Numbers to Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("After Input : ");
        printArray(arr);
    }
    
    public static void printArray(int[] arr){
        System.out.println("====================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }
        System.out.println("====================");
    }
}
