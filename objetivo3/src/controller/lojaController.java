package controller;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class lojaController {

    public static void main(String[] args) {
        Date data1 = new Date(10L);
        //Adicionando os produtos
        Produto produto1 = new Produto("1", "Lapis", 10, 1.5);
        Produto produto2 = new Produto("2", "Borracha", 15, 2.0);
        System.out.println(produto1);
        System.out.println(produto2);
        // lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);

        //Adicionando items
        Item item1 = new Item("1", 0, produto1, 2);
        Item item2 = new Item("2", 0, produto2, 4);

        //Adicionando a lista itens
        List<Item> itens1 = new ArrayList<>();
        itens1.add(item1);
        itens1.add(item2);

        List<Item> itens2 = new ArrayList<>();
        itens2.add(item1);
        //Adicionando vendedor
        Vendedor vendedor1 = new Vendedor("1", "João", "Rua Uruguay", "Centro", "96010-630", "Pelotas", "RS", "Centro");

        //Fazendo os pedidos
        Pedido pedido1 = new Pedido(1,data1, 10, Tipo.A, vendedor1, itens1);
        Pedido pedido2 = new Pedido(2,data1, 11, Tipo.A, vendedor1, itens2);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        vendedor1.setPedidos(pedidos);

        System.out.println(pedidos);

        //Criando o fornecedor
        Fornecedor fornecedor1 = new Fornecedor("123", "email@email.com", "Loja", produtos);

        //Fazendo o fornecimento
        Fornecimento fornecimento1 = new Fornecimento(data1,15, produto1, fornecedor1, 10);
        Fornecimento fornecimento2 = new Fornecimento(data1,30, produto2, fornecedor1, 15);


        //Fazendo a lista de fornecimentos
        System.out.println("\n\nImprindo os produtos pós fornecimento e os fornecimentos");
        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimento1);
        fornecimentos.add(fornecimento2);
        System.out.println(produto1);
        System.out.println(produto2);

        System.out.println(fornecimentos);
        double soma = 0;
        for (Fornecimento fornecimento:fornecimentos) {
            soma +=  fornecimento.getValorTotal();
        }
        System.out.println("Total do fornecimento: R$" + soma);

    }
}