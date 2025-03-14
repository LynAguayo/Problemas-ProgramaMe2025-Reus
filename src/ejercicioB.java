import java.util.Scanner;

public class ejercicioB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = -1;

        int result = 1;

        while (n != 0) {
            n = input.nextInt();

            if ( n != 0 ){
                result = result * n;
            }
        }

        System.out.println(result);
        input.close();
    }
}
