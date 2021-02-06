package JavaPOO.aula12;

public class aula12 {
    public static void main(String[] args) {
    /*
    * /EXEMPLO DE POLIMORFISMO:
    * acontece quando Substituímos um metodo de uma superclass na sua subclass
    * usando a mesma assinatura.
    */

    //Mamifero - Genérico
        Mamifero mamifero = new Mamifero();
        mamifero.setNome("Mamifero Qualquer");
        mamifero.setPeso(80f);
        mamifero.setIdade(15);
        mamifero.setMembros(4);
        mamifero.setCorPelo("Marrom Claro");

        mamifero.apresentar();
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();

    //Canguru
        Canguru canguru = new Canguru();
        canguru.setPeso(80f);
        canguru.setIdade(15);
        canguru.setMembros(4);
        canguru.setCorPelo("Marrom Claro");

        canguru.apresentar();
        canguru.locomover();
        canguru.alimentar();
        canguru.emitirSom();

        canguru.usarBolsa();

    //COBRA
        Reptil reptil = new Reptil();
        reptil.setNome("Cobra");
        reptil.setPeso(4f);
        reptil.setIdade(8);
        reptil.setMembros(0);
        reptil.setCorEscama("Verde Musgo");

        reptil.apresentar();
        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();
        System.out.println("______________________________");


    }
}
