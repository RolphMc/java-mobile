package JavaPOO.aula14;

public class Visualizacao {
//ATRIBUTOS
    private Gafanhoto espectador;
    private Video filme;

//M ESPECÍFICOS
    public void avaliar(){
        filme.setAvaliacao(2);
    }
    public void avaliar(Integer nota){

    }
    public void avaliar(Float porcentagem){

    }


//M ESPECIAIS;
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    @Override
    public String toString() {
        return "\n Visualizacao:" +
                "\nespectador=" + espectador +
                "\n filme=" + filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
