import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DataExtenso {

    public static String getDataHoraPorExtenso() {
        LocalDateTime agora = LocalDateTime.now();

       String diaSemana = agora.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        int dia = agora.getDayOfMonth();
        String mes = agora.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        int ano = agora.getYear();
        int hora = agora.getHour();
        int minuto = agora.getMinute();

        String diaFormatado = String.format("%02d", dia);
        String horaFormatada = hora + (hora == 1 ? " hora" : " horas");
        String minutoFormatado = minuto + (minuto == 1 ? " minuto" : " minutos");

        return String.format("Hoje é %s, dia %s de %s de %d e agora são %s e %s.",
                diaSemana, diaFormatado, mes, ano, horaFormatada, minutoFormatado);
    }

    public static void main(String[] args) {
        System.out.println(getDataHoraPorExtenso());
    }
}