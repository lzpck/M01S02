package Exercicios;

public class Solucao {
    public void calcular(Integer[] arr) {
        if (arr == null || arr.length == 0){
            System.out.println("Não é possível calcular");
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int i=0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("O menor número é: " + min);
        System.out.println("O maior número é: " + max);
    }
}
