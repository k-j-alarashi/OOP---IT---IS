package lab_3;

import java.util.Scanner;

public class ShortHand_If {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Three Numbers : ");
        int x = in.nextInt();
        int y = in.nextInt();

        int r = (x > y) ? x : y;
        System.out.println(r);
        
//        if(x>y){
//            System.out.println(x);
//        }
//        else {
//            System.out.println(y);
//        }
    }
}
