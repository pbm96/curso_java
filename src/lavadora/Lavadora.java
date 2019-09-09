package lavadora;
import java.util.Scanner;
import libreria.LLFunciones;


public class Lavadora {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introducir kilos ropa: ");
        int kilos = entrada.nextInt();

        System.out.println("Introducir tipo ropa: ");
        int tipo_ropa = entrada.nextInt();

        LLFunciones valores = new LLFunciones(kilos, tipo_ropa);
        valores.lavar_ropa();



    }
}