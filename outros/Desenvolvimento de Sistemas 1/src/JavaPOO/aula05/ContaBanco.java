package JavaPOO.aula05;

import java.util.Scanner;

public class ContaBanco {
    public Integer numConta;
    protected Boolean tipo;
    private String dono;
    private Float saldo = 0f;
    private boolean status;

    public Scanner scanner = new Scanner(System.in);

//MÉTODOS NORMAIS
    public void abrirConta(Integer num, String tipoConta, String titular){
        constructor(num, titular);

        setTipo(tipoConta);

        setDono(titular);

        System.out.println("Seu Status é Desativada, gostaria de ativa-la? (sim/não)");
        setStatus(decisor(scanner.next()));

        getStatus();

        if(status){
            if (tipo){
                System.out.println("Você acaba de receber R$ 50 por abrir uma CONTA CORRENTE Conosco!");
                depositar(50f);
            }else{
                System.out.println("Você acaba de receber R$ 150 por abrir uma CONTA POUPANÇA Conosco!");
                depositar(150f);
            }
        }
    }

    public void fecharConta(String fC){
        boolean aux = decisor(fC);
        if (aux){
            if(saldo > 0){
                System.out.println("Para fechar a conta você precisa Sacar a quantia de R$ " + saldo);
                System.out.println("Deseja sacer todo seu dinheiro agora? (sim/não)");

            }else{
                //;
            }
        }
    }

    public void depositar(Float d){
        setSaldo(d, true);
    }

    public void sacar(Float s){
        float aux = s;
        if(aux < saldo){
            System.out.println("Você não tem saldo Sulficiente!");
        }else{
            setSaldo(-aux, true);
        }
    }

    public void pagarMensalidade(){
    }

//MÉTODOS ESPECIAIS
    public void constructor(Integer num, String titular){
        setNumConta(num);
        setStatus(false);
        setSaldo(0f, false);
        System.out.println("Está conta foi criada " + titular + ". O Numero de sua Conta é " + num);
    }

    public boolean decisor(String a){
        if (a.equals("sim")){
            return true;
        } else {
            return false;
        }
    }

    public void getnumConta(){
        System.out.println("Conta Nº: " + numConta);
    }
    public void setNumConta(Integer n){
        numConta = n;
    }

    public Boolean getTipo(){
        if (tipo) {
            System.out.println("Esta é uma conta CORRENTE");
            return tipo;
        } else {
            System.out.println("Esta é uma conta POUPANÇA");
            return tipo;
        }
    }
    public void setTipo(String t){
        if (t.equals("CC")) {
            this.tipo = true;
            System.out.println("Conta tipo CORRENTE configurada");
        } else {
            this.tipo = false;
            System.out.println("Conta tipo POUPANÇA configurada");
        }
    }

    public void getDono(){
        System.out.println("Titular: " + dono);
    }
    public void setDono(String d){
        this.dono = d;
    }

    public Float getSaldo(){
        System.out.println("Seu Saldo é R$" + saldo);
        return saldo;
    }
    public void setSaldo(Float s, boolean ini) {
        this.saldo = saldo + s;
        if(ini){
            getSaldo();
        }
    }

    public void getStatus(){
        if (status) {
            System.out.println("Esta conta está ATIVA");
        } else {
            System.out.println("Esta conta está DESATIVADA");
        }
    }
    public void setStatus(boolean s){
        this.status = s;
    }
}



