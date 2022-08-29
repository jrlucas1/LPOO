package controller;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();

        List<Item> itens = new ArrayList<>();

        Produto produto1 = new Produto("1", "Celular", 2, 400);

        Item item1 = new Item("1", 0, produto1, 2);
        itens.add(item1);

        Pedido pedido1 = new Pedido(1, new Date() , 3.5, Tipo.A, vendedor1, itens);
        System.out.println(pedido1);
        pedido1.setTipo(Tipo.P);
        System.out.println(pedido1);


        Venda venda1 = new Venda("1", pedido1);
        System.out.println(venda1);


    }
}