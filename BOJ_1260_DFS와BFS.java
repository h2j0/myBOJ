package BOJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260_DFS와BFS {
	static int[][] graph;
	static int n;
	static boolean[] visited;
	static List<Integer> dfsRes;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		graph = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph[a][b] = b;
			graph[b][a] = a;
		} // 그래프 입력

		// dfs
		visited = new boolean[n + 1];
		dfsRes = new ArrayList<>();
		dfs(v);
		System.out.println(dfsRes);

		// bfs
		// 큐 생성
		Queue<Integer> q = new LinkedList<>();
		q.add(v);
		visited = new boolean[n + 1];
		visited[v] = true;
		while(!q.isEmpty()) {
			
		}
		
		
		
		
	}// main

	static void dfs(int v) {
		// 종료 조건
		if (dfsRes.size() == n) {
			return;
		}
		// 방문처리
		visited[v] = true;
		// 정점 담기
		dfsRes.add(v);

		// 순회
		for (int i = 1; i <= n; i++) {
			// 연결이 안되어있거나 이미 방문했으면 제껴
			if (graph[v][i] == 0 || visited[graph[v][i]]) {
				continue;
			}
			dfs(graph[v][i]);
		}
	}// dfs

}
