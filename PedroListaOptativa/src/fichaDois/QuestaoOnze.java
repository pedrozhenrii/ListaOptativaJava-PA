package fichaDois;

import java.util.Scanner;

public class QuestaoOnze {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		int f1 = 0;
		int f2 = 1;
		int r = 0;
		System.out.println("Digite o fim da sequência de Fibonacci:");
		int fim = ref.nextInt();
		while (f2 <= fim) {
			r = f1 + f2;
			System.out.println(f2);
			f1 = f2;
			f2 = r;
		}

	}

}
