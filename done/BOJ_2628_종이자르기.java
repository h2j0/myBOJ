package BOJ.done;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_2628_종이자르기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); // 가로
		int h = sc.nextInt(); // 세로
		int n = sc.nextInt(); // 좌표 개수
		ArrayList<Integer> garo = new ArrayList<>();
		ArrayList<Integer> sero = new ArrayList<>();
		int g = 1;
		int s = 1;
		garo.add(0);
		sero.add(0);
		for (int i = 0; i < n; i++) {
			if (sc.nextInt() == 0) {
				garo.add(sc.nextInt());
			} else {
				sero.add(sc.nextInt());
			}
		}
		Collections.sort(garo);
		Collections.sort(sero);

		garo.add(h);
		sero.add(w);
		int gmax = 0;
		int smax = 0;
		for (int i = 1; i < garo.size(); i++) {
			gmax = Math.max(garo.get(i) - garo.get(i - 1), gmax);
		}
		for (int i = 1; i < sero.size(); i++) {
			smax = Math.max(sero.get(i) - sero.get(i - 1), smax);
		}
		System.out.println();

	}
}
