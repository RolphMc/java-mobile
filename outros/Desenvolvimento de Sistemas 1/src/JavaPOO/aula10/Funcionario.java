package JavaPOO.aula10;

public class Funcionario extends Pessoa{
//ATRIBUTOS
    private String setor;
    private Boolean trabalhando;

//MÉTODOS ESPECÍFICOS
    public void mudarTrabalho(){
        this.setTrabalhando(!getTrabalhando());
    }

//MÉTODOS ESPECIAIS

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(Boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
