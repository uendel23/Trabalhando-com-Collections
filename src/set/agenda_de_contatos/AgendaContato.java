package set.agenda_de_contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {

    private Set<Contato> contatosSet;

    public AgendaContato() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone){
        contatosSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatorPorNome = new HashSet<>();
        for (Contato c: contatosSet) {
            if (c.getNome().endsWith(nome)){
                contatorPorNome.add(c);
            }
        }

        return contatorPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public void removerContato(int numero){
        Contato contatoRemovido = null;
        for (Contato c: contatosSet) {
            if (c.getNumeroTelefone() == numero){
                contatoRemovido = c;
                break;
            }
        }
        contatosSet.remove(contatoRemovido);
    }
}
