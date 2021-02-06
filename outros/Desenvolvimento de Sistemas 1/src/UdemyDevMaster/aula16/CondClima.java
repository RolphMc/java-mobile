package UdemyDevMaster.aula16;

public class CondClima {
    private Float temperatura;
    private Boolean chuva;
//específicos
    public void definirClima(){
        if(this.getChuva()){
            if (getTemperatura() <= 0f){
                System.out.println("Está Nevando");
            } else {
                System.out.println("Está Chovendo");
            }
        } else {
            System.out.println("Clima Limpo e Sem chuva!");
        }
    }

//especiais
    public CondClima(Float temperatura, Boolean chuva) {
        this.temperatura = temperatura;
        this.chuva = chuva;
    }

    public Float getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Boolean getChuva() {
        return chuva;
    }
    public void setChuva(Boolean chuva) {
        this.chuva = chuva;
    }
}
