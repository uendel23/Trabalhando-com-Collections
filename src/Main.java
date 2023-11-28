import map.agenda_contatos.AgendaContatos;

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
//        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
//        pessoa.adicionarPessoa("pessoa1", 20, 1.75);
//        pessoa.adicionarPessoa("pessoa2", 30, 1.80);
//        pessoa.adicionarPessoa("pessoa3", 25, 1.69);
//        pessoa.adicionarPessoa("pessoa4", 90, 1.53);
//        pessoa.adicionarPessoa("pessoa5", 17, 1.58);
//
//        System.out.println(pessoa.ordenarPorIdade());
//        System.out.println(pessoa.ordenarPorAltura());


        //LISTA DE SOMA DOS NUMEROS

//        SomaDeNumeros somaDeNumeros = new SomaDeNumeros();
//        somaDeNumeros.adicionarNumero(10);
//        somaDeNumeros.adicionarNumero(7);
//        somaDeNumeros.adicionarNumero(15);
//        somaDeNumeros.adicionarNumero(2);
//        somaDeNumeros.adicionarNumero(4);
//        somaDeNumeros.adicionarNumero(35);
//        somaDeNumeros.adicionarNumero(8);
//
//        somaDeNumeros.exibirNumeros();
//
//        System.out.println(somaDeNumeros.calcularSoma());
//
//        System.out.println(somaDeNumeros.encontrarMaiorNumero());
//        System.out.println(somaDeNumeros.encontrarMenorNumero());


        //SET CONVIDADOS

//        ConjuntoConvidado convidado = new ConjuntoConvidado();
//
//        convidado.adicionarConvidado("joao", 5);
//        convidado.adicionarConvidado("jose", 8);
//        convidado.adicionarConvidado("maria", 2);
//        convidado.adicionarConvidado("Carlos", 6);
//        convidado.adicionarConvidado("tainá", 1);
//        convidado.adicionarConvidado("joao", 4);
//
//        convidado.exibirConvidados();
//
//        convidado.removerConvidadoPorCodigoConvite(5);
//        convidado.removerConvidadoPorCodigoConvite(2);
//        convidado.removerConvidadoPorCodigoConvite(4);
//
//        convidado.exibirConvidados();


            //SET AGENDA DE CONTATOS//

//        AgendaContato contatos = new AgendaContato();
//
//        contatos.adicionarContato("maria", 123456789);
//        contatos.adicionarContato("pedro", 789456);
//        contatos.adicionarContato("carlos", 4561378);
//        contatos.adicionarContato("joao", 1789123456);
//
//        contatos.exibirContatos();
//
//        System.out.println(contatos.pesquisarPorNome("pedro"));
//
//        contatos.atualizarNumeroContato("pedro", 748889996);
//
//        System.out.println(contatos.pesquisarPorNome("pedro"));
//
//        contatos.removerContato(748889996);
//
//        contatos.exibirContatos();



            //SET CADASTRO DE PRODUTO

//        CadastroProduto produto = new CadastroProduto();
//
//        produto.adicionarProduto("teclado", 147, 45.82, 12);
//        produto.adicionarProduto("mouse", 124, 25.50, 10);
//        produto.adicionarProduto("monitor", 325, 1125.80, 25);
//        produto.adicionarProduto("fones", 111, 95.30, 10);
//
//        System.out.println(produto.exibirProdutoPorNome());
//        System.out.println(produto.exibirProdutoPorPreco());


        // MAP AGENDA DE CONTATOS


        AgendaContatos contatos = new AgendaContatos();
        contatos.adicinarContato("maria", 748885552);
        contatos.adicinarContato("João", 749995522);

        contatos.exibircContatos();

        System.out.println(contatos.pesquisarPorNome("maria"));

        contatos.removerContato("maria");

        contatos.exibircContatos();


    }
}