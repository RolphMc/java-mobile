package JavaPOO.aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status (){
        System.out.println("Modelo " + this.modelo); //this indica os dados do objeto que chamou a class
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está Tampada? " + this.tampada);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);

    }

    public void rabiscar (){
        if(this.tampada){
            System.out.println("Erro, não posso Rabiscar!");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    public void tampar (){
        this.tampada = true;
    }

    public void destampar (){
        this.tampada = false;
    }
}
