package br.com.ricardolonga;

/**
 * Created by longa on 22/04/16.
 */
public class PagamentoParceladoStrategy implements CalculoStrategy {
    @Override
    public double aplicarDesconto(Pedido pedido) {
        double total = pedido.getTotal();

        if (total > 500) {
            return total - (0.15 * total);
        } else if (total > 300) {
            return total - (0.1 * total);
        }

        return total;
    }
}
