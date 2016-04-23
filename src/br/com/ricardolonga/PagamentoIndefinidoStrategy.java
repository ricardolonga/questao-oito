package br.com.ricardolonga;

/**
 * Created by longa on 22/04/16.
 */
public class PagamentoIndefinidoStrategy implements CalculoStrategy {
    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getTotal();
    }
}
