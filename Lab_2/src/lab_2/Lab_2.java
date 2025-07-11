package lab_2;

import java.util.Scanner;

public class Lab_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Char : ");
        char x = in.next().charAt(0);
        
        System.out.println("Enter Your ID : ");
        int id = in.nextInt();
        in.nextLine();
        
        System.out.println("Enter Your Name  : ");
        String name = in.nextLine();
        
        System.out.println("Enter Your Age : ");
        int age = in.nextInt();
        
        System.out.println("Enter Your Major : ");
        String major = in.next();
        
        System.out.println("=========== output =============");
        System.out.println("ID     : "+id);
        System.out.println("Name   : "+name);
        System.out.println("Age    : "+age);
        System.out.println("Major  : "+major);
        System.out.println("=========== output =============");
        System.out.printf(" ID  : %d \n Name  : %s \n Age  : %d \n Major : %s \n",id,name,age,major);
    }
    
}
