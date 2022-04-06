package BOJ.done;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_2751_수정렬하기2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(arr);

		for (int i = 0; i < n; i++) {
			sb.append(arr.get(i) + "\n");
		}
		System.out.println(sb);

	} // 최대값 찾으면서 입력 완

}
