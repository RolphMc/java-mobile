package UdemyDevMaster.aula16;

public class QuantidadeCompra {
    private Integer produtos;
    private Float custo;

    public void validation (){
        if (this.getProdutos() >= 5){
            this.setCusto(2f);
        } else if (this.getProdutos() < 5){
            this.setCusto(2.5f);
        } else if(this.getProdutos() <= 0){
            this.setCusto(0f);
        }
    }

    public QuantidadeCompra(Integer produtos) {
        this.produtos = produtos;
    }

    public Integer getProdutos() {
        return produtos;
    }
    public void setProdutos(Integer produtos) {
        this.produtos = produtos;
    }

    public Float getCusto() {
        return custo;
    }
    public void setCusto(Float custo) {
        this.custo = custo;
    }
}
