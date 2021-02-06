package JavaPOO.aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); // INSTANCIAR OBJETO - PREPARAR FORMA
            c1.cor = "azul"; //Referencia à métodos
            c1.ponta = 0.5f;
            c1.tampada = false;
            c1.tampar();
            c1.status(); //Referência a um atributo - tem parenteses
            c1.rabiscar();

        Caneta c2 = new Caneta();
            c2.modelo = "ColorPlus";
            c2.cor = "Preta";
            c2.destampar();
            c2.rabiscar();
    }
}