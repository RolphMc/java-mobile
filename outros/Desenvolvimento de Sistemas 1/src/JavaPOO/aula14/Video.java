package JavaPOO.aula14;

public class Video implements AcoesVideo{
//ATRIBUTOS
    private String titulo;
    private Integer avaliacao;
    private Integer views;
    private Integer curtidas;
    private Boolean reproduzindo;

//M ESPECÍFICOS
    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", avaliacao=" + avaliacao +
                ", views=" + views +
                ", curtidas=" + curtidas +
                ", reproduzindo=" + reproduzindo +
                '}';
    }

    //M IMPLEMENTADOS
    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("Video Está em Reprodução");
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("Video Está Pausado");
    }

    @Override
    public void like() {
        this.setCurtidas(getCurtidas()+1);
        System.out.println("Você curtiu esse vídeo");
    }

//M ESPECIAIS
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Integer getViews() {
        return views;
    }
    public void setViews(Integer views) {
        this.views = views;
    }

    public Integer getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public Boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
