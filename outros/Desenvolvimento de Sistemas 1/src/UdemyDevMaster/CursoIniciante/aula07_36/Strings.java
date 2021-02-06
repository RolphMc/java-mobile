package UdemyDevMaster.CursoIniciante.aula07_36;

public class Strings {
    public static void main(String[] args) {
        String name = "Rodolfo";
        System.out.println("Caracter Escolhido " + name.charAt(5));
        //CharAt() - Demonstra o caracter na posição escolhida iniciando-se do 0

        Double d = 104.05;
        System.out.println(d);
        String strDouble = String.valueOf(d);
        System.out.println(strDouble);
        // valueOf Conversão de qualquer tipo de variáveis para string
    }
}