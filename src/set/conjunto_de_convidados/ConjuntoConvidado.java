package set.conjunto_de_convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadoSet = new HashSet<>();

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
      Convidado convidado = null;
        for (Convidado c: convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite){
                convidado = c;
                break;
            }
        }
        convidadoSet.remove(convidado);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


}
