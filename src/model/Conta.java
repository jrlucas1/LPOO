package model;

public  abstract class Conta {
    protected double saldo;

    public void deposita (double saldo) {
        this.saldo += saldo;
    }

    public void saca (double saldo){
        if(saldo > 0){
            this.saldo -= saldo;
        }
        else{
            System.out.println("Você não tem saldo suficiente para fazer esta ação");
        }
    }
    public void atualiza (double taxa){
        this.saldo = this.saldo + (this.saldo * taxa/100);
    }

    public Conta(){}

    public Conta (double saldo){
        this.saldo = saldo;
    }
}
