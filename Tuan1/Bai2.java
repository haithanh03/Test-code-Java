import java.util.Arrays;
import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int [4];
		int cnt = 0;
		for(int i = 0; i<4 ; i++) {
			a[i] = sc.nextInt();
			if(a[i] == a[0]) cnt++;
		}
		if(cnt == 4) System.out.println("Khong ton tai so lon thu 2");
		else {
			Arrays.sort(a);
			System.out.println(a[2]);
		}
	}

}
