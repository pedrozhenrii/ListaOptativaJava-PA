package fichaDois;

import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = ref.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = ref.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = ref.nextDouble();

        double maiorNumero;

        if (num1 > num2 && num1 > num3) {
            maiorNumero = num1;
        } else if (num2 > num1 && num2 > num3) {
            maiorNumero = num2;
        } else {
            maiorNumero = num3;
        }
        
        System.out.println("O maior número é: " + maiorNumero);
    }
}