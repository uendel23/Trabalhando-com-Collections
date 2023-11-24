package set.cadastro_de_produtos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtosSet;

    public CadastroProduto() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigo, double preco, int quantidade){
        produtosSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> exibirPorProduto = new TreeSet<>(produtosSet);
        return exibirPorProduto;
    }

    public  Set<Produto> exibirProdutoPorPreco (){
        Set<Produto> exibirPorPreco = new TreeSet<>(new CompararPorPreco());
        exibirPorPreco.addAll(produtosSet);
        return exibirPorPreco;
    }

}




