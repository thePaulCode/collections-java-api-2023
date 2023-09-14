package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributos

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos () {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome (String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    //TESTES

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Stella", 99102);
        agendaContatos.adicionarContato("Isaac", 99102);
        agendaContatos.adicionarContato("Paulo", 98475);
        agendaContatos.adicionarContato("Paulo", 98475);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Paulo");
        agendaContatos.exibirContatos();
        System.out.println("O número do contato é: " + agendaContatos.pesquisarPorNome("Stella"));
    }
}

// put e mp => tanto adiciona um elemento como também atualiza este elemento - replace

// set - não atualiza, permanece o primeiro elemento adicionado