package UdemyDevMaster.CursoIniciante.aula06_35;

import java.util.Scanner;

public class EntradasInformacao {
    public static void main (String[] args) {

        Integer valor;

        Scanner scanner = new Scanner (System.in);
        System.out.print("informe um número:");

        valor = scanner.nextInt();
        System.out.println(valor + 10);

    }
}