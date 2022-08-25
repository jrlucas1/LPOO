package model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private Date data;
    private double valor;
    private Tipo tipo;
    private Vendedor vendedor;
    private List<Item> itens;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Pedido() {
    }

    public Pedido(int numero, Date data, double valor, Tipo tipo, Vendedor vendedor, List<Item> itens) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", vendedor=" + vendedor +
                ", itens=" + itens +
                '}';
    }
}
