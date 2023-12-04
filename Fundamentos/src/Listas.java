import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> lista = new ArrayList();
        lista.add("Sarah");
        lista.add("Luiz");
        lista.add("Mariana");
        lista.add("Otávio");

        //obtendo pelo item da lista
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

        System.out.println();

        // primeira forma de percorrer a lista
        for(String nome : lista){
            System.out.println(nome);
        }

        System.out.println();

        // segunda forma de percorrer a lista
        lista.forEach(nome -> System.out.println(nome));

        System.out.println();

        // terceira forma de percorrer a lista
        lista.forEach(System.out::println);
    }
}