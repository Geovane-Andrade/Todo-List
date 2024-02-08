package com.acelerazg.todolist.main;

import com.acelerazg.todolist.main.utils.Quadro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        perguntar();
    }

    public static void perguntar() {
        Scanner teclado = new Scanner(System.in);
        Quadro quadro = new Quadro();

        System.out.println("Seja bem vindo! Gostaria de reproduzir o Todo-List? [S/N]");
        String reproduz = teclado.next();

        while (reproduz.equalsIgnoreCase("S")) {
            System.out.println("----------------------------------------------");
            System.out.println("Seja bem vindo! Digite o número de acordo com o que deseja: \n" +
                    "[1] Criar tarefa\n" +
                    "[2] Listar todas as tarefas adicionadas\n" +
                    "[3] Listar tarefas por prioridade\n" +
                    "[4] Listar tarefas por categoria\n" +
                    "[5] Listar tarefas por status\n" +
                    "[6] Remover tarefa por nome\n" +
                    "[7] Atualizar tarefa por nome\n" +
                    "[8] Encerrar programa."
            );
            int resposta = teclado.nextInt();
            System.out.println("----------------------------------------------");
            switch (resposta) {
                case 1: {
                    quadro.adicionarTarefa();
                    break;
                }
                case 2: {
                    quadro.listarTarefas();
                    break;
                }
                case 3: {
                    quadro.listarTarefasPorPrioridade();
                    break;
                }
                case 4: {
                    quadro.listarTarefasPorCategoria();
                    break;
                }
                case 5: {
                    quadro.listarTarefasPorStatus();
                    break;
                }
                case 6: {
                    quadro.removerTarefaPorNome();
                    break;
                }
                case 7:{
                    quadro.atualizarTarefaPorNome();
                    break;
                }
                case 8: {
                    reproduz = "n";
                    System.out.println("Encerrando...");
                    break;
                }
                default: {
                    System.out.println("Digite um número válido.");
                }
            }
        }
        if (reproduz.equalsIgnoreCase("n")) System.out.println("Até a próxima!");
    }


}
