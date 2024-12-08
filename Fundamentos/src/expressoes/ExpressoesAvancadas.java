package expressoes;

import java.time.LocalDate;

public class ExpressoesAvancadas {
    public static void main(String[] args) {
        Integer matricula = 123;
        Double salario = 4800.00;
        String nome = "Luiz";
        String sobrenome = "Spolador";

        String dados = String.format("Nome: %s, Matrícula: %05d, Salário: %.2f", nome, matricula, salario);
        System.out.println(dados); // Nome: Luiz, Matrícula: 00123, Salário: 4800.00

        // nome deve ocupar 30 caracteres
        String dados2 = String.format("Nome: %-30s, Matrícula: %05d, Salário: %.2f", nome, matricula, salario);
        System.out.println(dados2); // Nome: Luiz                          , Matrícula: 00123, Salário: 4800.00

        // se ultrapassar 15 caracteres, o nome será cortado
        String nomeCompleto = "Luiz Henrique Fernandes Spolador";
        String dados3 = String.format("Nome: %-15.15s, Matrícula: %05d, Salário: %.2f", nomeCompleto, matricula, salario);
        System.out.println(dados3); // Nome: Luiz Henrique F, Matrícula: 00123, Salário: 4800.00

        // invertendo posições dos argumentos
        System.out.println(String.format("%2$s %1$s", nome, sobrenome)); // Spolador Luiz
    }
}
