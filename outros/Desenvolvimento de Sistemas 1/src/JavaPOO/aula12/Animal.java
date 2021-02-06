package JavaPOO.aula12;

public abstract class Animal {
    private String nome;
    private Float peso;
    private Integer idade;
    private Integer membros;
//M ESPECÍFICOS
    public abstract void locomover();
    public abstract void alimentar();
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
