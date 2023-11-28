package map.estoque_de_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueDeProdutos {

    private Map<Long, Produto> produtosMap;

    public EstoqueDeProdutos() {
        this.produtosMap = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco){
        produtosMap.put(codigo, new Produto(nome,quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtosMap);
    }

    public double calcularValorTotalDoEstoque(){
        double valorTotal = 0d;
        if (!produtosMap.isEmpty()){
            for(Produto p : produtosMap.values()){
               valorTotal += p.getPreco() * p.getQuantidade();
            }
        }

        return valorTotal;
    }

    public Produto obterValorMaisAlto(){
        Produto produtoMaisCaro = null;
        double valorMaisAlto = Double.MIN_VALUE;
        if(!produtosMap.isEmpty()){
            for(Produto p : produtosMap.values()){
                if (p.getPreco() > valorMaisAlto){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
