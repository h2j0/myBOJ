package BOJ.Study.Week08_Mar3rd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class BOJ_11650_좌표정렬하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[][] numArr = new int[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			numArr[i][0] = Integer.parseInt(st.nextToken());
			numArr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(numArr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 0번째 값이 같을 때 1번째 값으로 크기 비교한다
				if (o1[0] == o2[0])
					return Integer.compare(o1[1], o2[1]);
				// 0번째 값으로 크기 비교
				return Integer.compare(o1[0], o2[0]);
			}
		});

		for (int i = 0; i < n; i++) {
			sb.append(numArr[i][0]).append(" ");
			sb.append(numArr[i][1]).append("\n");
		}
		System.out.println(sb);

	}
}
