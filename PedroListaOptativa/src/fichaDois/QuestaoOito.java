package fichaDois;

import java.util.Scanner;

public class QuestaoOito {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = ref.nextInt();
		int raiz = (int) Math.cbrt(num);
		System.out.println("O número: " + num + " ,tem como raiz cúbica: " + raiz );
	}

}
