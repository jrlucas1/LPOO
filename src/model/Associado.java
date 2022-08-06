package model;

public class Associado  implements AssociadoVip{
    private String nome;
    private int qdeCotas;
    private double valorCota;

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        return qdeCotas * valorCota;
    }
}
