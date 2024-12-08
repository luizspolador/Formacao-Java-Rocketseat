package controlefluxo;

public class Ternario {
    public static void main(String[] args) {

        int nota = 7;
        int nota2 = 6;

        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        String resultado2 = nota2>=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
}
