package cajero;

public class Ingresar extends ClasePadre {
    @Override
    public void Transacciones(){
        System.out.print("Cuanto dinero quieres ingresar: ");
        int retiro = entrada.nextInt();
        setSaldo(getSaldo() + retiro);

        System.out.println("----------------------------");

        pedir_operacion();
    }
}
