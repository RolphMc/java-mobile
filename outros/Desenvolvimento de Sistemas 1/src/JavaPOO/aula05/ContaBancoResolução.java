package JavaPOO.aula05;

public class ContaBancoResolução {
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private Boolean status;

//MÉTODOS ESPECÍFICOS:
    public void estadoAtual(){
        System.out.println("-------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t.equals("CC")){
            this.setSaldo(50f);
        } if(t.equals("CP")) {
            this.setSaldo(150f);
        }
        System.out.println("Conta Criada com Sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo()>0f){
            System.out.println("Conta com dinheiro");
        }if(this.getSaldo()<0f){
            System.out.println("Conta em Débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(Float d){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+d);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Conta não está ativa");
        }
    }
    public void sacar(Float s){
        if(this.getStatus()){
            if(this.getSaldo() >= s){
                this.setSaldo(this.getSaldo() - s);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Você não tem saldo sulficiente");
            }
        }else{
            System.out.println("Conta não está ativa");
        }
    }
    public void pagarMensal(){
        if(getStatus()){
            int aux = 0;
            if(getTipo().equals("CC")){
                aux = 20;
            }if(getTipo().equals("CP")){
                aux = 12;
            }
            if(this.getSaldo() >= aux) {
                this.setSaldo(this.getSaldo() - aux);
            }else {
                System.out.println("Você não tem saldo sulficiente");
            }
        }else{
            System.out.println("Conta não está ativa");
        }

    }

//MÉTODOS ESPECIAIS:

    public ContaBancoResolução() {
        this.setSaldo(0f); this.setStatus(false);
    }
    public void setNumConta(Integer n){
        this.numConta = n;
    }
    public Integer getNumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(Float s){
        this.saldo = s;
    }
    public Float getSaldo(){
        return this.saldo;
    }
    public void setStatus(Boolean s){
        this.status = s;
    }
    public Boolean getStatus(){
        return this.status;
    }

}
