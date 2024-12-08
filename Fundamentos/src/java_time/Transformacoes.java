package java_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Transformacoes {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.of(2023, 1, 24, 16,31,27);
        LocalDate data = dataHora.toLocalDate();

        // LocalDateTime to LocalTime
        LocalTime hora = dataHora.toLocalTime();

        // LocalDate to LocalDateTime
        LocalDate data01 = LocalDate.of(2023, 1, 24);
        LocalDateTime dataHora01 = data01.atTime(16,31,27); //2023-01-24T16:31:27
        dataHora01 = data.atTime(LocalTime.of(16,31,27)); //2023-01-24T16:31:27
        dataHora01 = data.atTime(LocalTime.of(16,31)); //2023-01-24T16:31
        dataHora01 = data.atStartOfDay(); //2023-01-24T00:00
    }
}
