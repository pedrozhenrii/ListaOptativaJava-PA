package fichaDois;

import java.util.Scanner;
public class QuestaoDois {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Digite um número:");
		int num = ref.nextInt();
		int resultado = 0;
		resultado = num % 2;
		if(resultado == 0 ) {
			System.out.println("O seu número é par");
		}else{
			System.out.println("O seu número é impar");
		}
	}
}
