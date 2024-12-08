package java_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class JavaDate01 {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate meuAniversario = LocalDate.of(2024, 6, 17);
        LocalDate meuAniversario2 = LocalDate.of(2024, Month.JUNE, 17);

        System.out.println(dataAtual); // 2024-12-08
        System.out.println(meuAniversario); // 2024-06-17
        System.out.println(meuAniversario2); // 2024-06-17

        // convertendo uma string em uma data com o "parse"
        String data = "2024-12-08";
        LocalDate dataCerta = LocalDate.parse(data);
        System.out.println(dataCerta); // 2024-12-08

        //convertendo uma string em data proveniente do formato brasileiro
        String dataBrasil = "17/06/1996";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataBrasilFormatada = LocalDate.parse(dataBrasil, formatter);
        System.out.println(dataBrasilFormatada);

        //manipulando
        LocalDate aniversarioDeAlguem = LocalDate.of(1998, 4, 27);
        // qual a data que terá 18 anos?
        LocalDate dataQueTera18Anos = aniversarioDeAlguem.plusYears(15);
        System.out.println(dataQueTera18Anos); // 2013-04-27

        //comparação
        LocalDate data01 = LocalDate.of(2024, 12, 8);
        LocalDate data02 = LocalDate.of(2026, 11, 3);

        System.out.println(data01.isAfter(data02)); // false
        System.out.println(data01.isBefore(data02)); // true
        System.out.println(data01.isEqual(data02)); // false

        //formatando uma data
        LocalDate data03 = LocalDate.of(2024, 02, 20);
        DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Sem formatação: " + data03); // Sem formatação: 2024-02-20
        System.out.println("Formatada: " + formatter02.format(data03)); // Formatada: 20/02/2024
    }
}
