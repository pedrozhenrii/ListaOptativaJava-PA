package fichaDois;

import java.util.Scanner;

public class QuestaoDez {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Digite um número:");
		double a = ref.nextDouble();
		System.out.println("Digite um número:");
		double b = ref.nextDouble();
		System.out.println("Digite um número:");
		double c = ref.nextDouble();
		if(a == b && b == c && a == c) {
			System.out.println("Esse triângulo é equilátero.");
		}
		else if(a != b && b != c && a != c) {
			System.out.println("Esse triângulo é escaleno");
		}
		else {
			System.out.println("Esse triângulo é isósceles");
		}

	}

}
