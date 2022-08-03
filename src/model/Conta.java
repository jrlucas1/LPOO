package model;

public  abstract class Conta {
    float saldo;

    public void deposita (float saldo) {
        this.saldo += saldo;
    }

    public void saca (float saldo){
        if(saldo > 0){
            this.saldo -= saldo;
        }
        else{
            System.out.println("Você não tem saldo suficiente para fazer esta ação");
        }
    }
    public void atualiza (float taxa){
        this.saldo = this.saldo + (this.saldo * taxa/100);
    }

    public Conta(){}

    public Conta (float saldo){
        this.saldo = saldo;
    }
}
