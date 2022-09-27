package Exercicios;

/*
        Implemente uma função 'calcular' que receba como parâmetro um array (numérico) e identifique o maior e menor valor do mesmo.
        Imprima no console estes valores ou "Não é possível calcular" qdo não for possível.
*/

public class Exercicio05 {
    public static void main(String[] args) {
        Integer[][] lista = {
                {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47},
                {1},
                {1, -1},
                null,
                {-2, -2, -2, -2},
                {20, 10, 30},
        };

        Solucao eh = new Solucao();
        for (int i = 0; i < lista.length; i++) {
            eh.calcular(lista[i]);
            System.out.println();
        }
    }
}
