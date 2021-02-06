package JavaPOO.aula09;

public class Livro implements Publicacao{
//ATRIBUTOS
    private String titulo;
    private String autor;
    private Integer totPaginas;
    private Integer paginaAtual;
    private Boolean aberto;
    private Pessoa leitor;

//MÉTODOS ESPECÍFICOS
    public String detalhes() {
        return "Livro" +
                "\n titulo='" + titulo + '\'' +
                "\n autor='" + autor + '\'' +
                "\n totPaginas=" + totPaginas +
                "\n paginaAtual=" + paginaAtual +
                "\n aberto=" + aberto +
                "\n Leitor=" + leitor.getNome() +
                "\n Idade= " + leitor.getNome() +
                "\n Sexo= " + leitor.getSexo();
    }

    //MÉTODOS ESPECIAIS
    public Livro(String titulo, String autor, Integer totPaginas, Pessoa l) {
        this.titulo = titulo;
        this.autor = autor;
        this.setAberto(false);
        this.setPaginaAtual(0);
        this.totPaginas = totPaginas;
        leitor = l;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(Integer totPaginas) {
        this.totPaginas = totPaginas;
    }

    public Integer getPaginaAtual() {
        return paginaAtual;
    }
    public void setPaginaAtual(Integer paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public Boolean getAberto() {
        return aberto;
    }
    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        leitor = leitor;
    }
//IMPLEMENTADOS
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p>this.getTotPaginas()) {
            this.setPaginaAtual(0);
        }else {
            this.setPaginaAtual(p);
        }
    }

    @Override
    public void avacarPagina() {
        this.setPaginaAtual(getPaginaAtual()+1);
    }

    @Override
    public void voltarPágna() {
        this.setPaginaAtual(-1);
    }
}
