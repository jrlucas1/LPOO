package controller;

import java.util.Scanner;

public class menuController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {

        System.out.println("------- CLUBE -------\n" +
                "1. Manter socios\n" +
                "2. Manter dependentes\n" +
                "3. Manter categoria\n" +
                "4. Manter mensalidade\n");

        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                socioController.main(null);
                break;
            case 2:
                dependenteController.main(null);
                break;
            case 3:
                System.out.println("Wip");
                break;
            case 4:
                System.out.println("Wip");
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Escolha uma opção valida.");
                }
             }
        } while (opcao != 0);

        System.out.println("Aplicação finalizada.");
    }
}