import list.OperacoesBasicas.ListaTarefas;
import list.carrinho_de_compras.CarrinhoDeCompras;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) {

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

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("cadeira", 2.5, 5);
        carrinho.adicionarItem("mesa", 2.7, 5);
        carrinho.adicionarItem("teclado", 2.1, 5);


        carrinho.exibirItens();

        System.out.println(carrinho.calcularValorTotal());


        carrinho.removerIntem("cadeira");

        carrinho.exibirItens();




    }
}