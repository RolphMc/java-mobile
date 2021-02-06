import java.util.Date;
/**
 Eventos Balance:
     Abrir activit:
         - Carregar mês e ano atual como referência;
         - Listar as Os's executadas até momento atual;
         - Listar Registros de Transações até o momento;
 On click:
     - Executar Balanço
         - Carregar mês e ano selecionado;
         - Listar as Os's do mês selecionado;
         - Listar todos os registros de transações do mês selecionado;
         - Listar as ordesn de pagamento necessárias.
     - Gerar ordem de pagamento:
         - Enviar valor de tributo para processo Transaction.
 */

public interface BalanceInterface {
    public abstract void monthRef();
    public abstract void yearRef();
    public abstract void generateOrder();
    public abstract void requestServiceOrders();
    public abstract void requestTransations();
    public abstract void requestFutureOrders();
}


