public class DesafioAula02 {
    public static void main(String[] args) {
        double peso = 55;
        double altura = 1.75;
        double imc = peso / (altura * altura);

        System.out.println(String.format("IMC é = %.2f", imc));

        if (imc <= 18.5) {
            System.out.println("Sua classificação é de MAGREZA!");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Sua classificação é NORMAL!");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sua classificação é de SOBREPESO!");
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.println("Sua classificação é de OBESIDADE!");
        } else if (imc >= 40) {
            System.out.println("Sua classificação é de OBESIDADE GRAVE!");
        }
    }
}
