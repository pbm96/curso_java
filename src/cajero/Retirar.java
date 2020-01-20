package cajero;

public class Retirar extends ClasePadre{
    @Override
    public void Transacciones(){
        System.out.print("Cuanto dinero quieres retirar: ");
        int retiro = entrada.nextInt();

        if (retiro <= getSaldo())
        setSaldo(getSaldo() - retiro);
        else
            System.out.println("No tienes sufiente dinero en la cuenta. tu saldo es de "+ getSaldo());

        System.out.println("-------------------------------");

        pedir_operacion();
    }
}
