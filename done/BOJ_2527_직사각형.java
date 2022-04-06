package BOJ.done;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2527_직사각형 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner("3 10 50 60 100 100 200 300\r\n" + "45 50 600 600 400 450 500 543\r\n"
				+ "11 120 120 230 50 40 60 440\r\n" + "35 56 67 90 67 80 500 600");
		for (int t = 0; t < 4; t++) {
			int[] tmp1 = new int[4];
			int[] tmp2 = new int[4];
			for (int i = 0; i < 4; i++) {
				tmp1[i] = sc.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				tmp2[i] = sc.nextInt();
			}
			int[] nemo1 = new int[4];
			int[] nemo2 = new int[4];

			if (tmp1[0] <= tmp2[0]) {
				nemo1 = tmp1;
				nemo2 = tmp2;
			} else {
				nemo1 = tmp2;
				nemo2 = tmp1;
			}
			String ans = "";
			if (nemo1[0] < nemo2[0] && nemo2[0] < nemo1[2] && nemo2[1] < nemo1[3]) {
				ans = "a";
			} else if (nemo1[2] == nemo2[0] && (nemo1[1] == nemo2[3] || nemo1[3] == nemo2[1])) {
				ans = "c";
			} else if (nemo1[3] == nemo2[1] && nemo1[0] < nemo2[0] && nemo2[0] < nemo1[2]) {
				ans = "b";
			} else if (nemo1[1] == nemo2[3] && nemo1[0] < nemo2[0] && nemo2[0] < nemo1[2]) {
				ans = "b";
			} else if (nemo1[2] == nemo2[0] && nemo1[1] < nemo2[1] && nemo2[1] < nemo1[3]) {
				ans = "b";
			} else
				ans = "d";
			
			System.out.println(ans);
//			System.out.println("nemo1 : " + Arrays.toString(nemo1));
//			System.out.println("nemo2 : " + Arrays.toString(nemo2));
		}

	}
}
