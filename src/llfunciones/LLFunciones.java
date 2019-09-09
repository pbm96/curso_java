/*
 * Clase para las funciones logicas de una lavadora
 */
package llfunciones;

public class LLFunciones {
    private int kilos = 0, tipo_ropa = 0;
    private boolean llenado_full = false, lavado_completo = false, secado_completo = false;

    public LLFunciones(int kilos, int tipo_ropa) {
        this.kilos = kilos;
        this.tipo_ropa = tipo_ropa;

    }

    private void Llenado(){
        if(kilos <= 12){
            llenado_full = true;
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
            Lavado();
        }else{
            System.out.println("La carga de ropa es mucha, reduce los kilos");
        }
    }

    private void Lavado(){

        if(llenado_full == true){
            if (tipo_ropa == 1){

            System.out.println("El tipo de ropa es de color.");
            System.out.println("lavando...");
            lavado_completo = true;

            }else if (tipo_ropa == 2){

                System.out.println("El tipo de ropa es blanca.");
                System.out.println("lavando...");
                lavado_completo = true;
                Secado();

            }else{
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color");
                System.out.println("lavando...");
                lavado_completo = true;
                Secado();
            }
        }else{
            System.out.println("No se puede lavar porque no se introdujo ropa o se lleno demasiado la lavadora");

        }

    }

    private void Secado(){

        if (lavado_completo == true){
            System.out.println("Secando...");
            secado_completo = true;

        }else{
            System.out.println("ocurrio un error con el secado");
        }
    }

    public void lavar_ropa(){
        Llenado();
        if (secado_completo == true){
            System.out.println("El lavado finalizó correctamente");
        }
    }
}
