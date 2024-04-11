package fichaDois;

import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num = ref.nextInt();
		int i = 1;
		int fat = 1;
		while (i <= num) {
			fat = fat * i;
			i++;
		}
		System.out.println("Seu fatorial é igual a: " + fat);
	}
}