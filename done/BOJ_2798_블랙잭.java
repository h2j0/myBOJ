package BOJ.done;
import java.util.Scanner;

public class BOJ_2798_블랙잭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		// 입력값 배열로 만들기
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int max = 0;
		// 카드 한장씩 뽑아서 더한다
		// 더한 값이 입력값 m보다 작은 경우들 중에 최대값이 정답
		// 재귀 : 몇 개를 뽑아야 할 지 모르겠다 or 반복문을 
		for (int i = 0; i < n - 2; i++) {
			int sum = 0;
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (sum <= m) {
						max = Math.max(sum, max);
					}
				}
			}
		}
		System.out.println(max);
	}
}
