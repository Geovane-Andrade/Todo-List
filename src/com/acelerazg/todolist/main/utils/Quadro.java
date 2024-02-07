package com.acelerazg.todolist.main.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Quadro {
    Scanner teclado = new Scanner(System.in);
    List<Tarefa> listaDeTarefas = new ArrayList<>();
    Tarefa tarefa = new Tarefa();
    public void adicionarTarefa(){
        System.out.println("Qual o nome da tarefa?");
        teclado.nextLine();
        String nome = teclado.nextLine();
        System.out.println("----------------------------");
        System.out.println("Qual o status da tarefa?" +
                "[Todo](À fazer)" +
                "[Doing](Fazendo)" +
                "[Done](Feito)");
        String status = teclado.nextLine();
        while (!status.equalsIgnoreCase("Todo") || !status.equalsIgnoreCase("Doing")
                || !status.equalsIgnoreCase("Done")) {
            System.out.println("Valor inválido, digite todo, doing ou done.");
            teclado.nextLine();
            status = teclado.nextLine();
            System.out.println("----------------------------");
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
    public void listarTarefas(){
        System.out.println(listaDeTarefas);
    }
    public void listarTarefasPorPrioridade(){
        listaDeTarefas.sort(tarefa);
        System.out.println(listaDeTarefas);
    }
    public void removerTarefaPorNome(){
        System.out.println("Qual o nome da tarefa que deseja remover?(Todas as tarefas de mesmo nome serão removidas!");
        teclado.nextLine();
        String tarefaParaRemover = teclado.nextLine();
        List<Tarefa> listaTarefasParaRemover = listaDeTarefas
                .stream()
                .filter((t) -> t.getNome().equals(tarefaParaRemover))
                .collect(Collectors.toList());
        listaDeTarefas.removeAll(listaTarefasParaRemover);
        System.out.println("Todas as tarefas de nome: " + tarefaParaRemover + " foram removidas!");
    }

}
