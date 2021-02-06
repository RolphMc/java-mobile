package JavaPOO.aula13;

public abstract class Animal13 {
    protected String nome;
    protected Float peso;
    protected Integer idade;
    protected Integer membros;
//M ESPECÍFICOS
    public abstract void emitirSom();
//M ESPECIAIS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getMembros() {
        return membros;
    }
    public void setMembros(Integer membros) {
        this.membros = membros;
    }
}
