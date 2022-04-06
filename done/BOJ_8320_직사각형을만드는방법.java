package BOJ.done;
import java.util.Scanner;

public class BOJ_8320_직사각형을만드는방법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 0;
		// 1층짜리 직사각형 , 2층짜리 직사각형 .. 이런식으로 만들어가는데
		// 주어진 블럭수보다 i*j가 작으면 cnt증가 / 크면 브레잌
		// 1x5 블럭과 5x1 블럭은 같은 직사각형이므로
		// 절반만 수행해도 되므로 i 조건이 i<=(n+1)/2 (홀수일때 올림하려고 +1 해줌)
		for (int i = 1; i <= (n + 1) / 2; i++) {
			for (int j = i; j <= n; j++) {
				if (i * j <= n) {
					cnt++;
				} else
					break;
			}
		}
		System.out.println(cnt);
	}
}
