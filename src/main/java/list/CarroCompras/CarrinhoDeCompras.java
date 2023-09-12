package main.java.list.CarroCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
   private List<Item> itemCarrinho;

    public CarrinhoDeCompras() {
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemCarrinho.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome){
        List<Item> removerItemPorNome = new ArrayList<>();
        if (!itemCarrinho.isEmpty()){
            for (Item nomeRetirar : itemCarrinho){
                if(nomeRetirar.getNome().equalsIgnoreCase(nome)){
                    removerItemPorNome.add(nomeRetirar);
                }

            }

            itemCarrinho.removeAll(removerItemPorNome);
        }
        else {
            System.out.println("O Carrinho está vazio.");
        }


    }


    public double  calcularValorTotal(){
        double valorTotal = 0d;

        if (!itemCarrinho.isEmpty()){
            for (Item item : itemCarrinho){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }

        else {
            throw new RuntimeException("A lista está vazia.");
        }

    }

    public void exibirItens(){

        if (!itemCarrinho.isEmpty())
        System.out.println("Itens no carrinho: " + itemCarrinho);
        else
            System.out.println("O carrinho está vazio.");
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carroAtual = new CarrinhoDeCompras();

       carroAtual.exibirItens();
       carroAtual.adicionarItem("Pao", 10.33, 8);
       carroAtual.adicionarItem("Manteiga", 6.00, 2);
       carroAtual.adicionarItem("Café", 18.49, 3);

       carroAtual.exibirItens();
       System.out.println("Valor total do carrinho: " + carroAtual.calcularValorTotal());

       carroAtual.removerItem("Pao");
       carroAtual.exibirItens();
       System.out.println("Valor total do carrinho: " + carroAtual.calcularValorTotal());

//     carroAtual.removerItem("");

    }

}
