package ejercicios_1_al_14;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.zip.DataFormatException;

public class consultarFecha {
    public static void consultarFechaHoraActual(){
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");

        System.out.println(fechaHoraActual.format(formato));
    }

    public static void main(String[] args) {
        consultarFechaHoraActual();
    }
}
