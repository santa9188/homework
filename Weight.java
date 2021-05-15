import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, answer;

		System.out.print("키를 입력하시오: ");
		x = sc.nextInt();
		
		System.out.print("몸무게를 입력하시오: ");
		y = sc.nextInt();
		
		answer = y / (x / 10) * (x / 10);
		
		System.out.println(answer);
	}
}
