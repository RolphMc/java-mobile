package UdemyDevMaster.CursoIniciante.aula05_33;

public class Operadores {
    public static void main(String[] args) {
        Integer numero = 950;

        System.out.println(numero + 10 + " Soma");
        System.out.println(numero - 10 + " Subtração");
        System.out.println(numero * 10 + " Multiplicação");
        System.out.println(numero / 10 + " Divisão");
        System.out.println(numero % 10 + " Resto");

        numero = numero + 10;
        System.out.println(numero + " Operação n+n normal"); //Representação normal de operação
        numero -= 10;
        System.out.println(numero + " Operação n+n simplificada"); //Representação Simplificada de Operação

        //INCLEMENTO E DECLEMENTO
        numero++;
        System.out.println(numero + " Operação de Inclemento n++");
        numero --;
        System.out.println(numero + " Operação de Decremento n--");
        System.out.println("Operações de inclemento ou declemento podem ser expresas antes ou depois da variável");
    }
}
