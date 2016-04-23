package br.com.ricardolonga;

/**
 * Created by longa on 22/04/16.
 */
public interface CalculoStrategy {

    double aplicarDesconto(Pedido pedido);

    static CalculoStrategy create(FormaPagamento formaPagamento) {
        if (FormaPagamento.A_VISTA.equals(formaPagamento)) {
            return new PagamentoAVistaStrategy();
        }

        if (FormaPagamento.A_PRAZO.equals(formaPagamento)) {
            return new PagamentoParceladoStrategy();
        }

        return new PagamentoIndefinidoStrategy();
    }

}
