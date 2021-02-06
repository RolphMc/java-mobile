package JavaPOO.aula10;

public class Bolsista extends Aluno{
    private Integer bolsa;

//M ESPECIFICO
    public void renovarBolsa(){
        System.out.println("Bolsa Renovada!");
    }
    @Override
    public void pagarMensal(){
        System.out.println("Bolsista é isento de mensalidades");
    }

//M ESPECIAL

    public Integer getBolsa() {
        return bolsa;
    }

    public void setBolsa(Integer bolsa) {
        this.bolsa = bolsa;
    }
}
