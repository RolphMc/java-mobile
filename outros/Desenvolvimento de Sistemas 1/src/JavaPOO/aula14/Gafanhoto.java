package JavaPOO.aula14;

public class Gafanhoto extends Pessoa {
    private String login;
    private Integer totAssistido;

//M ESPECÍFICOS
    public void viuMaisUm(){
        this.setTotAssistido(getTotAssistido()+1);
    }
//M ESPECIAIS
    public Gafanhoto(String nome, Integer idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(Integer totAssistido) {
        this.totAssistido = totAssistido;
    }

//IMPLEMENTADO
    @Override
    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }
}
