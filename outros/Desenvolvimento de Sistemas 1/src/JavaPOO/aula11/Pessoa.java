package JavaPOO.aula11;

public abstract class Pessoa {
//ATRIBUTOS
    protected String nome;
    protected Integer idade;
    protected String sexo;

//M ESPECÍFICOS
    public final void fazerAniversario(){
        this.setIdade(getIdade()+1);
    }

//M ESPECIAIS


    @Override
    public String toString() {
        return "Pessoa " +
                "\n nome='" + nome + '\'' +
                "\n idade=" + idade +
                "\n sexo='" + sexo;
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
