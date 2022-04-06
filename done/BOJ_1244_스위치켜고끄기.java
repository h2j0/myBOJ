package BOJ.done;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1244_스위치켜고끄기 {
	static int[] arr;
	static int len;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt(); // 스위치 길이 입력
		arr = new int[len + 1]; // 인덱스 고려해서 len+1 길이의 배열 생성 출력할 때 arr 1번방부터 출력해야 함
		for (int i = 1; i <= len; i++) { // 스위치 배열 생성
			arr[i] = sc.nextInt();
		}
		int student = sc.nextInt(); // 학생수 입력

		// 학생수만큼 스위치 토글 발생
		for (int i = 0; i < student; i++) {
			int bg = sc.nextInt(); 	// boy or girl
			if (bg == 1) { 			// 1일 때 boy
				boy(sc.nextInt());
			} else if (bg == 2) { 	// 2일 때 girl
				girl(sc.nextInt());

			}

		}
		// 출력 - 20의 배수일 때 엔터
		for (int i = 1; i <= len; i++) {
			System.out.print(arr[i] + " ");
			if (i % 20 == 0) {
				System.out.println();
			}

		}

	}

	// 남학생일 때 
	// 스위치 길이보다 작으면서 num의 배수를 토글
	public static void boy(int num) {
		int i = 1;
		while (num * i <= len) { 
			arr[num * i] ^= 1;
			i++;
		}

	}

	// 여학생일 때 
	// 해당 num을 토글시키고 
	// 갈 수 있는 범위 내에서 양 옆을 한 칸씩 가면서 비교하고 두 값이 같으면 토글
	public static void girl(int num) {
		arr[num] ^= 1;
		int i = 1;
		while (num - i > 0 && num + i <= len) {
			if (arr[num - i] == arr[num + i]) {
				arr[num - i] ^= 1;
				arr[num + i] ^= 1;
			} else
				break;
			i++;
		}

	}

}
