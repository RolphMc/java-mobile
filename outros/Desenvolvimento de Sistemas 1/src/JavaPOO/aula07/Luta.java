package JavaPOO.aula07;

import java.util.Random;

public class Luta {
//ATRIBUTOS
    private Lutador desafiado; // tipo abstrato de dados - atributo de uma outra classe
    private Lutador desafiante; // tipo abstrato de dados
    private Integer rounds;
    private Boolean aprovada;
// INSTÂNCIAS
    Random random = new Random();

//MÉTODOS ESPECÍFICOS
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if(getAprovada()){
            int resultado;
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            resultado = random.nextInt(3);
            switch (resultado){
                case 0:
                    System.out.println("Luta Empatada");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome() + "Venceu a Luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome() + "Venceu a Luta");
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
        }else{
            System.out.println("Luta não pode acontecer!");
        }
    }

//MÉTODOS ESPECIAIS
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dd) {
        this.desafiante = dd;
    }

    public Integer getRounds() {
        return rounds;
    }

    public void setRounds(Integer rounds) {
        this.rounds = rounds;
    }

    public Boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(Boolean aprovada) {
        this.aprovada = aprovada;
    }
}
