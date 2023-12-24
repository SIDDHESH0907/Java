import java.util.*;

public class Switch {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String button = sc.next();

    //     switch (button) {
    //         case "yes":
    //             System.out.println("yes");
    //             break;
    //         case "no":
    //             System.out.println("no");
    //             break;
    //         default:
    //             System.out.println("invalid");
    //             break;
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("First number");
    //     int a = sc.nextInt();
    //     System.out.println("Second number");
    //     int b = sc.nextInt();
    //     System.out.println("1.Add 2.Sub 3.Mul 4.Div 5.Mod");
    //     int input = sc.nextInt();

    //     switch (input) {
    //         case 1:
    //             System.out.println(a + b);
    //             break;
    //         case 2:
    //             System.out.println(a - b);
    //             break;
    //         case 3:
    //             System.out.println(a * b);
    //             break;
    //         case 4:
    //             System.out.println(a / b);
    //             break;
    //         case 5:
    //             System.out.println(a % b);
    //             break;
    //         default:
    //             break;
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number from 1 to 12");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Enter correct number");
                break;
        }
    }
}
