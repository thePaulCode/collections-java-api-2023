package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributo
    private Map<LocalDate, Evento> eventoMap;

    //construtor

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    //metodos
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate> dateSet = eventoMap.keySet();
//        Collections<Evento> values = eventoMap.values();
        //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap); // eventos organizados
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet() ){
            if (entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey() );
                break;
            }
        }

    }
    //Testes
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.FEBRUARY, 07), "Nascimento", "Stella");
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.FEBRUARY, 21), "Nascimento", "Isaac");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER, 15), "Nascimento", "Paulo");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }

}
