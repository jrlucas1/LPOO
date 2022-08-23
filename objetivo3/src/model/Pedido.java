package model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private Date data;
    private double valor;
    private String Tipo;
    private Vendedor vendedor;
    private List<Item> itens;
}
