package model;

import java.util.Date;

public class Fornecimento {
    private Date data;
    private double valorTotal;
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;

    public Fornecimento() {
    }

    public Fornecimento(Date data, double valorTotal, Produto produto, Fornecedor fornecedor, int quantidade) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.produto = produto;
        this.fornecedor = fornecedor;

        produto.setQuantidade(produto.getQuantidade() + quantidade);
    }
}
