package map.agenda_de_eventos;

import java.lang.management.MemoryPoolMXBean;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeDoEvento, String NOmeDaAtracao){
        eventosMap.put(data, new Eventos(nomeDoEvento, NOmeDaAtracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Eventos> eventosThreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosThreeMap);
    }

    public void exibirProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Eventos> eventosThreeMap = new TreeMap<>(eventosMap);
        for (var entry : eventosThreeMap.entrySet()){
            if (entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("o próximo evento "+ entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }

    }

}
