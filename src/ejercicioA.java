import java.util.Scanner;

public class ejercicioA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nCasos= input.nextInt(); // porque 1 y 10^9

        for (int i = 0; i < nCasos; i++) {
            int num = input.nextInt();
            calcularNicomano(num);
        }

        input.close(); // importante
    }

    public static void calcularNicomano(int num){
        int numNico = 0;
        int n = 1;
        int ind;

        while (num > numNico) {
            ind = (int) Math.pow(n,3); // n^3 + (n+1)^3 + (n+2)^3
            numNico += ind;
            n++; // aumentamos el contador
        }
        System.out.println(numNico);
    }
}
