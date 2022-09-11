package controller;

import model.Dependente;
import model.Socio;

import java.util.Scanner;

import static dao.DependenteDAO.*;

public class dependenteController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        String name = null;
        Long id = null;

        Dependente dependente3 = new Dependente();
        do {

            System.out.println("------- CLUBE -------\n" +
                    "1. Inserir dependente\n" +
                    "2. Ver todos os dependentes\n" +
                    "3. Pesquisar dependente pelo nome\n" +
                    "4. Pesquisar dependente pelo id do socio\n" +
                    "5. Deletar dependente\n" +

                    "----------------------");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:


                    if(insertNewDependente(dependente3))
                        System.out.println("O dependente " + dependente3 + "foi inserido com sucesso");
                    else
                        System.out.println("Houve um erro a inserir o dependente.");
                    break;
                case 2:
                    selectDependentes();
                    break;
                case 3:
                    System.out.println("Informe o nome que deseja pesquisar:");
                    name = input.next();
                    System.out.println(selectDependenteByName(name));
                    break;
                case 4:
                    System.out.println("Informe o id do socio que deseja pesquisar os dependentes:");
                    id = input.nextLong();
                    System.out.println(selectDependenteById(id));
                    break;
                case 5:
                    System.out.println("Informe o id do dependente que deseja deletar:");
                    id = input.nextLong();
                    System.out.println(deleteDependente(id));
                    System.out.println("O dependente de id " + id + "foi deletado com sucesso");
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("Escolha uma opção valida.");
                    }
            }
        } while (opcao != 0);
    }
}
