package model;

public class ContaCorrente extends Conta implements AssociadoVip {
    private int qdeCotas;
    private double valorCota;
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    public ContaCorrente(){
        super();
    }

    public ContaCorrente(double saldo){
        super(saldo);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
