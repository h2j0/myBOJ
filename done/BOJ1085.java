package BOJ.done;
import java.util.Scanner;

public class BOJ1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();

		// w-x, h-y, x, y중에 최소값 구하기
		int a = w - x;
		int b = h - y;
		int[] num = { a, b, x, y };

		int min = 987654321;
		for (int i = 0; i < 4; i++) {
			if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println(min);
	}
}
