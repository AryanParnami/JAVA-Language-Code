public class Ch_05_04_Continue {
    public static void main(String[] args) {

        // Continue in loops
        System.out.println("**** for loop ****");
        for (int i = 0; i < 5; i++) {

        if (i == 3) {
        System.out.println("Breaking the loop\n\n");
        continue;// it means that it will skip the part return below continue
        }
        System.out.println(i);
        System.out.println("loop is running");
        }
        System.out.println("**** while loop ****");
        int a = 0;
        while (a < 5) {
            a++;
            if (a == 3) {

                System.out.println("Breaking the loop\n\n");
                continue;// it means that it will skip the part return below continue
            }
            System.out.println(a);
            System.out.println("loop is running");

        }
        System.out.println("**** do-while loop ****");
        int b = 0;
        do {
            b++;
        if (b == 3) {
        System.out.println("Breaking the loop");
        continue;
        }
        System.out.println(b);
        System.out.println("loop is running");
        

        } while (b < 5);

        System.out.println("Loop ends here ");

    }
}
