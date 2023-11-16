package list.carrinho_de_compras;

public class Itens {

    private String nome;
    private double preco;
    private int quantidade;


    public Itens(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
       return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Itens{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
