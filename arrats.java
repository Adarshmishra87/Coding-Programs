import java.util.Scanner;

public class arrats {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum += i;
        }

        System.out.print(sum + " ");

        sc.close();
    }
}