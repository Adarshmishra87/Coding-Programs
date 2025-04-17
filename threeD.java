import java.util.Scanner;

public class threeD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //4D arrays             //4D arrays
        //4D arrays             //4D arrays
        //4D arrays             //4D arrays
        //4D arrays             //4D arrays
        //4D arrays             //4D arrays
        //4D arrays             //4D arrays
        //4D arrays             //4D arrays
        //4D arrays             //4D arrays 
        //4D arrays             //4D arrays

    
        int a[][][][] = new int[3][4][3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int j2 = 0; j2 < 3; j2++) {
                    for (int k = 0; k < 4; k++) {
                        a[i][j][j2][k] = (int) (Math.random() * 10);
                        System.out.print(a[i][j][j2][k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}
