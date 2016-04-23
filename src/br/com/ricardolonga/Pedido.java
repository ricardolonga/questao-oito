package br.com.ricardolonga;

import java.util.List;

/**
 * Created by longa on 24/02/15.
 */
public class Pedido {

    FormaPagamento formaPagamento;
    
    List<Item> itens;

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getTotal() {
        double total = 0;
        
        for (Item item : itens) {
            total += item.getValor();
        }
        
        return total;
    }
    
    public double getTotalComDesconto() {
        if (FormaPagamento.A_VISTA.equals(formaPagamento)) {
            return getTotal() - (0.2 * getTotal());
        }

        if (FormaPagamento.A_PRAZO.equals(formaPagamento)) {
            if (getTotal() > 500) {
                return getTotal() - (0.15 * getTotal());
            } else if (getTotal() > 300) {
                return getTotal() - (0.1 * getTotal());
            }
        }
        
        return getTotal();
    }
    
}
