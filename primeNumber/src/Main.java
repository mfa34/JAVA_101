public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {

            counter = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
                
            }

        }
        System.out.println(counter);

    }
}
