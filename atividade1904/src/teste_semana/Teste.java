
package teste_semana;
import java.util.Calendar;
import java.util.Locale;
import semana.*;

public class Teste {
    public static void main(String[] args) {
    Semana semana = new Semana();

    Calendar calendar = Calendar.getInstance();

    System.out.println(semana.getDia_semana(calendar.get(Calendar.DAY_OF_WEEK)).mensagem());

    System.out.println(semana.getDia_semana(calendar.getDisplayName(Calendar.DAY_OF_WEEK, 
                                        Calendar.LONG, Locale.ENGLISH)).mensagem());
  }
}

