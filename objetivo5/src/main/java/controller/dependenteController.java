package controller;

import model.Dependente;
import model.Socio;

import java.util.Scanner;

import static dao.DependenteDAO.*;
import static dao.SocioDAO.selectSocios;

public class dependenteController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        String teste = null;
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
                    teste = input.nextLine();
                    System.out.println("Informe o nome do dependente que deseja inserir: ");
                    teste = input.nextLine();
                    dependente3.setNom_dep(teste);
                    System.out.println("Informe o email do dependente que deseja inserir: ");
                    teste = input.nextLine();
                    dependente3.setEmail_dep(teste);
                    System.out.println("Informe o endereço do socio que deseja inserir: ");
                    teste = input.nextLine();
                    dependente3.setParentesco(teste);

                    System.out.println(selectSocios());
                    System.out.println("Informe o socio que voce deseja associar a este dependente");
                    id = input.nextLong();
                    dependente3.setSocio(id);

                    if(insertNewDependente(dependente3))
                        System.out.println("O dependente " + dependente3 + "foi inserido com sucesso");
                    else
                        System.out.println("Houve um erro a inserir o dependente.");
                    break;
                case 2:
                    System.out.println(selectDependentes());
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
                    deleteDependente(id);
                    System.out.println("O dependente de id " + id + " foi deletado com sucesso");
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("Escolha uma opção valida.");
                    }
            }
        } while (opcao != 0);
    }
}
