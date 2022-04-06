package BOJ.done;
import java.util.Scanner;

public class BOJ1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int x = n;

		while (true) {
			int a = x / 10; // 십의자리 숫자
			int b = x % 10; // 일의자리 숫자
			x = (b * 10) + ((a + b) % 10); // 다음 숫자 만들기
			cnt++;
			if (x == n) { // 다음 숫자랑 입력 숫자가 같으면 break
				break;
			}
		}
		System.out.println(cnt);
	}
}
