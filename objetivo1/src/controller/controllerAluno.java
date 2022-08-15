package controller;

import model.Aluno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class controllerAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
            aluno1.setId(1);
            System.out.println(aluno1.getId());
            aluno1.setCpf(388183919);
            System.out.println(aluno1.getCpf());
            aluno1.setNome("Fransisco");
            System.out.println(aluno1.getNome());
            aluno1.setSobrenome("de Olveira dos Santos");
            System.out.println(aluno1.getSobrenome());
            aluno1.setEmail("foliveirasantos@gmail.com");
            System.out.println(aluno1.getEmail());

        System.out.println("\n\n");

        Aluno aluno2 = new Aluno();
            aluno2.setId(2);
        System.out.println(aluno2.getId());
            aluno2.setCpf(743819203);
        System.out.println(aluno2.getCpf());
            aluno2.setNome("Paola");
        System.out.println(aluno2.getNome());
            aluno2.setSobrenome("Cristina de Assis");
        System.out.println(aluno2.getSobrenome());
            aluno2.setEmail("poliveiraassis@gmail.com");
        System.out.println(aluno2.getEmail());

        Aluno aluno3 = new Aluno(3, 1234567891, "João", "Da Silva", "joaodasilva@gmail.com");
        Aluno aluno4 = new Aluno(4, 234567891, "Pedro", "de Almeida", "almeidapedro123@yahoo.com");
        Aluno aluno5 = new Aluno(5, "Carlos Ferreira");
        Aluno aluno6 = new Aluno(6, "Salvio Carvalho");

        // inserindo os alunos em uma lista chamada alunos
        System.out.println("\n\n");

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);

        System.out.println(alunos);

        System.out.println("\n\n");
        Aluno alunoBusca = alunos.stream().filter(a->a.equals(aluno5)).findAny().orElse(null);
        System.out.println(alunoBusca);

        System.out.println("\n\n");
        alunos.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunos);

        // fazendo um mapa com os alunos
        HashMap<Integer, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(aluno1.getId(), aluno1);
        alunosMap.put(aluno2.getId(), aluno2);
        alunosMap.put(aluno3.getId(), aluno3);
        alunosMap.put(aluno4.getId(), aluno4);
        alunosMap.put(aluno5.getId(), aluno5);
        alunosMap.put(aluno6.getId(), aluno6);

        System.out.println("\n\n Imprimindo o map de alunos");
        System.out.println(alunosMap);
        System.out.println("\n\nImprimindo o aluno de id 5 do map de alunos ");
        System.out.println(alunosMap.get(aluno5.getId()));



    }
}