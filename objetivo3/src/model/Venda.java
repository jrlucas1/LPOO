package model;

import java.util.List;

public class Venda {
    private String id;
    private Pedido pedido;
    private Vendedor vendedor;
    private List<Item> itens;
    private Produto produto;

    public Venda(){}

    public Venda(String id, Pedido pedido) {
        this.id = id;
        this.pedido = pedido;
        this.vendedor = pedido.getVendedor();
        this.itens = pedido.getItens();
        this.produto = pedido.get
    }
}
