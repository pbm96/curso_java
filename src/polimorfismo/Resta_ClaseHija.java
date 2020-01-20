package polimorfismo;

public class Resta_ClaseHija extends Operaciones_ClasePadre {

    @Override
    public void Operaciones(){
        Pedir_datos();
        resultado = valor1 - valor2;
        Mostrar();
    }
}
