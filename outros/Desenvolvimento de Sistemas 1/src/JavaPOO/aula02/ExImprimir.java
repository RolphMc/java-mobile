package JavaPOO.aula02;

public class ExImprimir {
    public static void main (String[] args){
        ExImpressora canon = new ExImpressora();
        canon.ligada = false;
        canon.cargaTinta = 3;
        canon.conectada = false;
        canon.imprime = "Essa folha foi impressa";

        canon.ligar();

        canon.conectar();

        canon.imprimir();
    }
}
