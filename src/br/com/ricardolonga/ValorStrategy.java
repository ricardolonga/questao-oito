package br.com.ricardolonga;

/**
 * Created by longa on 17/11/15.
 */
public class ValorStrategy implements Strategy {

    @Override
    public double calculaDesconto(Pedido pedido) {
        double total = pedido.getTotal();

        if (total > 500) {
            return total - (0.15 * total);
        }

        if (total > 300) {
            return total - (0.1 * total);
        }

        return total;
    }

}
