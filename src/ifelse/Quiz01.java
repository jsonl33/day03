package ifelse;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		if (num == 0) {
			System.out.println("잘못 입력");
		}
		else if(num % 3 == 0 && num % 4 == 0) {
			System.out.println("3, 4의 배수");
		}
		else if(num % 3 == 0) {
			System.out.println("3의 배수");
		}
		else if(num % 4 == 0) {
			System.out.println("4의 배수");
		}
		else {
			System.out.println("배수 아님");
		}
		sc.close();
	}
}
