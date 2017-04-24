package sistema_de_cobranca;
//OBS: o exercício não pediu que seguisse algum padrão de projeto

import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class data {

    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();

        Locale brasil = new Locale("pt", "BR"); //Retorna do país e a língua
        Locale eua = Locale.US;

        DateFormat test1 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
        System.out.println("Data e hora brasileira: " + test1.format(data));

        DateFormat test2 = DateFormat.getDateInstance(DateFormat.FULL, eua);
        System.out.println("Data e hora americana: " + test2.format(data));

        DateFormat test3 = DateFormat.getDateInstance(DateFormat.MONTH_FIELD, brasil);
        System.out.println("Data e hora brasileira: " + test3.format(data));

        DateFormat test4 = DateFormat.getDateInstance(DateFormat.MONTH_FIELD, eua);
        System.out.println("Data e hora americana: " + test4.format(data));

        DateFormat test5 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, brasil);
        System.out.println("Data e hora brasileira: " + test5.format(data));

        DateFormat test6 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, eua);
        System.out.println("Data e hora americana: " + test6.format(data));

        DateFormat test7 = DateFormat.getDateInstance(DateFormat.SHORT, brasil);
        System.out.println("Data e hora brasileira: " + test7.format(data));

        DateFormat test8 = DateFormat.getDateInstance(DateFormat.SHORT, eua);
        System.out.println("Data e hora americana: " + test8.format(data));

    }
}
