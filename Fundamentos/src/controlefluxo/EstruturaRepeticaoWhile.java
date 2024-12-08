package controlefluxo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class EstruturaRepeticaoWhile {
    public static void main(String[] args) {

//        int contador = 0;
//
//        while (contador < 50) {
//            System.out.println("Repetição: " + contador);
//            contador++;
//        }


        Double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            System.out.printf("Valor do doce: %.2f%n", valorDoce);


            if(valorDoce > mesada){
                System.out.println("Acabou a grana");
                valorDoce = mesada; // para não ter valor negativo
            }

            mesada -= valorDoce;
            System.out.printf("Mesada atual: %.2f%n", mesada);
            System.out.println();
        }
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
