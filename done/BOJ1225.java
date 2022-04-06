package BOJ.done;
import java.util.Scanner;

public class BOJ1225 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] res = str.split(" ");
		String[] str1 = res[0].split("");
		String[] str2 = res[1].split("");
		
		if (str == "0") {
			System.out.println(0);
			
		}else {
			long sum = 0;	// int로 받으면 틀림	
			for (int i = 0; i < str1.length; i++) {
				int a = Integer.parseInt(str1[i]);
				for (int j = 0; j < str2.length; j++) {
					int b = Integer.parseInt(str2[j]);
					
					sum += (a*b);
				}
			}

			System.out.println(sum);
		}
		
	}
}
