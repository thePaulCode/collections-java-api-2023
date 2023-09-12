package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    // constructor

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    // metodos
    public void adicionarPessoa(String nome, int idade, double altura){

        pessoaList.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Stella", 10, 1.70);
        ordenacaoPessoa.adicionarPessoa("Isaac", 7, 1.75);
        ordenacaoPessoa.adicionarPessoa("Ana", 35, 1.55);
        ordenacaoPessoa.adicionarPessoa("Paulo", 36, 1.73);

        System.out.println(ordenacaoPessoa.pessoaList);

//        System.out.println(ordenacaoPessoa.ordenarPorIdade());
//       System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
