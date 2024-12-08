package java_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTime01 {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual); // 15:27:39.159413900

        LocalTime horaMinutoSegundo = LocalTime.of(13,22, 32);
        System.out.println(horaMinutoSegundo); // 13:22:32

        LocalTime horaMinuto = LocalTime.of(14, 28);
        System.out.println(horaMinuto); // 14:28

        LocalTime horaDeString = LocalTime.parse("14:24:21");
        System.out.println(horaDeString); // 14:24:21

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeUmaStringPadronizada = LocalTime.parse("121439", formatter);
        System.out.println(horaDeUmaStringPadronizada); // 12:14:39

        System.out.println(horaAtual.getHour());
        System.out.println(horaAtual.getMinute());
        System.out.println(horaAtual.getSecond());
        System.out.println(horaAtual.getNano());
    }
}
