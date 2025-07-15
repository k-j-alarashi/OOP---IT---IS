package lab_3;

import java.util.Scanner;

public class Lab_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        
        if(x>y && x>z) {
            System.out.println("x = "+x);
        }
        else if(y>x && y>z){
            System.out.println("y = "+y);
        }
        else if(z>x && z>y) {
            System.out.println("z = "+z);
        }
        else {
            System.out.println("Equals");
        }
        
    }
    
}
