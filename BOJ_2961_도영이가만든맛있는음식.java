package BOJ;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2961_도영이가만든맛있는음식 {
	static int n;
	static int[][] ingredient;
	static boolean[] sel;
	static int minDiff;
	static int idx;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ingredient = new int[n][2];
		sel = new boolean[n];
		for (int i = 0; i < n; i++) {
			ingredient[i][0] = sc.nextInt();
			ingredient[i][1] = sc.nextInt();
		}
		minDiff = 987654321;
		powerset(0);

		System.out.println(minDiff);
	}

	static void powerset(int k) {
		// base
		if (k == n) {
			int s = 1; // 신맛 곱
			int b = 0; // 쓴맛 합
			int cnt = 0;
			for (int i = 0; i < n; i++) {
				if (sel[i]) {// 선택된 애들
					cnt++;
					s *= ingredient[i][0];
					b += ingredient[i][1];
				}
			}
			if (cnt != 0 && minDiff > Math.abs(s - b)) {
				minDiff = Math.abs(s - b);
			}
			return;
		}
		// recursive
		sel[k] = true;
		powerset(k + 1);
		sel[k] = false;
		powerset(k + 1);
	}
}
