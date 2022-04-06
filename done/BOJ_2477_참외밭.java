package BOJ.done;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2477_참외밭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mul = sc.nextInt();
		int[] arr = new int[6]; // 앞, 뒤 2칸의 여유를 주기 위해 10칸 만든다

		// 밭 정보 입력받음
		// 입력 받으면서 최대값이랑 그 인덱스 저장하기
		int max = 0;
		int maxIdx = 0;
		for (int i = 0; i < 6; i++) {
			sc.nextInt();
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
			if (arr[i] == max) {
				maxIdx = i;
			}
		}
		
		// 최대값의 앞에 두개 뒤에 두개를 최대값과 곱해준다
		int area = mul
				* (arr[(maxIdx + 5) % 6] * arr[(maxIdx + 4) % 6] + arr[(maxIdx + 1) % 6] * arr[(maxIdx + 2) % 6]);
		System.out.println(area);
	}
}
