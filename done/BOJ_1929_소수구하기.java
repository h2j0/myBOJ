package BOJ.done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929_소수구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		// 소수이면 1
		int[] prime = new int[n + 1];
		prime[1] = 1;
		prime[0] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 2; i * j <= n; j++) {
				prime[i * j]++;
			}
		}

		for (int i = m; i <= n; i++) {
			if (prime[i] == 0)
				sb.append(i + "\n");
		}
		System.out.println(sb);

	}
}
