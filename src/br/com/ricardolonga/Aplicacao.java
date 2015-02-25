package br.com.ricardolonga;


import java.util.Arrays;

public class Aplicacao {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        
        pedido.setItens(Arrays.asList(new Item(5), new Item(180), new Item(290), new Item(29)));
        pedido.setPagamento(new FormaPagamento("avista"));

        System.out.println(pedido.getTotal());
        System.out.println(pedido.getTotalComDesconto());
    }

}