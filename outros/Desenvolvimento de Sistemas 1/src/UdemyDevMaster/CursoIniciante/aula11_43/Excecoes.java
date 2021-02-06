package UdemyDevMaster.CursoIniciante.aula11_43;

public class Excecoes {
    public static void main(String[] args){
     /*
        String str = "Teste de erro!";
        str.charAt(200);
     */
    //*
    try{
        String str = "Teste de erro!";
        str.charAt(200);
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("O número informado está acima do aceitável");
    } finally {
        System.out.println("Rotina finalizada!");
    }
    //*/
    }
}
