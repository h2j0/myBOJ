package BOJ.done;
import java.util.Scanner;

public class BOJ1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alpha = new int[26]; 	// 알파벳 a~z 카운트할 배열 생성
		int n = sc.nextInt(); 		// 숫자 입력
		String name;

		for (int i = 0; i < n; i++) {
			name = sc.next();
			int c = name.charAt(0); // 입력받는 이름의 첫 글자 int -> 배열 번호
			int idx = c - 97; 		// a의 아스키코드가 97이므로 97을 빼준다
			alpha[idx]++; 			// 알파벳 배열에 값 1씩 증가
		}

		String res = "";
		for (int i = 0; i < 26; i++) {
			if (alpha[i] >= 5) { 	// 5개 이상이면 String에 char 값 추가
				char c = (char) (i + 97);
				res += Character.toString(c);
			}
		}
		if (res == "") {
			System.out.println("PREDAJA"); // res가 빈 값이면 PREDAJA 출력
		} else {
			System.out.println(res);
		}
	}
}
