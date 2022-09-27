package Exercicios;

import java.util.Arrays;
import java.util.List;

public class Exercicio08 {
    public static void main(String[] args) {
//        Localize na lista abaixo e imprima no console a primeira ocorrência de número maior que 50.

        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        Integer resultado = null;

        for (int i=0; i < numeros.size(); i++){
            Integer nro = numeros.get(i);
            if (nro > 50){
                resultado = nro;
                break;
            }
        }
        System.out.println("O primeiro número maior que cinquenta é: " + resultado);
    }
}
