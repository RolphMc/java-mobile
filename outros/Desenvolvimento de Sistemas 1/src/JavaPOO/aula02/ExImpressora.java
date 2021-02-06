package JavaPOO.aula02;

public class ExImpressora {
    Boolean ligada;
    int cargaTinta;
    boolean conectada;
    String imprime;

    void imprimir (){
        if(this.ligada && this.cargaTinta >= 5 && this.conectada){
            System.out.println("Imprimir Texto: " + this.imprime);
            this.cargaTinta = this.cargaTinta - 1;
            System.out.println("Nível de tinta agora é: " + cargaTinta);
        }else{
            System.out.println("Erro ao Imprimir, Veja o Estado Impressora: ");
            System.out.println("Impressora está ligada?: " + ligada);
            System.out.println("Nível de Tinta: " + cargaTinta);
            System.out.println("Conectada com PC?: " + conectada);
        }
    }

    void ligar(){this.ligada = true;}
    void desligar() {this.ligada = false;}
    void recarregar(int carga){this.cargaTinta = cargaTinta + carga;}
    void conectar(){this.conectada = true;}
}
