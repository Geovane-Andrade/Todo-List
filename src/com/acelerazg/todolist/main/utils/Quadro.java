package com.acelerazg.todolist.main.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Quadro {

    Scanner teclado = new Scanner(System.in);

    List<Tarefa> listaDeTarefas = new ArrayList<>();

    public void adicionarTarefa() {
        System.out.println("Qual o nome da nova tarefa?");
        teclado.nextLine();
        String nome = teclado.nextLine();

        System.out.println("----------------------------");
        System.out.println("Qual o status da tarefa?\n" +
                "[Todo](À fazer)\n" +
                "[Doing](Fazendo)\n" +
                "[Done](Feito)");
        String status = teclado.nextLine();

        boolean resposta = true;
        while(resposta){
            switch (status.toLowerCase()) {
                case "todo": {
                    status = "Todo";
                    resposta = false;
                    break;
                }
                case "doing": {
                    status = "Doing";
                    resposta = false;
                    break;
                }
                case "done": {
                    status = "Done";
                    resposta = false;
                    break;
                }
                default: {
                    System.out.println("Valor inválido, digite todo, doing ou done.");
                    status = teclado.nextLine();
                    break;
                }
            }

        }
        System.out.println("----------------------------");
        System.out.println("Qual a categoria da tarefa?");
        String categoria = teclado.nextLine();

        System.out.println("----------------------------");
        System.out.println("Qual o descrição da tarefa?");
        String descricao = teclado.nextLine();

        System.out.println("----------------------------");
        System.out.println("Qual a data de término da tarefa?");
        String dataDeTermino = teclado.nextLine();

        System.out.println("----------------------------");
        System.out.println("Qual o nível de prioridade?  [1-5]");
        int nivelDePrioridade = teclado.nextInt();

        System.out.println("----------------------------");
        while (nivelDePrioridade < 1 || nivelDePrioridade > 5) {
            System.out.println("Valor inválido, digite um número entre 1 e 5.");
            nivelDePrioridade = teclado.nextInt();
            System.out.println("----------------------------");
        }

        listaDeTarefas.add(new Tarefa(nome, nivelDePrioridade, status, categoria, descricao, dataDeTermino));
    }


    public void listarTarefas() {
        System.out.println(listaDeTarefas);
    }

    public void listarTarefasPorPrioridade() {
        listaDeTarefas.sort(Comparator.comparing(Tarefa::getNivelDePrioridade ));
        System.out.println(listaDeTarefas);
    }
    public void listarTarefasPorCategoria() {
        listaDeTarefas.sort(Comparator.comparing(Tarefa::getCategoria ));
        System.out.println(listaDeTarefas);
    }
    public void listarTarefasPorStatus() {
        listaDeTarefas.sort(Comparator.comparing(Tarefa::getStatus));
        System.out.println(listaDeTarefas);
    }



    public void removerTarefaPorNome() {
        System.out.println("Qual o nome da tarefa a ser alterada?");
        teclado.nextLine();
        String tarefaParaRemover = teclado.nextLine();

        List<Tarefa> listaTarefasParaRemover = listaDeTarefas
                .stream()
                .filter((t) -> t.getNome().equals(tarefaParaRemover))
                .collect(Collectors.toList());
        listaDeTarefas.removeAll(listaTarefasParaRemover);

        System.out.println("Lista de tarefas alterada com sucesso!");
    }

    public void atualizarTarefaPorNome() {
        removerTarefaPorNome();
        adicionarTarefa();
        System.out.println("Tarefa atualizada com sucesso!");

    }

}

