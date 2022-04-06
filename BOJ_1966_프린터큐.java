package BOJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1966_프린터큐 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken()); // 궁금한 애의 현재 위치
			LinkedList<Integer> q = new LinkedList<>();

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				q.add(Integer.parseInt(st.nextToken()));
			} // 입력 완

			// 일단 맨 앞에에 제거하고
			// 얘가 가장 큰 수면 그냥 끝
			// 얘가 가장 큰 수가 아니면 뒤에 추가해

			int pos = m;
			boolean flag = true;
			while (true) { // 찾으려는 애가 빠져 나올 때까지 반복
				int num = q.remove(0);
				n--; // 길이가 줄어든다
				pos = (pos + n - 1) % n;
				for (int i = 0; i < q.size(); i++) {
					if (num < q.get(i)) {
						flag = false;
						break;
					}
				}
				if (!flag) { // 가장 큰 수가 아닐 떄

				}

			}

		}

	}
}
