package model;

public class Item {
    private String codItem;
    private double desconto;
    private Produto produto;
    private int quantidade;
    private double valor;



    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValor() {
        return valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Item() {
    }

    public Item(String codItem, double desconto, Produto produto, int quantidade) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = produto.getPreco() * quantidade;

        if(produto.getQuantidade() >= quantidade){
            produto.setQuantidade(produto.getQuantidade() - quantidade);
        }
        else{
            throw new Excecoes.EstoqueInsuficienteException();
        }
    }

    @Override
    public String toString() {
        return "\nItem{" +
                "codItem='" + codItem + '\'' +
                ", desconto=" + desconto +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
