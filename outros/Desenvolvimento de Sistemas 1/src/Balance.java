
import java.util.*;

public class Balance implements BalanceInterface{
    private int cod;
    private int mes;
    private int ano;

    Date currentDate = new Date();
    Random random = new Random();
    Scanner scanner = new Scanner (System.in);
    GregorianCalendar dataCal = new GregorianCalendar();

    int mes = dataCal.get(Calendar.MONTH);
    int ano = dataCal.get(Calendar.YEAR);

    //M ESPECIAIS
    public Balance() {
        this.setRefDate(currentDate.getDate());
        this.generateOrder();
    }

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getRefDate() {
        return refDate;
    }
    public void setRefDate(int date) {
        this.refDate = date;
    }

    //M IMPLEMENTADOS
    @Override
    public void monthRef() {
    }

    @Override
    public void requestServiceOrders() {
        int aux = 5;
        Integer[] teste = new Integer[aux];
        teste[0] = random.nextInt(4);
        teste[1] = random.nextInt(4);
        teste[2] = random.nextInt(4);
        teste[3] = random.nextInt(4);
        teste[4] = random.nextInt(4);

        if(aux!=0){
            for(int i = 0; i < aux; i++){
                System.out.println("    Está é a OS " + teste[i]);
            }
        }
    }

    @Override
    public void requestTransations() {
        int aux = 5;
        String[] teste = new String[aux];
        teste[0] = "0001";
        teste[1] = "0002";
        teste[2] = "0003";
        teste[3] = "0004";
        teste[4] = "0005";

        if(aux!=0){
            for(int i = 0; i < aux; i++){
                System.out.println("    Está é a Transação " + teste[i]);
            }
        }
    }

    @Override
    public void requestFutureOrders() {

    }
}
