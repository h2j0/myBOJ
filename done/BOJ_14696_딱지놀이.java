package BOJ.done;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_14696_딱지놀이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		int[] arrA;
		int[] arrB;

		sc.nextLine(); // 초기화
		for (int i = 0; i < round; i++) {
			arrA = new int[5];
			arrB = new int[5];
			
			// A의 딱지개수 입력받고 사이즈로 설정한 뒤
			// 해당 인덱스에 빈도를 추가한다
			// B도 같은 과정
			int aNum = sc.nextInt();
			for (int a = 0; a < aNum; a++) {
				arrA[sc.nextInt()]++;
			}
			int bNum = sc.nextInt();
			for (int b = 0; b < bNum; b++) {
				arrB[sc.nextInt()]++;
			}
			
			// 뒤에가 더 쎈 카드니까 뒤에 인덱스부터 검사
			int idx = 4;
			while (idx > 0) {
				// idx가 1이면서 A와 B의 값이 같다면 무승부 
				if(idx==1) {
					if(arrA[idx]==arrB[idx]) {
						System.out.println("D");
					}
				}
				// 배열의 값이 더 크면 그 사람이 이긴다
				if (arrA[idx] > arrB[idx]) {
					System.out.println("A");
					break;
				} else if (arrA[idx] < arrB[idx]) {
					System.out.println("B");
					break;
				}
				// idx가 4부터 시작해서 하나씩 줄어든다
				idx--;
			}
		}
	}
}
