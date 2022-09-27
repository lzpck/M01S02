package Exercicios;

import java.util.Scanner;

/*
        Um palíndrome (ou palíndromo), segundo o dicionário Houaiss,
        "diz-se de frase ou palavra que se pode ler, indiferentemente, da esquerda para direita ou vice-versa", como por exemplo: osso, ana, radar.
        Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado.

        Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.
*/
public class Exercicio10 {
    public static void main(String[] args) {
        String original, reverso = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Insira uma palavra para checar se ela é palíndromo: ");
        original = in.nextLine();
        int tamanho = original.length();

        for (int i = tamanho - 1; i >= 0; i--){
            reverso += original.charAt(i);
        }

        boolean palindromo = true;
        for (int i = 0; i < tamanho; i++){
            if (original.charAt(i) != reverso.charAt(i)){
                palindromo = false;
            }
        }

        if (palindromo){
            System.out.println("A palavra informada É palíndromo!");
        } else {
            System.out.println("A palavra informada NÃO É palíndromo");
        }
    }
}
