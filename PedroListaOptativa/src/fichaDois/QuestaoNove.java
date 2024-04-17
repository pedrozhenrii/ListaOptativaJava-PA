package fichaDois;

import java.util.Scanner;

public class QuestaoNove {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int quadrado = 0;
		System.out.println("Digite um número:");
		num1 = ref.nextInt();
		System.out.println("Digite um número:");
		num2 = ref.nextInt();
		quadrado = ((num1*num1)+(2*num1*num2)+(num2*num2));
		System.out.println("A soma do quadrado dos números digitados pelo usuário é: "+ quadrado);
	}

}
