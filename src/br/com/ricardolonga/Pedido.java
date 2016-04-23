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
        return CalculoStrategy.create(formaPagamento).aplicarDesconto(this);
    }
    
}
