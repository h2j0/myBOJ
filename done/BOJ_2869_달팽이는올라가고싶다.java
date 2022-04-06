package BOJ.done;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869_달팽이는올라가고싶다 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int x = 0;
		int cnt = 0;

		cnt = (v - a) / (a - b);
		int ans = (v - a) % (a - b) == 0 ? cnt + 1 : cnt + 2;
		System.out.println(ans);
	}
}
