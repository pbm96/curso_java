package area_rectangulo;
import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print(" Introduce base: ");
        int base = entrada.nextInt();

        System.out.print(" Introduce altura: ");
        int altura = entrada.nextInt();

        Rectangulo valores = new Rectangulo(base, altura);

        valores.imprimir();

    }
}
