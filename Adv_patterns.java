public class Adv_patterns {
    
    //      * * * * *
    //     * * * * *
    //    * * * * *
    //   * * * * *
    //  * * * * *
    
    // public static void main(String[] args) {
    //     for(int i=5;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=5;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }



    //         5   
    //       4   4
    //     3   3   3
    //   2   2   2   2
    // 1   1   1   1   1

    // public static void main(String[] args) {
    //     for(int i=5;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=5;j>=i;j--){
    //             System.out.print(i + "   ");
    //         }
    //         System.out.println();
    //     }
    // }



    //         1   
    //       2   2
    //     3   3   3
    //   4   4   4   4
    // 5   5   5   5   5

    // public static void main(String[] args) {
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=n;j>=i;j--){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print(i + "   ");
    //         }
    //         System.out.println();
    //     }
    // }



    // *        *
    // **      **
    // ***    ***
    // ****  ****
    // **********
    // **********
    // ****  ****
    // ***    ***
    // **      **
    // *        *

    // public static void main(String[] args) {
    //     int n = 5;

    //     for(int i=1; i<=n ;i++){
    //         for(int j=1; j<=i;j++){
    //             System.out.print("*");
    //         }
    //         int spaces = 2 * (n-i);
    //         for(int j=1;j<=spaces;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     for(int i=n; i>=1 ;i--){
    //         for(int j=1; j<=i;j++){
    //             System.out.print("*");
    //         }
    //         int spaces = 2 * (n-i);
    //         for(int j=1;j<=spaces;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1; j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }



    //         1 
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5

    // public static void main(String[] args) {
    //     int n=5;
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=n-i; j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=i;j>=1;j--){
    //             System.out.print(j + " ");
    //         }
    //         for(int j=2; j<=i;j++){
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }



    //       * 
    //     * * *
    //   * * * * *
    // * * * * * * *
    // * * * * * * *
    //   * * * * *
    //     * * *
    //       *


    // public static void main(String[] args) {
    //     int n=4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=2*i-1;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=2*i-1;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }



}
