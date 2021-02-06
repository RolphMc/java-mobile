package JavaPOO.aula11;

public class Professor extends Pessoa {
//ATRIBUTOS
    private String especialidade;
    private Float salario;

//M ESPECÍFICOS
    public void receberAumento(Float ra){
        this.setSalario(getSalario()+ra);
    }
//M ESPECIAL
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
