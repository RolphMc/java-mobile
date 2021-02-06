package JavaPOO.aula05;

public class Resolução5 {
    public static void main(String[] args){
        ContaBancoResolução p1 = new ContaBancoResolução();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");


        ContaBancoResolução p2 = new ContaBancoResolução();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");

        p1.depositar(300f);
        p2.depositar(500f);

        p2.sacar(100f);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
