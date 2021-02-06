package UdemyDevMaster.CursoIniciante.aula09_39;

/* [FUNÇÕES] tem a função de abstrair códigos com o objetivo de evitar reescreve-los toda hora
 * AULA 38 - FUNÇÕES TEORIA
 * AULA 39 - FUNÇÕES PRÁTICA
 * ATALHO ctrl+b sobre uma função - Demonstra suas definições */
public class Funções {
        private void HelloWorld(){
            System.out.println("Olá Mundo!");
        }
        private int soma(int a, int b){
            return a*b;
        }
    public static void main(String[] args) {
        Funções Teste = new Funções();
        Teste.HelloWorld();
        System.out.println(Teste.soma(2, 5));
        System.out.println(""); //Pular Linha

        System.out.println("FUNÇÕES ÚTEIS DE STRINGS");
        String str = "Teste Código!     ";
        Integer i = 6, j = 10;
        System.out.println(str + " - Palavra que está sendo usada pela Variável 'str'");
        System.out.println(str.charAt(i) + " - Exemplo da função .charAt() da frase '*" + str + "' que demonstra o caracter na posição escolhida: " + i);
        System.out.println(str.equals("Teste Código!") + " - Função .equals(), Avalia se a variável é igual a um dado valor, retornando v/f");
        System.out.println(str.startsWith("t") + " - Função .startsWith(), Avalia se a variável inicia com valor igual a um dado valor, retornando v/f");
        System.out.println(str.endsWith("!") + " - Função .endsWith(), Examina se a variável termina com valor igual a um dado valor, retornando v/f");
        System.out.println(str.substring(i,j) + " - Função .substring(), Retorna o valor da string dentro de um range pré-determinado, Inicia em: " + i + " Termina em: " + j);
        System.out.println(str.replace("Teste", "Troque") + " - Função .replace(), encontra e substitui uma sequência de caracters por outra");
        System.out.println(str.toUpperCase() + " - Função .toUpperCase(), Converte todos os Caracters em Maiúsculos");
        System.out.println(str.toLowerCase() + " - Função .toUpperCase(), Converte todos os Caracters em Minúsculos");
        System.out.println(str.trim() + " - Função .trim(), Retira Espaços em branco tanto do ínicio quanto do final dos textos");
        System.out.println(str.length() + " - Função .length(), conta nº de caracters");
        }
}
