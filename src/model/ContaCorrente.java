package model;

public class ContaCorrente extends Conta implements AssociadoVip {
    private int qdeCotas;
    private double valorCota;
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }

    public ContaCorrente(){
        super();
    }

    public ContaCorrente(double saldo){
        super(saldo);
    }
}
