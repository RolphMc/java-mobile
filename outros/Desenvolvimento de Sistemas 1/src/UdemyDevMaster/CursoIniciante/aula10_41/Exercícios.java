package UdemyDevMaster.CursoIniciante.aula10_41;

public class Exercícios {
    //Questão 1.
    private void helloWorld(){
    }
    //Questão 2.
    private int HelloWorld(String a){
        return a.length();
    }
    //Questão 4.
    private int somaNova(int a, int b){
        return a+b;
    }
    //Questão 5.
    private double equacao(double a, double b, double c){
        return ((a+b)*a)/c;
    }
        public static void main(String[] args){
            Exercícios teste = new Exercícios();
            String str = "Oi mundo!";
            int i = 16, j = 5;
            double a = 45.5, b = 58.7, c = 89.1;

        //Retorno Exercício 2 e 3
            System.out.println(teste.HelloWorld(str) + " Esse é o retorno com o nº de caracters solicitado no exercicio 2 e 3");
        //Retorno Exercício 4
            System.out.println(teste.somaNova(i,j) + " Esse é o retorno exigido no exercício 4 com o resultado da soma entre " + i + " e " + j);
        //Retorno Exercício 5
            System.out.println(teste.equacao(a,b,c) + " Esse é o retorno exigido no exercício 5 com o resultado da equação usando as variáveis a = " + a + ", b = " + b + ", c = " + c);
        }
}