package UdemyDevMaster.aula16;

public class Resulução {
    public static void main(String[] args) {
    //RESOLUÇÃO 1
        CondClima sampa = new CondClima(-45f,true);
        sampa.definirClima();

    //RESOLUÇÃO 2
        QuantidadeCompra cliente = new QuantidadeCompra(0);
        cliente.validation();
        System.out.println("cliente deve pagar R$" + cliente.getCusto());
    }


}
