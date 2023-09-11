package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {

    // atributo
    private List<Tarefa> tarefaList;


    // construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Metodos

    public void adicionarTarefa (String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tare : tarefaList){
            if (tare.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(tare);
        }
        tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    //testar
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 4");
        System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}








