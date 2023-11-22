package list.OrdenarPessoa;

import java.util.*;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPoraAltura = new ArrayList<>(pessoaList);
     Collections.sort(pessoasPoraAltura, new comparatorPorAltura());
     return pessoasPoraAltura;
}



    class comparatorPorAltura implements Comparator<Pessoa>{
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return Double.compare(p1.getAltura(), p2.getAltura());
        }


    }
    }
