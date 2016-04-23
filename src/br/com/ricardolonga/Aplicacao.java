package br.com.ricardolonga;


import java.util.Arrays;

public class Aplicacao {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        
        pedido.setItens(Arrays.asList(new Item(5), new Item(180), new Item(290), new Item(29)));

        System.out.println("Total da compra: " + pedido.getTotal());

        pedido.setFormaPagamento(FormaPagamento.A_PRAZO);
        System.out.println("Total da compra a prazo: " + pedido.getTotalComDesconto());

        pedido.setFormaPagamento(FormaPagamento.A_VISTA);
        System.out.println("Total da compra a vista: " + pedido.getTotalComDesconto());
    }

}