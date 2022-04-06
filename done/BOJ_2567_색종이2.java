package BOJ.done;
import java.util.Scanner;

public class BOJ_2567_색종이2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 도화지 생성
		int[][] arr = new int[101][101];
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
	

		// 값이 1이고 상하좌우가 0이거나 경계선이면 둘레임 
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };
		int cnt = 0;
		// 한칸씩 확인해보면서
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				// 자기 자신이 1이고
				if (arr[i][j] == 1) {
					// 주변을 탐색하면서 0이 하나라도 있다면 cnt증가하고 반복문 나온다
					for (int rc = 0; rc < 4; rc++) {
						int nr = i + dr[rc];
						int nc = j + dc[rc];
						// 상하좌우가 0이거나 경계선일 떄 cnt증가
						if (arr[nr][nc] == 0 || nr < 0 || nr > 100 || nc < 0 || nc > 100) {
							cnt++;
						
						}

					}
				}
			}
		}
		// 출력
		System.out.println(cnt);
	}
}
