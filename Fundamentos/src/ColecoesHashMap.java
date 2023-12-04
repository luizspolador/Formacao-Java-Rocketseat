import java.util.HashMap;
import java.util.Map;

public class ColecoesHashMap {
    public static void main(String[] args) {

        //colecao de chave e valor. Por mais que o valor seja diferente, o map só aceita uma chave.
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Sarah", 10);
        notas.put("Luiz", 9);
        notas.put("mariana", 7);
        notas.put("Otávio", 8);

        //pode ser var ou Integer
        var nota = notas.get("Sarah");
        System.out.println(nota); //10

        //percorrendo o map
        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + " e o valor é " + value);
        }
    }
}
