package controller;

import model.Socio;
import org.mariadb.jdbc.internal.com.read.resultset.SelectResultSet;

import java.util.Scanner;

import static dao.SocioDAO.*;
import static java.lang.Integer.parseInt;
import static dao.CategoriaDAO.*;
public class socioController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        String teste = null;
        String name = null;
        Long id = null;

        Socio socio3 = new Socio();
        do {

            System.out.println("------- CLUBE -------\n" +
                    "1. Inserir socio\n" +
                    "2. Ver todos os socios\n" +
                    "3. Pesquisar socio pelo nome\n" +
                    "4. Pesquisar socio pelo id\n" +
                    "5. Deletar socio\n" +

                    "----------------------");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    teste = input.nextLine();
                    System.out.println("Informe o nome do socio que deseja inserir: ");
                    teste = input.nextLine();
                    socio3.setNome_socio(teste);
                    System.out.println("Informe o email do socio que deseja inserir: ");
                    teste = input.nextLine();
                    socio3.setEmail_socio(teste);
                    System.out.println("Informe o endereço do socio que deseja inserir: ");
                    teste = input.nextLine();
                    socio3.setEnd_socio(teste);
                    System.out.println("Informe o telefone do socio que deseja inserir: ");
                    teste = input.nextLine();
                    socio3.setTel_socio(teste);
                    System.out.println(selectCategoria());
                    System.out.println("Informe a categoria que deseja associar a esse socio");
                    id = input.nextLong();
                    socio3.setCategoria(id);
                    if(insertNewSocio(socio3))
                        System.out.println("O socio " + socio3 + "foi inserido com sucesso");
                    else
                        System.out.println("Houve um erro a inserir o socio.");
                    break;
                case 2:
                    System.out.println((selectSocios()));
                    break;
                case 3:
                    System.out.println("Informe o nome que deseja pesquisar:");
                    name = input.next();
                    System.out.println(selectSocioByName(name));
                    break;
                case 4:
                    System.out.println("Informe o id que deseja pesquisar:");
                    id = input.nextLong();
                    System.out.println(selectSocioById(id));
                    break;
                case 5:
                    System.out.println("Informe o id do socio que deseja deletar:");
                    id = input.nextLong();
                    System.out.println(deleteSocio(id));
                    System.out.println("O socio de id " + id + "foi deletado com sucesso");
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("Escolha uma opção valida.");
                    }
            }
        } while (opcao != 0);
    }
}
