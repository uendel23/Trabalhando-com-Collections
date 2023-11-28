package map.agenda_contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String,Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicinarContato(String nome, Integer telefone){
        contatosMap.put(nome, telefone);
    }

    public void removerContato (String nome){
        if (!contatosMap.isEmpty()){
            contatosMap.remove(nome);
        }
    }

    public void exibircContatos(){
        System.out.println(contatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPornome = null;
        if (!contatosMap.isEmpty()){
           numeroPornome = contatosMap.get(nome);

        }
        return numeroPornome;
    }

}
