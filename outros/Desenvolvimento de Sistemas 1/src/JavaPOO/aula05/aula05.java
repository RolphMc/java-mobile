package JavaPOO.aula05;

import java.util.Scanner;

public class aula05 {
    public static String auxS;
    public static Float auxF = 0f;
    Object conta;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBanco jubileu = new ContaBanco();
        jubileu.abrirConta(1, "CP", "Jubileu");
        //jubileu.depositar(300); // Valor depósito


        //ContaBanco creusa = new ContaBanco();
        //creusa.abrirConta(1, "CP");
        // creusa.depositar(500); // Valor depósito

        System.out.println("Digite a palavra que corresponde a ação desejada:");
        System.out.println(" - Depositar");
        System.out.println(" - Sacar");
        System.out.println(" - Fechar Conta");
        System.out.println(" - Pagar Mensalidade");
        options(scanner.nextLine(),jubileu);
    }

    private static void options(String escolha, Object titular){
        Scanner scanner = new Scanner(System.in);
        switch (escolha) {
            case " - Depositar":
                System.out.println("Digite o Valor que deseja depositar:");
                //titular.depositar(scanner.nextFloat());
                break;
            case " - Sacar":
                System.out.println("Digite o Valor que deseja sacar:");
                auxF = scanner.nextFloat();
                //titular.sacar(auxF);
                break;
            case " - Fechar Conta":
                System.out.println("Gostaria de Desativar Sua conta? (sim/não)");
                //titular.fecharConta(scanner.nextLine());
                break;
            case " - Pagar Mensalidade":
                /*if (titular.getTipo()) {
                    System.out.println("O valor a ser pago é de R$ 12, gostaria de pagar agora? (sim/não)");
                    if(titular.decisor(scanner.nextLine())){
                        auxF = 12f;
                    }
                } else {
                    System.out.println("O valor a ser pago é de R$ 20, gostaria de pagar agora? (sim/não)");
                    if(titular.decisor(scanner.nextLine())){
                        auxF = 20f;
                    }*/
                //titular.setSaldo(auxF, true);
                //break;
            default:
                System.out.println("Não compreendi, digite a palavra que corresponde a ação desejada:");
                System.out.println(" - Depositar");
                System.out.println(" - Sacar");
                System.out.println(" - Fechar Conta");
                System.out.println(" - Pagar Mensalidade");
            }

    }
}
