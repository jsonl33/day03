package ifelse;

public class Test02 {
	public static void main(String[] args) {
		int num = 150;
		if(num>100) {
			System.out.println("100보다 크다");
		}
		else if (num > 70) {
			System.out.println("70보다 크다");
		}
		else if (num > 40) {
			System.out.println("40보다 크다");
		}
		else {
			System.out.println("그 외의 값");
		}
	}
}
