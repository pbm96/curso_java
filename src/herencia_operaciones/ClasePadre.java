package herencia_operaciones;
import java.util.Scanner;

public class ClasePadre {
    Scanner entrada = new Scanner(System.in);

    protected int valor1, valor2, resultado;

    public void Pedir_datos(){
        System.out.print("Introduce primer valor: ");
        valor1 = entrada.nextInt();

        System.out.print("Introduce segundo valor: ");
        valor2 = entrada.nextInt();

    }

    public void Mostrar_resultado(){
        System.out.println("El resultado es:" +resultado);
    }

}
