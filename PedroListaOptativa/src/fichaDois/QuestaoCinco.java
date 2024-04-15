package fichaDois;

import java.util.Scanner;

public class QuestaoCinco {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Digite um ano:");
		int ano = ref.nextInt();
		
		if (ano %4 == 0) {
			System.out.println("É um ano bissexto!");
		}else {
			System.out.println("Não é um ano bissexto!");
		}
	}

}
