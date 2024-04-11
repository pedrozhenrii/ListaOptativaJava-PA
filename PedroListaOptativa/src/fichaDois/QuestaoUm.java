package fichaDois;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num1 = ref.nextInt();
		System.out.println("Digite um número:");
		int num2 = ref.nextInt();
		int resultado = 0;
		resultado = num1 + num2;
		System.out.println("Soma: " + resultado);
	}
}
