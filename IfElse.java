import java.util.*;

public class IfElse {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter a number");
    //     int num = sc.nextInt();

    //     if (num % 2 == 0) {
    //         System.out.println("Even");
    //     } else {
    //         System.out.println("Odd");
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("both numbers are equal");
        } else if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
    }   
}