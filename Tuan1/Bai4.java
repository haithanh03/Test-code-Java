import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n <= 0) {
			n = sc.nextInt();
		}
		int cnt = 0;
		while(n != 0 ) {
			int r = n%10;
			if(Math.sqrt(r) == (int)Math.sqrt(r)) {
				System.out.print(r + " ");
				cnt++;
			}
			n /= 10;
		}
		if(cnt == 0) System.out.println("NO");
	}

}
