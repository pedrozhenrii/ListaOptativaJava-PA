package fichaDois;

import java.io.PrintStream;
import java.util.Scanner;

public class QuestaoQuatro {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		int i = 1;
		System.out.println("Digite a quantidade de termos: ");
		int quant = ref.nextInt();
		
		while (i <= quant){
			System.out.println("Digite um número: ");
			int num = ref.nextInt();
			num+=num;
			i++;
		} 
	}
}