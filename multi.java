import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                a[i][j] = (int) (Math.random() * 100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
