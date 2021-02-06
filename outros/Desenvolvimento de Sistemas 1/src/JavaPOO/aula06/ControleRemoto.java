package JavaPOO.aula06;

public class ControleRemoto implements Controlador{
//ATRIBUTOS
    private Integer volume;
    private boolean ligado;
    private boolean tocando;

//MÉTODOS ESPECIAIS
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private Integer getVolume() {
        return volume;
    }

    private void setVolume(Integer v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }
//MÉTODOS ABSTRATOS
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    @Override
    public void abrirMenu(){
        System.out.printf("Está ligado? " + this.getLigado());
        System.out.println("Está Tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }
    }
    @Override
    public void fecharMenu(){
        System.out.println("Fechando Menu...");
    }
    @Override
    public void maisVolume(){
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("Tv Desligada");
        }
    }
    @Override
    public void menosVoluman(){
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("Tv Desligada");
        }
    }
    @Override
    public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }else{
            System.out.println("Tv Desligada");
        }
    }
    @Override
    public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }else{
            System.out.println("Tv Desligada");
        }
    }
    @Override
    public void play(){
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Tv Desligada");
        }
    }
    @Override
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Tv Desligada");
        }
    }

}
