package operadores;

public class Documentacao {
    /**
     * Calculadora simples
     * @author Luiz Henrique
     * @since v1.0
     * @param dividendo Número que será dividido
     * @param divisor Número que irá dividir o dividendo
     * @return O resultado entre a divisão do dividendo pelo divisor
     */
    Integer dividir (Integer dividendo, Integer divisor){
        return dividendo/divisor;
    }

    public static void main(String[] args) {
        Documentacao documentacao = new Documentacao();

        Integer resultado = documentacao.dividir(10, 5);
        System.out.println(resultado);
    }
}
