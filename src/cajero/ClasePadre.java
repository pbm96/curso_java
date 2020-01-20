package cajero;
import java.util.Scanner;

public abstract class ClasePadre {
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void pedir_operacion(){
        int operacion = 0;

        do{
            System.out.println(" Su saldo es de: "+saldo);
            System.out.println("1. Consulta de Saldo \n"+
                                "2. Retiro efectivo \n" +
                                "3. Ingreso efectivo \n" +
                                "4. salir");

            operacion = entrada.nextInt();

        if (operacion == 1){

            ClasePadre objeto = new Consultar();

            objeto.Transacciones();
        }
        else if (operacion == 2){

            ClasePadre objeto = new Retirar();
            objeto.Transacciones();

        }else if (operacion == 3){

                ClasePadre objeto = new Ingresar();
                objeto.Transacciones();

        }else if (operacion == 4){
            System.out.println("Adios.");
        }else{
            System.out.println("Operacion no recoonocida, vuelva a intentarlo");

        }

        }while (operacion !=4);


        System.exit(0);
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public abstract void Transacciones();



}
