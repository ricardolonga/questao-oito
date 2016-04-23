package br.com.ricardolonga;

/**
 * Created by longa on 22/04/16.
 */
public class PagamentoAVistaStrategy implements CalculoStrategy {
    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getTotal() - (0.2 * pedido.getTotal());
    }
}
