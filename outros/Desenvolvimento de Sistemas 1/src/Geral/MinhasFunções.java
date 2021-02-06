package Geral;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MinhasFunções {

    public String FormatDateDiaMesAno(String dataDesejada) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");

        DateFormat format = DateFormat.getDateInstance();
        Date data = format.parse(dataDesejada);
        String aux = format1.format(data);

        return aux;
    }
}
