package map.agenda_de_eventos;

public class Eventos {
    private String nomeDoEvento;
    private String nomeDaAtracao;

    public Eventos(String nomeDoEvento, String nomeDaAtracao) {
        this.nomeDoEvento = nomeDoEvento;
        this.nomeDaAtracao = nomeDaAtracao;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public String getNomeDaAtracao() {
        return nomeDaAtracao;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "nomeDoEvento='" + nomeDoEvento + '\'' +
                ", nomeDaAtração='" + nomeDaAtracao + '\'' +
                '}';
    }
}
