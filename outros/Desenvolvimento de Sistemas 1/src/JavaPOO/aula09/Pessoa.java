package JavaPOO.aula09;

public class Pessoa {
//ATRIBUTOS
    private String nome;
    private Integer idade;
    private String sexo;

//MÉTODOS ESPECÍFICOS
    public void fazerAniversario(){
        this.setIdade(getIdade()+1);
    }

// MÉTODOS ESPECIAIS
    public Pessoa(String nome, Integer idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
    }

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
