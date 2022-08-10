package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class contasAssociadosController {
    public static void main(String[] args) {
        Associado as1 = new Associado("Pedro");
        Associado as2 = new Associado("José");
        Associado as3 = new Associado("Paulo");

        ContaCorrente cc1 = new ContaCorrente(1302.30);
        ContaCorrente cc2 = new ContaCorrente(1504.30);
        ContaCorrente cc3 = new ContaCorrente(650.60);

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
        associadoVips.add(cc2);
        associadoVips.add(cc3);
        associadoVips.add(as1);
        associadoVips.add(as2);
        associadoVips.add(as3);
        System.out.println(associadoVips);

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

        System.out.println("\n\nInserindo cotas aos associados vips");

    }
}