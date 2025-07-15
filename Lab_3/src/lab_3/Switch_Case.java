/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_3;

import java.util.Scanner;

/**
 *
 * @author khaled
 */
public class Switch_Case {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The number of day : ");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            default:
                System.out.println("invaild value ");
        }
    }
}
