package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    // atributos
    private Set<Contato> contatoSet;

    // constructor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
        }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    // TESTES

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Stella", 9102);
        agendaContatos.adicionarContato("Isaac", 8475);
        agendaContatos.adicionarContato("Paulo", 9839);
        agendaContatos.adicionarContato("Ana", 9964);
        agendaContatos.adicionarContato("Ana Andrade", 9912);
        agendaContatos.adicionarContato("Ana Andrade", 99124);

        agendaContatos.exibirContatos();

        agendaContatos.pesquisarPorNome("Ana");

        System.out.println("Contato atualizado: " +agendaContatos.atualizarNumeroContato("Ana Andrade", 314));

        agendaContatos.exibirContatos();
    }


}
