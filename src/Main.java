import list.OperacoesBasicas.ListaTarefas;
import list.OrdenarPessoa.OrdenacaoPessoa;
import list.carrinho_de_compras.CarrinhoDeCompras;
import list.catalogo_de_livros.CatalogoLivros;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

        //LISTA DE TAREFAS

//        ListaTarefas tarefas = new ListaTarefas();
//        tarefas.adicionartarefa("tarefa 1");
//        tarefas.adicionartarefa("tarefa 2");
//
//        System.out.println("o numero total de elementos na tarefa é "+ tarefas.obterTotalDeTarefas());
//
//        //tarefas.removerTarefa("tarefa 2");
//
//        System.out.println("o numero total de elementos na tarefa é "+ tarefas.obterTotalDeTarefas());
//
//        tarefas.obterDescricoesTarefas();



        // CARRINHO DE COMPRAS

//        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
//        carrinho.adicionarItem("cadeira", 2.5, 5);
//        carrinho.adicionarItem("mesa", 2.7, 5);
//        carrinho.adicionarItem("teclado", 2.1, 5);
//        carrinho.exibirItens();
//        System.out.println(carrinho.calcularValorTotal());
//        carrinho.removerIntem("cadeira");
//        carrinho.exibirItens();

        //  LISTA DE LIVROS

//        CatalogoLivros livros = new CatalogoLivros();
//        livros.adicionarLivro("livro 1", "autor 1", 2020);
//        livros.adicionarLivro("livro 2", "autor 2", 2022);
//        livros.adicionarLivro("livro 3", "autor 3", 2024);
//        livros.adicionarLivro("livro 3", "autor 1", 2024);
//        livros.adicionarLivro("livro 3", "autor 1", 2025);
//        livros.adicionarLivro("livro 2", "autor 3", 2028);
//        livros.adicionarLivro("livro 1", "autor 3", 2029);
//
//        System.out.println(livros.pesquisarPorAutor("autor 3"));
//        System.out.println(livros.pesquisaIntervaloAnos(2020,2025));

            //LISTA DE PESSOAS
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
        pessoa.adicionarPessoa("pessoa1", 20, 1.75);
        pessoa.adicionarPessoa("pessoa2", 30, 1.80);
        pessoa.adicionarPessoa("pessoa3", 25, 1.69);
        pessoa.adicionarPessoa("pessoa4", 90, 1.53);
        pessoa.adicionarPessoa("pessoa5", 17, 1.58);

        System.out.println(pessoa.ordenarPorIdade());
        System.out.println(pessoa.ordenarPorAltura());

    }
}