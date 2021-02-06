package JavaPOO.aula10;

public class Professor extends Pessoa{
//ATRIBUTOS
    private String especialidade;
    private Double salario;

//MÉTODOS ESPECÍFICOS
    public void receberAumento(Double ra){
        this.setSalario(getSalario()+ra);
    }

//MÉTODOS ESPECIAIS
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
