package com.acelerazg.todolist.main.utils;

import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.Objects;

public class Tarefa {
    private String nome;
    private Integer nivelDePrioridade;
    private String status;
    private String categoria;
    private String descricao;
    private Date dataDeTermino;

    public Tarefa tarefa;

    public Tarefa() {
    }

    public Tarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Tarefa(String nome, Integer nivelDePrioridade, String status, String categoria, String descricao, Date dataDeTermino) {
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

    public Date getDataDeTermino() {
        return dataDeTermino;
    }

    public void setDataDeTermino(Date dataDeTermino) {
        this.dataDeTermino = dataDeTermino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(categoria, tarefa.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoria);
    }
    public void criarTarefa(){
        Tarefa tarefaCriada = this.tarefa;
    }
}
