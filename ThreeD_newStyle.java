public class ThreeD_newStyle {
    public static void main(String[] args) {
        int a[][][][] = new int[2][2][1][2];//jagged arrays
        for (int b[][][] : a) {
            for (int c[][] : b) {
                for (int d[] : c) {
                    for (int e : d) {
                        e=(int)(Math.random()*100);
                        System.out.print(e + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
