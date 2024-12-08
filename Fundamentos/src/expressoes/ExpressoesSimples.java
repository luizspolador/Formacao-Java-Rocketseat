package expressoes;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Luiz";
        String sobrenome = "Spolador";
        String textImpresso = "Olá, ".concat(nome).concat(" ").concat(sobrenome);
        System.out.println(textImpresso); // Olá, Luiz Spolador

        String textoImpresso2 = String.format("Olá, %s %s", nome, sobrenome);
        System.out.println(textoImpresso2); // Olá, Luiz Spolador
        // podemos usar: %s, %d, %f, %t

        Integer matricula = 1325647;
        Double salario = 4800.00;

        String textoImpresso3 = String.format("Matrícula: %d, Nome:%s %s, Salário: R$%.2f", matricula, nome, sobrenome, salario);
        System.out.println(textoImpresso3);
    }
}
