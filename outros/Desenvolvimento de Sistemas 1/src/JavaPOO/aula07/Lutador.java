package JavaPOO.aula07;

public class Lutador {
//ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private Integer idade;
    private Float altura;
    private Float peso;
    private String categoria;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
//MÉTODOS ESPECÍFICOS
    public void apresentar(){
        System.out.println("------------------------------------------------");
        System.out.println("lutador: " + getNome());
        System.out.println("origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura() + " metros");
        System.out.println("Peso: " + getPeso() + " kg");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("------------------------------------------------");
    }
    public void status(){
        System.out.println("------------------------------------------------");
        System.out.println("lutador: " + getNome());
        System.out.println("É um lutador de categoria " + getCategoria() + " com " + getPeso() + " Kg");
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("------------------------------------------------");
    }
    public void ganharLuta(){
        this.setVitorias(getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    }
//MÉTODOS ESPECIAIS
    public Lutador(String nome,
                   String nacionalidade,
                   Integer idade,
                   Float altura,
                   Float peso,
                   Integer vitorias,
                   Integer derrotas,
                   Integer empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String n) {
        this.nacionalidade = n;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer i) {
        this.idade = i;
    }

    public Float getAltura() {
        return altura;
    }
    public void setAltura(Float a) {
        this.altura = a;
    }

    public Float getPeso() {
        return peso;
    }
    public void setPeso(Float p) {
        this.peso = p;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if(peso < 52.2){
            this.categoria = "Desqualificado";
        } else if(peso <= 70.3){
            this.categoria = "Peso Pena";
        } else if(peso <= 83.9){
            this.categoria = "Peso Médio";
        } else if(peso <= 120.2){
            this.categoria = "Peso Pesado";
        } else{
            this.categoria = "Gordo demais!";
        }
    }

    public Integer getVitorias() {
        return vitorias;
    }
    public void setVitorias(Integer v) {
        this.vitorias = v;
    }

    public Integer getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(Integer d) {
        this.derrotas = d;
    }

    public Integer getEmpates() {
        return empates;
    }
    public void setEmpates(Integer e) {
        this.empates = e;
    }
}
