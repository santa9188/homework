import java.util.Scanner;

public class Weight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, answer;

		System.out.print("Ű�� �Է��Ͻÿ�: ");
		x = sc.nextInt();
		
		System.out.print("�����Ը� �Է��Ͻÿ�: ");
		y = sc.nextInt();
		
		answer = y / (x / 10) * (x / 10);
		
		System.out.println(answer);
	}
}
