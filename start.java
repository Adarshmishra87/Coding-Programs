// public class start {

//     public static void main(String a[]) {
//         // int num1 = 0b1001;
//         int num1 = 0X2222E;
//         System.out.println(num1);
//     }
// }

import java.util.Scanner;

public class start {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.printf("%d, %02X%n", i,i);
        }
        sc.close();
    }
}