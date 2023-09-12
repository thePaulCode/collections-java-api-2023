package main.java.set.Ordenacao;

import java.util.*;
import java.util.Set;

public class CadastroProdutos  {

    // atributos
    private Set<Produto> produtoSet;


    // construtor hashSet

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    // metodos
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        if (!produtoSet.isEmpty()){
            return produtosPorNome;
        }
        else {
            throw  new RuntimeException("O conjunto está vazio.");

        }

    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()){
            produtosPorPreco.addAll(produtoSet);
            return  produtosPorPreco;
        }
        else {
            throw new RuntimeException("O conjunto está vazio.");
        }

    }

    public int exibirQuantidadeProdutos(){
        return produtoSet.size();
    }


    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "bAlicate", 55, 8);
        cadastroProdutos.adicionarProduto(2L, "aFita", 6, 10);
        cadastroProdutos.adicionarProduto(2L, "dFenda", 10.50, 2);
        cadastroProdutos.adicionarProduto(4L, "cPhilips", 9.50, 1);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirQuantidadeProdutos());

    }

}

class ComparatorPorPreco implements Comparator<Produto> {


    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}


