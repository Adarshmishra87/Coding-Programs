public class looping {

    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            System.out.println("Day " + i);
            for (int j = 1; j <= 15; j++) {
                System.out.println("Starting time{" + (j + 8)+ "-" + (j + 9)+ "}Ending time");
            }
        }
    }
}