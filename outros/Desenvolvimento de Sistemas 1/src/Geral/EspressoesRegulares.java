package Geral;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EspressoesRegulares {
    public static void main (String[] args) {
        /*Expressões regulares é uma espécie de liguagem dentro de outra linguagem, ela é usada em uma grande quantidade
         * de códigos*/

        /** como encontrar uma explessão e sua posição dentro de uma sequência de caracters*/
        String regex = "au"; //Expressão procurada
        String text = "iahsiauh3aiuh5siau7ophs"; // Texto que será mapeado.
        Pattern pattern = Pattern.compile(regex); //Compila os dados de uma expressão regular em um padrão
        Matcher matcher = pattern.matcher(text);
        System.out.println("texto: " + text);
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posições Encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
        /* ANNOTATIONS
         *AULA YOUTUBE Expressões regulares PT1 - https://www.youtube.com/watch?v=-Pmnb_no1bQ
         * developers android [Pattern] - https://is.gd/LVLx3N
         * Livro Mastering Regular Expressions, Jeffrey E. F. Friedl, O'Reilly and Associates, 1997
         * ARTIGO - Expressões Regulares [A-Z] - https://is.gd/3fv52K*/
    }
}
