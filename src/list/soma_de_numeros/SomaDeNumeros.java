package list.soma_de_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {

    private List<Numero> numeros = new ArrayList<>();

    public void adicionarNumero(int numero){
        numeros.add(new Numero(numero));
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
            if (n.getNumero() > maiorNumero){
                maiorNumero = n.getNumero();
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = 100;
        for (Numero n : numeros){
            if (n.getNumero() < menorNumero){
                menorNumero = n.getNumero();
            }
        }
        return menorNumero;
    }


    public void exibirNumeros(){
        System.out.println(numeros);
    }




}
