package list.carrinho_de_compras;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Itens> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Itens produto = new Itens(nome,preco,quantidade);
        produtos.add(produto);
    }

    public void removerIntem(String nome){
        List<Itens>itensParaExcluir = new ArrayList<>();
        for (Itens t : produtos){
            if (t.getNome().equalsIgnoreCase(nome)) {
                itensParaExcluir.add(t);
            }
        }
        produtos.removeAll(itensParaExcluir);
    }

    public void exibirItens(){
        System.out.println(produtos);
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!produtos.isEmpty()){
        for (Itens t : produtos){
            double precoIten = t.getPreco() * t.getQuantidade();
            valorTotal += precoIten;
        }
            return valorTotal;

        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }



}
