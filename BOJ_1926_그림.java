package BOJ;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1926_그림 {
	static int[][] arr;
	static boolean[][] visited;
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int n, m, width, cnt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		} // 입력 완
//		for (int i = 0; i < n; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		visited = new boolean[n][m];
		int maxWidth = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				width = 0;
				if (!visited[i][j] && arr[i][j] == 1) {
					cnt++;
					width++;
					dfs(i, j);
				}
				maxWidth = Math.max(width, maxWidth);
			}
		}
		System.out.println(cnt + "\n" + maxWidth);
	}

	private static void dfs(int r, int c) {
		visited[r][c] = true;

		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];

			if (nr < 0 || nr >= n || nc < 0 || nc >= m)
				continue;
			if (visited[nr][nc] || arr[nr][nc] == 0)
				continue;
			
			dfs(nr, nc);
			width++;
		}

	}
}
