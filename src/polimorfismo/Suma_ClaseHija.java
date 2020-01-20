package polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre {

    @Override
    public void Operaciones(){
        Pedir_datos();
        resultado = valor1 + valor2;
        Mostrar();

    }
}
