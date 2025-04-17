public class Jagged_array_style {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[0] = new int[1];
        a[1] = new int[3];
        a[2] = new int[9];

        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                sum+=a[i][j];
            }
        }
        for (int c[] : a) {
            for (int d : c) {
                System.out.print(d + " ");
            }
            System.out.println();
        }
        System.out.print("Total Sum of elements are: "+sum);
    }
}
