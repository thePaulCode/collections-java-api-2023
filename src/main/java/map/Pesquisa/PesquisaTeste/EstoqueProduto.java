package main.java.map.Pesquisa.PesquisaTeste;

import main.java.map.Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    //atributos
    private Map<Long, Produto> estoqueProdutos;

    //construtor


    public EstoqueProduto() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        estoqueProdutos.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque() {

        double valorTotalEstoque = 0d;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto p : estoqueProdutos.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoValorMaisCaro = null;
        double maisCaro = Double.MIN_VALUE;

        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() > maisCaro){
                    produtoValorMaisCaro = p;
                    maisCaro = p.getPreco();
                }
            }
        }
        return produtoValorMaisCaro;

    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoValorMaisBarato = null;
        double maisBarato = Double.MAX_VALUE;

        if (!estoqueProdutos.isEmpty()){
            for (Produto p : estoqueProdutos.values()){
                if (p.getPreco() < maisBarato){
                    produtoValorMaisBarato = p;
                    maisBarato = p.getPreco();
                }
            }
        }
        return produtoValorMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidade = null;
        double maiorValorNoEstoque = 0d;
        if (!estoqueProdutos.isEmpty()){
            for (Map.Entry<Long, Produto> entry : estoqueProdutos.entrySet()){

                double valorProdutoNoEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoNoEstoque > maiorValorNoEstoque) {
                    maiorValorNoEstoque = valorProdutoNoEstoque;
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
        estoque.adicionarProduto(2L, "Mouse", 25, 500);
        estoque.adicionarProduto(3L, "Monitor", 400.0, 5);
        estoque.adicionarProduto(1L, "Teclado", 69.0, 2);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcular valor total do estoque
       // System.out.println("Valor total do estoque é: R$ " + estoque.calcularValorProdutos());

        // Obter Produto Mais Caro
       // System.out.println(estoque.obterProdutoMaisCaro());

        // Obter Produto Mais Barato
       // System.out.println(estoque.obterProdutoMaisBarato());

        // obterProdutoMaiorQuantidadeValorTotalNoEstoque
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }

}
