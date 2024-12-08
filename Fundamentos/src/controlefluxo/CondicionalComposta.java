package controlefluxo;

public class CondicionalComposta {
    public static void main(String[] args) {

        double nota01 = 2;
        double nota02 = 5;
        double nota03 = 4.5;

        double media = (nota01 + nota02 + nota03) / 3;

        if(media >= 6){
            System.out.printf("Aprovado! média: %.2f%n", media);
        } else if (media < 6 && media >= 4){
            System.out.printf("Recuperação! %.2f%n",  media);
        } else {
            System.out.printf("Reprovado! %.2f%n", media);
        }
    }
}
