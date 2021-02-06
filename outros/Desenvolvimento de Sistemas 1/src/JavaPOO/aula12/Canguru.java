package JavaPOO.aula12;

public class Canguru extends Mamifero{
//M ESPECÍFICOS
    public void usarBolsa(){
        System.out.println(" Usando Bolsa com Filhote");
    }
    public void apresentar(){
        System.out.println("______________________________");
        System.out.println(" Animal: Canguru" +
                "\n Peso: " + this.getPeso() + " kg " +
                "\n Idade: " + this.getIdade() + "anos " +
                "\n Membros: " + this.getMembros() +
                "\n Cor do Pelo: " + this.getCorPelo() +
                "\n Status atual: ");
    }

//M IMPLEMENTADOS
    @Override
    public void locomover() {
        System.out.println(" Pulando");
    }
}
