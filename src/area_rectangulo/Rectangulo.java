package area_rectangulo;

public class Rectangulo {

    private int base, altura, resultado;

    public Rectangulo (int base, int altura){
        this.base = base;
        this.altura = altura;

    }

    public void calcular(){

        this.resultado = this.base * this.altura;

    }

    public void imprimir(){
        calcular();
        System.out.println("El resultado es: "+ this.resultado);

    }
}
