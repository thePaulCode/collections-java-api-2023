package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    // atributo
    private Map<Long, Produto> estoqueProdutosMap;

    // construtor

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    // metodos map -> put(key, value)
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        if (estoqueProdutosMap.isEmpty()) {
            System.out.println("O estoque está vazio. Adicione Produtos para continuar.");

        } else {

            System.out.println(estoqueProdutosMap);
        }
    }


    public double calcularValorProdutos() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) { // extrai somente os valores - não importa a key
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
            return valorTotalEstoque;
        } else {
            throw new RuntimeException("O estoque está vazio.");
        }

    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }


            }


        }

        return produtoMaisCaro;

    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double maisBarato = Double.MAX_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < maisBarato) {
                    produtoMaisBarato = p;
                    maisBarato = p.getPreco();
                }
            }

        }
        return produtoMaisBarato;

    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidade = null;
        double maiorValorTotalProdutosEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutosEstoque) {
                    maiorValorTotalProdutosEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidade = entry.getValue();
                }

            }
        }
        return produtoMaiorQuantidade;

    }


    //TESTES
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(4L, "Notebook", 1500.0, 1);
        estoque.adicionarProduto(2L, "Mouse", 25, 5);
        estoque.adicionarProduto(3L, "Monitor", 400.0, 5);
        estoque.adicionarProduto(1L, "Teclado", 40.0, 2);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

    }


}
