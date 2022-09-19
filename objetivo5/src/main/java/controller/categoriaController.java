package controller;

import model.Categoria;
import model.Dependente;

import java.util.Scanner;

import static dao.CategoriaDAO.insertNewCategoria;
import static dao.CategoriaDAO.selectCategoria;
import static dao.DependenteDAO.*;
import static dao.SocioDAO.selectSocios;

public class categoriaController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        String teste = null;
        String name = null;
        Long id = null;

        Categoria categoria = new Categoria();
        do {

            System.out.println("------- CLUBE -------\n" +
                    "1. Inserir categoria\n" +
                    "2. Ver todas as categorias\n" +

                    "----------------------");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    teste = input.nextLine();
                    System.out.println("Informe a descricao da categoria que deseja inserir: ");
                    teste = input.nextLine();
                    categoria.setDes_cat(teste);

                    if(insertNewCategoria(categoria))
                        System.out.println("A categoria " + categoria + "foi inserido com sucesso");
                    else
                        System.out.println("Houve um erro a inserir a categoria.");
                    break;
                case 2:
                    System.out.println(selectCategoria());
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("Escolha uma opção valida.");
                    }
            }
        } while (opcao != 0);
    }
}
