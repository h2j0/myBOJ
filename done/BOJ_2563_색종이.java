package BOJ.done;
import java.util.Scanner;

public class BOJ_2563_색종이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 도화지 생성
		int[][] arr = new int[100][100];
		// 색종이 개수
		int num = sc.nextInt();

		// 색종이를 올리면 그 자리는 1이 된다
		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					arr[x + j][y + k] = 1;
				}
			}
		}
		// 값이 1이면 cnt증가
		int cnt = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j] == 1) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
