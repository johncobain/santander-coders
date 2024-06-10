import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = "John";

        LocalDate today = LocalDate.now();
        @SuppressWarnings("deprecation")
        Locale brasil = new Locale("pt", "BR");
        String weekday = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String greeting;
        LocalDateTime time = LocalDateTime.now();
        if(time.getHour()>=0&& time.getHour()<12){
            greeting = "bom dia";
        }else if(time.getHour()>=12&& time.getHour()<18){
            greeting = "boa tarde";
        }else if(time.getHour()>=18&& time.getHour()<=24){
            greeting = "boa noite";
        }else{
            greeting = "Ola";
        }

        System.out.printf("Ola, %s. Hoje eh %s, %s. %n",name, weekday, greeting.toUpperCase());
    }
}
