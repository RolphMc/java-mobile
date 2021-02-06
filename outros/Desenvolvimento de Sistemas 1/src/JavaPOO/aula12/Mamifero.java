package JavaPOO.aula12;

public class Mamifero extends Animal{
//ATRIBUTOS
    private String corPelo;

//M ESPECÍFICOS
    public void apresentar(){
        System.out.println("______________________________");
        System.out.println(" Animal: " + this.getNome() +
                "\n Peso: " + this.getPeso() + " kg " +
                "\n Idade: " + this.getIdade() + "anos " +
                "\n Membros: " + this.getMembros() +
                "\n Cor do Pelo: " + this.getCorPelo() +
                "\n Status atual: ");
    }

//M ESPECIAIS
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

//M IMPLEMENTADOS
    @Override
    public void locomover() {
        System.out.println(" Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println(" Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println(" Som de Mamifero");
    }
}
