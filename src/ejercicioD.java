import java.util.Scanner;

public class ejercicioD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte nCasos= input.nextByte(); // porque el numero no puede ser mayor 88, el rango del byte es 8 bits-128 a 127

        for (byte i = 0; i < nCasos; i++) {
            byte n3 = input.nextByte();
            byte n2 = input.nextByte();
            byte n1 = input.nextByte();
            calcularTeclas(n3,n2,n1);
        }
        input.close(); // importante
    }

    public static void calcularTeclas(byte n3, byte n2, byte n1){
        short totalTeclas = (short) (n3 * 3 + n2 * 2 + n1); // la suma debe ser short --> 16 bits: -32,768 to 32,767
        System.out.println(totalTeclas);
    }
}
