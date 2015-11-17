package br.com.ricardolonga;

/**
 * Created by longa on 17/11/15.
 */
public class FormaPagamentoStrategy implements Strategy {

    @Override
    public double calculaDesconto(Pedido pedido) {
        return pedido.getTotal() - (0.2 * pedido.getTotal());
    }

}
