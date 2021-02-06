package JavaPOO.aula10;

public abstract class Aluno extends Pessoa{
//ATRIBUTOS
    private Integer matrícula;
    private String curso;
//MÉTODOS ESPECÍFICOS
    public void cancelarMatricula(){
        System.out.println("Matrícula Cancelada");
    }
//MÉTODOS ESPECIAIS

    public Integer getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(Integer matrícula) {
        this.matrícula = matrícula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public abstract void pagarMensal();
}
