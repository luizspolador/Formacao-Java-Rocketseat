package controlefluxo;

public class EstruturaRepeticaoDoWhile {
    public static void main(String[] args) {

        int count = 1;
        System.out.println("Contando até 5...");
        System.out.println();

        do{
            System.out.println("Contador: " + count);
            count++;
        }
        while (count <5);
        System.out.println("Fim do loop");
    }
}
