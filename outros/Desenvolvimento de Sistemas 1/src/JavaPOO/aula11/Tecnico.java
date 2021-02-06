package JavaPOO.aula11;

public class Tecnico extends Aluno{
    private Integer registroProfissional;

//M ESPECIFICO
    public void praticar (){

    }

//M ESPECIAL
    public Integer getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(Integer registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
