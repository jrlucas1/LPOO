package controller;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class lojaController {

    public static void main(String[] args) {
        Date data1 = new Date(10L);

        Produto produto1 = new Produto("1", "Lapis", 10, 1.5);
        Produto produto2 = new Produto("2", "Borracha", 15, 2.0);

        Item item1 = new Item("1", 0, produto1, 2);
        Item item2 = new Item("2", 0, produto2, 4);

        List<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        Vendedor vendedor1 = new Vendedor("1", "João", "Rua Uruguay", "Centro", "96010-630", "Pelotas", "RS", "Centro");
        Pedido pedido1 = new Pedido(1,data1, 10, Tipo.A, vendedor1, itens);

        Venda venda1 = new Venda("1", pedido1);

        System.out.println(venda1);

    }
}