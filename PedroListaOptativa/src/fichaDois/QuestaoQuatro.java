package fichaDois;

import java.io.PrintStream;
import java.util.Scanner;

public class QuestaoQuatro {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		int i = 1;
		double soma = 0;
		System.out.println("Digite a quantidade de termos: ");
		int quant = ref.nextInt();
		
		while (i <= quant){
			System.out.println("Digite um número: ");
			soma += ref.nextInt();
			i++;
		}
		double media = soma/quant;
		System.out.println("\nA média dos números escolhidos é: " + media);
	}
}