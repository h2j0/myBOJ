package BOJ.done;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2309_일곱난쟁이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];

		int tot = 0;

		// 총합계에서 빼줄 인덱스값을 저장하기 위해서 반복문 밖에서 선언
		int i, j = 0;

		// 배열 생성하면서 9명 키 총합계 구하기
		for (i = 0; i < 9; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			tot += num;
		}

		// 배열 정렬
		Arrays.sort(arr);

		// 2개씩 뽑아내면서 tot에서 값을 빼주고 그 값이 100이면 break
		outer: for (i = 0; i < 8; i++) {
			for (j = i + 1; j < 9; j++) {
				int sum = tot;
				sum = sum - arr[i] - arr[j];
				if (sum == 100)
					break outer;
			}
		}

		// 그 두값을 제외하고 출력한다
		for (int k = 0; k < 9; k++) {
			if (k == i || k == j)
				continue;
			else
				System.out.println(arr[k]);
		}
	}
}
