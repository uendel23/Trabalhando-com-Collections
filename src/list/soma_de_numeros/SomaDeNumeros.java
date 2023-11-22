package list.soma_de_numeros;

import java.util.List;

public class SomaDeNumeros {

    private List<Numero> numeros;

    public void adicionarNumero(Numero numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int numerosTotais= 0;
        for(Numero n : numeros){
           int numero=  n.getNumero();

           numerosTotais += numero;
        }
        return numerosTotais;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        for (Numero n : numeros){
            if (n.getNumero() < maiorNumero){
                maiorNumero = n.getNumero();
            }
        }
        return maiorNumero;
    }


}
