import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        // Manipulação de Strings e Datas

        // Strings

        String var1 = "Ely";
        String var2 = "ely";

        System.out.println(var1.toUpperCase());
        System.out.println(var1.toLowerCase());
        System.out.println(var1.length());

        //Comparação entre Strings
        System.out.println(var1.equals(var2));

        // Ignora Case
        System.out.println(var1.equalsIgnoreCase(var2));

        // Datas

        LocalDate hoje = LocalDate.now();
        // Locale var1 = new Locale("pt", "BR");
        Locale varPais = Locale.of("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, varPais));        

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, varPais);
        String saudacao = "";
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "olá";
        }

        System.out.printf("Olá, %s! Hoje é %s, %s!%n", var1, diaSemana, saudacao.toUpperCase());
    }
}
