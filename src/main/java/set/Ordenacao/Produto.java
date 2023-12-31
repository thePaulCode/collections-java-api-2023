package main.java.set.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto>{

    // atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    // construtor

    public Produto(long codigo, String nome, double preco, int quantidade) {

        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // comparacao por nome - organizar
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    // comparacao por codigo


    // getters

    public String getNome() {
        return nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    // toString


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }



}
