package fichaDois;

import java.util.Scanner;

public class QuestaoSeis {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = ref.nextInt();
		if(num %2 == 0 && num/2 == 1){
			System.out.println(num + " é potência de dois");
		}else {
			System.out.println(num + " não é potência de dois");
		}
		} 
}
