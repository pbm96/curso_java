package polimorfismo;
import java.util.Scanner;

public abstract class Operaciones_ClasePadre {
    Scanner entrada = new Scanner(System.in);
    protected int valor1, valor2, resultado;

    public void Pedir_datos(){
        System.out.println("introduce primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("introduce segundo valor: ");
        valor2 = entrada.nextInt();

    }
    public abstract void Operaciones();

    public void Mostrar(){
        System.out.print(resultado);
    }




}
