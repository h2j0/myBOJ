package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_토마토 {

	static class Tomato {
		int r;
		int c;
		int day;

		public Tomato(int r, int c, int day) {
			this.r = r;
			this.c = c;
			this.day = day;
		}
	}

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static int M;
	static int N;
	static int[][] box;
	static Queue<Tomato> q;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		q = new LinkedList<>();
		visited = new boolean[N][M];
		box = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				if (box[i][j] == 1) {
					q.add(new Tomato(i, j, 0)); // 익은토마토 넣기
					visited[i][j] = true;
				}
			}
		} // 입력완
		int ans = 0;

		while (!q.isEmpty()) {
			Tomato curr = q.poll();
			ans = curr.day;
			for (int i = 0; i < 4; i++) {
				int nr = curr.r + dr[i];
				int nc = curr.c + dc[i];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (box[nr][nc] != 0 || visited[nr][nc])
					continue;

				// 토마토 익고
				box[nr][nc] = 1;
				q.add(new Tomato(nr, nc, curr.day + 1));
				visited[nr][nc] = true;
			}
		}

		outer: for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (box[i][j] == 0) {
					ans = -1;
					break outer;
				}

			}
		}
		System.out.println(ans);
	}

}
