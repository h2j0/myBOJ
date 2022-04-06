package BOJ.done;
import java.util.Scanner;

public class BOJ_13300_방배정 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 총학생 인원
		int K = sc.nextInt(); // 방 인원제한
		int[] boy = new int[7]; // 학년별 인원 세는 배열
		int[] girl = new int[7];
		// 배열 생성. 학년을 인덱스로, 인원수를 값으로 받는다
		for (int i = 0; i < N; i++) {
			int bg = sc.nextInt();
			int grade = sc.nextInt();
			if (bg == 0) {
				girl[grade]++;
			} else {
				boy[grade]++;
			}
		}//  입력 완
		// (인원수 + (인원제한-1) / 인원제한) = 방 개수
		int cnt = 0;
		for (int i = 1; i < 7; i++) {
			cnt += ((girl[i] + K - 1) / K);
			cnt += ((boy[i] + K - 1) / K);
		}

		System.out.println(cnt);
	}
}
