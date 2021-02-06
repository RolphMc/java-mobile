package JavaPOO.aula06;

public class aula06 {
    public static void main (String[] args){
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();

        c.abrirMenu();
    }
}
