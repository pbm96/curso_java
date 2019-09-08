package suma;
import java.util.Scanner;

public class SumaMain {

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce primer valor: ");
        int valor_uno = entrada.nextInt();

        System.out.println("Introduce segundo valor: ");
        int valor_dos = entrada.nextInt();

        Suma valores = new Suma(valor_uno, valor_dos);

        valores.imprimir();
    }
}
