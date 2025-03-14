import java.util.Scanner;

public class ejercicioC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nPersonas = input.nextInt();

        int[] real = new int[nPersonas];
        int[] percepcion = new int[nPersonas];

        for (int i = 0; i < nPersonas; i++) {
            real[i] = input.nextInt();
        }

        for (int i = 0; i < nPersonas; i++) {
            percepcion[i] = input.nextInt();
        }

        input.close();

        int contadorPCumplen = nSobrevalorado(nPersonas,real,percepcion);

        if (contadorPCumplen == nPersonas){ // en este caso 4
            System.out.println("SI");
        } else {
            System.out.println("NO");
        } // mas corto: sout(contadorCumplen == 4 ? "Si" : "No")
    }

    public static int nSobrevalorado(int nPersonas, int[] real, int[] percepcion) {

        int contadorPCumplen = 0;

        for (int i = 0; i < nPersonas; i++) {
            int diferenciaA = percepcion[i] - real[i];
            int mayores = 0;
            int noSobrevalorados = 0;

            for (int j = 0; j < nPersonas; j++) {
                if ((j != i) && (real[j] > real[i])) {
                    mayores++;
                    int diferenciaB = percepcion[j] - real[j];
                    if (diferenciaB < diferenciaA) {
                        noSobrevalorados++;
                    }
                }
            }

            if (mayores == noSobrevalorados) {
                contadorPCumplen++;
            }
        }
        return contadorPCumplen;
    }
}
