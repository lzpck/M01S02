package Exercicios;

/*
        Dado a lista de números:
        List<Integer> lista = Arrays.asList(1,2,3,4);
        Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio06 {
    public static void main(String[] args) {
//      Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> resposta = new ArrayList<>();

        for (Integer nros : lista){
            int triplo = nros * 3;
            resposta.add(triplo);
        }
        System.out.println("A lista inicial é: " + lista);
        System.out.println("O triplo da lista acima é: " + resposta);
    }
}
