package Geral;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConfigurarDatas {
    public static void main(String[] args) throws ParseException {
        String data;

        MinhasFunções myfunction = new MinhasFunções();

        data = myfunction.FormatDateDiaMesAno("30/04/2020");
        System.out.println(data);
    }
}
