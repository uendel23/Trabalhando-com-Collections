package list.catalogo_de_livros;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributos
    private List<Livro> livrosList;

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro>livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro livro : livrosList){
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro>livrosPorAno = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livro livro: livrosList){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitul(String titulo){
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()){
            for (Livro l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                }
            }
        }
        return livroPorTitulo;
    }


}
