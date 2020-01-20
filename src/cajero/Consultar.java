package cajero;

public class Consultar extends ClasePadre {
    @Override
    public void Transacciones(){
        System.out.println("Tu saldo es de "+ getSaldo());
        System.out.println("-------------------------------------");

        pedir_operacion();
    }
}
