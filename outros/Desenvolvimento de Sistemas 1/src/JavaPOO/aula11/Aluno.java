package JavaPOO.aula11;

public class Aluno extends Pessoa{
//ATRIBUTOS
    private Integer matricula;
    private String curso;

//M ESPECÍFICO
    public void pagarMensal(){
        System.out.println("Mensalidade Paga por " + this.getNome());
    }

//M ESPECIAL

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
