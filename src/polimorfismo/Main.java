package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija();

        mensajero_Suma.Operaciones();

        Operaciones_ClasePadre mensajero_resta = new Resta_ClaseHija();

        mensajero_resta.Operaciones();
    }
}
