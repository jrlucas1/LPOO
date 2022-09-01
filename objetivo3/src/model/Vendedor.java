package model;

import java.util.List;

public class Vendedor extends Funcionario{

    private String local;
    private List<Pedido> pedidos;

    public Vendedor(String matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


}
