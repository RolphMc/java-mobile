package JavaPOO.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status (){
        System.out.println("Modelo " + this.modelo); //this indica os dados do objeto que chamou a class
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está Tampada? " + this.tampada);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);

    }

    void rabiscar (){
        if(this.tampada){
            System.out.println("Erro, não posso Rabiscar!");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    void tampar (){
        this.tampada = true;
    }

    void destampar (){
        this.tampada = false;
    }
}
