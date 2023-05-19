package ifelse;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (0<num && num<100) {
			System.out.println("정상");
		}
		else {
			System.out.println("비정상");
		}
		sc.close();
	}
}
