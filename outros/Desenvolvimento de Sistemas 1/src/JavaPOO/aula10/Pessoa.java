package JavaPOO.aula10;

public class Pessoa {
//ATRIBUTOS
    private String nome;
    private Integer idade;
    private String sexo;

//MÉTODOS ESPECÍFICOS
    public void fazerAniversario(){
        this.setIdade(getIdade()+1);
    }
//MÉTODO ESPECIAL

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
