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
        if ("avista".equalsIgnoreCase(pagamento.getForma())) {
            return getTotal() - (0.2 * getTotal());
        } else if (getTotal() > 500) {
            return getTotal() - (0.15 * getTotal());
        } else if (getTotal() > 300) {
            return getTotal() - (0.1 * getTotal());
        }
        
        return getTotal();
    }
    
}
