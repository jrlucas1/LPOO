package model;

import java.util.Calendar;

public class Mensalidade {
    private Calendar data_mens;
    private double valor_mens;
    private Calendar data_pgto_mens;
    private double juros_mens;
    private double valor_pago;
    private double quit_mens;


    public Calendar getData_mens() {
        return data_mens;
    }

    public void setData_mens(Calendar data_mens) {
        this.data_mens = data_mens;
    }

    public double getValor_mens() {
        return valor_mens;
    }

    public void setValor_mens(double valor_mens) {
        this.valor_mens = valor_mens;
    }

    public Calendar getData_pgto_mens() {
        return data_pgto_mens;
    }

    public void setData_pgto_mens(Calendar data_pgto_mens) {
        this.data_pgto_mens = data_pgto_mens;
    }

    public double getJuros_mens() {
        return juros_mens;
    }

    public void setJuros_mens(double juros_mens) {
        this.juros_mens = juros_mens;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    public double getQuit_mens() {
        return quit_mens;
    }

    public void setQuit_mens(double quit_mens) {
        this.quit_mens = quit_mens;
    }
}
