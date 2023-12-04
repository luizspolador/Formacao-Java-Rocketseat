import java.util.HashSet;

public class ColecoesHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>(); // não mantem ordem. elementos não possuem index

        numeros.add(10);
        numeros.add(25);
        numeros.add(53);
        numeros.add(21);

        //tamanho
        System.out.println(numeros.size());
        System.out.println();

        //percorrendo set
        for(Integer elemento : numeros){
            System.out.println(elemento);
        }

        numeros.remove(53);
        System.out.println();

        for(Integer elemento : numeros){
            System.out.println(elemento);
        }

        System.out.println();
        System.out.println(numeros.contains(21)); // true

    }
}
