package BOJ.done;
import java.util.Scanner;

public class BOJ1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for (int i = 10; i <= n; i++) {
			int a = i / 100;
//			System.out.println(a);
			int b = (i - a * 100) / 10;
//			System.out.println(b);
			int c = i - a * 100 - b * 10;
//			System.out.println(c);
			if ((a - b) == (b - c)) {
				cnt++;
			} else if ((a - b) == (c - b)) {
				cnt++;
			} else if ((b - a) == (c - b)) {
				cnt++;
			} else if ((b - a) == (b - c)) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}
}
