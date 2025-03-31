import java.time.LocalDate;
import java.time.Period;

public class Teste {

    public static void main(String[] args) {
        contaTempo(4, 1, 2026);
    }

    public static void contaTempo(int dia, int mes, int ano) {
        LocalDate hoje = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(ano, mes, dia);

        if (dataFutura.isBefore(hoje)) {
            System.out.println("A data informada já passou.");
            return;
        }

        Period periodo = Period.between(hoje, dataFutura);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        System.out.printf("Faltam %d ano(s), %d mes(es) e %d dia(s) para essa data em %d.%n",
                anos, meses, dias, ano);
    }
}
