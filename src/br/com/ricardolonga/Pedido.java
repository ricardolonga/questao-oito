package br.com.ricardolonga;

import java.util.List;

/**
 * Created by longa on 24/02/15.
 */
public class Pedido {

    FormaPagamento pagamento;
    
    List<Item> itens;

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public double getTotal() {
        double total = 0;
        
        for (Item item : itens) {
            total += item.getValor();
        }
        
        return total;
    }
    
    public double getTotalComDesconto() {
        Strategy descontoStrategy;

        if ("avista".equalsIgnoreCase(pagamento.getForma())) {
            descontoStrategy = new FormaPagamentoStrategy();
        } else {
            descontoStrategy = new ValorStrategy();
        }

        return descontoStrategy.calculaDesconto(this);
    }
    
}
