package model;

public class Associado  implements AssociadoVip{
    private String nome;
    private int qdeCotas;
    private double valorCota;

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    public Associado(){}
    public Associado(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "nome='" + nome + '\'' +
                ", qdeCotas=" + qdeCotas +
                ", valorCota=" + valorCota +
                '}';
    }
}
