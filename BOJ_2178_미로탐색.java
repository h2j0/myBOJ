package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178_미로탐색 {
	static class Pos {
		int r;
		int c;
		int dist;

		public Pos(int r, int c, int dist) {
			super();
			this.r = r;
			this.c = c;
			this.dist = dist;
		}
	}

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] map = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}

		int ansDist = 0;

		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(0, 0, 1)); // 시작
		visited[0][0] = true;

		while (!q.isEmpty()) {
			// 1. 하나 꺼내
			Pos curr = q.poll();

			// 2. 종료 조건
			if (curr.r == N - 1 && curr.c == M - 1) {
				ansDist = curr.dist;
				break;
			}
			for (int i = 0; i < 4; i++) {
				int nr = curr.r + dr[i];
				int nc = curr.c + dc[i];

				if (nr < 0 || nr >= N || nc < 0 || nc >= M)
					continue;
				if (visited[nr][nc] || map[nr][nc] == 0)
					continue;

				visited[nr][nc] = true;
				q.add(new Pos(nr, nc, curr.dist + map[nr][nc]));
			}

		}//while
		
		System.out.println(ansDist);
	}
}
