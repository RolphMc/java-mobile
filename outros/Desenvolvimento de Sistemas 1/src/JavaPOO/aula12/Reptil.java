package JavaPOO.aula12;

public class Reptil extends Animal{
//ATRIBUTOS
    private String corEscama;

//M ESPECÍFICO
    public void apresentar(){
        System.out.println("______________________________");
        System.out.println(" Animal: " + this.getNome() +
                "\n Peso: " + this.getPeso() + " kg " +
                "\n Idade: " + this.getIdade() + "anos " +
                "\n Membros: " + this.getMembros() +
                "\n Cor da Escama: " + this.getCorEscama() +
                "\n Status atual: ");
    }

//M ESPECIAIS
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

//M IMPLEMENTADOS
    @Override
    public void locomover() {
        System.out.println(" Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println(" Mastigando");
    }

    @Override
    public void emitirSom() {
        System.out.println(" Som de Réptil");
    }
}
