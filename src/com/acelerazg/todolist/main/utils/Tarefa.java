package com.acelerazg.todolist.main.utils;

import java.util.Comparator;


public class Tarefa {
    private String nome;
    private Integer nivelDePrioridade;
    private String status;
    private String categoria;
    private String descricao;
    private String dataDeTermino;

    public Tarefa() {
    }

    public Tarefa(String nome, Integer nivelDePrioridade, String status, String categoria, String descricao, String dataDeTermino) {
        this.nome = nome;
        this.nivelDePrioridade = nivelDePrioridade;
        this.status = status;
        this.categoria = categoria;
        this.descricao = descricao;
        this.dataDeTermino = dataDeTermino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivelDePrioridade() {
        return nivelDePrioridade;
    }

    public void setNivelDePrioridade(Integer nivelDePrioridade) {
        this.nivelDePrioridade = nivelDePrioridade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeTermino() {
        return dataDeTermino;
    }

    public void setDataDeTermino(String dataDeTermino) {
        this.dataDeTermino = dataDeTermino;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nome='" + nome + '\'' +
                ", nivelDePrioridade=" + nivelDePrioridade +
                ", status='" + status + '\'' +
                ", categoria='" + categoria + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataDeTermino='" + dataDeTermino +
                '}';
    }


}
