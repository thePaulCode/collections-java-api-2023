package main.java.list.OperacoesBasicas;

public class Tarefa {
    // atributo
    private String descricao;

    // construtor

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // retornar o valor da descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}











