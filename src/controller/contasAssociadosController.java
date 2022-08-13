package controller;

import model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class contasAssociadosController {
    public static void main(String[] args) {
        Associado as1 = new Associado("Pedro", 100);
        Associado as2 = new Associado("José", 400);
        Associado as3 = new Associado("Paulo", 600);

        ContaCorrente cc1 = new ContaCorrente(1302.30);
        cc1.setQdeCotas(300);
        ContaCorrente cc2 = new ContaCorrente(1504.30);
        cc2.setQdeCotas(600);
        ContaCorrente cc3 = new ContaCorrente(650.60);
        cc3.setQdeCotas(600);

        ContaPoupanca cpp1 = new ContaPoupanca(10000);
        ContaPoupanca cpp2 = new ContaPoupanca(50000);
        ContaPoupanca cpp3 = new ContaPoupanca(17392.44);

        List<Conta> contas = new ArrayList<>();

        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        contas.add(cpp1);
        contas.add(cpp2);
        contas.add(cpp3);
        System.out.println(contas);

        List<AssociadoVip> associadoVips = new ArrayList<>();
        associadoVips.add(cc1);
        associadoVips.add(cc2);
        associadoVips.add(cc3);
        associadoVips.add(as1);
        associadoVips.add(as2);
        associadoVips.add(as3);


        System.out.println("\n\nAtulizando a conta poupança");
        cpp1.deposita(1000);
        System.out.println(cpp1);
        cpp1.saca(50);
        System.out.println(cpp1);
        cpp1.atualiza(5);
        System.out.println(cpp1);

        System.out.println("\n\nAtulizando a conta corrente");
        cc1.deposita(500);
        System.out.println(cc1);
        cc1.saca(400);
        System.out.println(cc1);

        System.out.println("\n\nAssociados Vip");
        System.out.println(associadoVips);

        System.out.println("\n\nImprimindo os associados ordenando pelo numero de cotas");
        associadoVips.sort(Comparator.comparing(AssociadoVip::getQdeCotas).reversed());
        System.out.println(associadoVips);

        System.out.println("\n\nImprimindo os associados com maior numero de cotas");
        double max_cotas = associadoVips.stream().max(Comparator.comparing(AssociadoVip::getQdeCotas)).get().getQdeCotas();
        for(AssociadoVip associado:associadoVips) {
            if (associado.getQdeCotas() == max_cotas) {
                System.out.println(associado);
            }
        }

        System.out.println("\n\nImprimindo as contas ordenadas pelo saldo");
        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println(contas);


        System.out.println("\n\nImprimindo apenas os associados vip com conta no sistema");
        for (AssociadoVip associado : associadoVips) {
            if (associado instanceof ContaCorrente) {
                System.out.println(associado);
            }
        }
    }
}