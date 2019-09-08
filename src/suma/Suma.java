package suma;

public class Suma {
        private int v1, v2, resultado;

        public Suma(int valor_uno, int valor_dos){
            this.v1 = valor_uno;
            this.v2 = valor_dos;
        }

        public void sumar(){
            resultado = v1+v2;

        }

        public void imprimir(){
            sumar();
            System.out.println("El resultado de la suma es: "+resultado);
        }

}
