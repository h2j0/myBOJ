package BOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1541_잃어버린괄호_못푼방식 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		List<Integer> numArr = new ArrayList<>();
		List<Character> operArr = new ArrayList<>();

		String strNum = "";
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			// 연산자 만나면 연산자리스트에 추가
			if (str.charAt(i) == '+' || str.charAt(i) == '-') {
				operArr.add(str.charAt(i));
				flag = true;
			} else { // 숫자면 string으로 숫자 만들어준다
				strNum += str.charAt(i);
				flag = false;
			}
			// numArr에 strNum을 추가하는 조건: 1. 연산자를 만나거나 2. i가 맨 마지막까지 갔거나
			if (flag || i == str.length() - 1) {
				numArr.add(Integer.parseInt(strNum));
				strNum = "";
			}
		} // 숫자, 연산자 구분해서 따로 저장

		// 더하기 먼저 계산
		for (int i = 0; i < operArr.size(); i++) {
			int tmpNum = 0;
			// +기호일 때 그 인덱스랑 같은 인덱스의 숫자값이랑 그 다음 값이랑 더한걸로 바꾸고
			// 해당 숫자 삭제, 연산자 삭제
			// 예를들어서 num : 55 50 40 / oper : - + => 50+40 => 55 90 / - 이렇게 만들어준다
			if (operArr.get(i) == '+') {
				numArr.set(i, numArr.get(i) + numArr.get(i + 1));
				numArr.remove(i + 1);
				operArr.remove(i);
			}
		}

		int ans = numArr.get(0);
		for (int i = 0; i < operArr.size(); i++) {
			ans -=numArr.get(i+1);
		}

		System.out.println(ans);

	}
}
