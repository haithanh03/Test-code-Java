import java.util.*;
public class Tuan2_Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int cnt = 0;
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
			int tmp = a[i];
			boolean check = true;
			if(!isPrime(a[i])) continue;
			while(a[i] != 0) {
				if(!isPrime(a[i] % 10)) {
					check = false;
					break;
				}
				a[i] = a[i] / 10;
			}
			if(check) {
				System.out.print(tmp + " ");
				cnt++;
			}
		}
		if(cnt == 0) System.out.println("NO");

	}
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		for(int i = 3; i <= Math.sqrt(n) ; i+=2) {
			if(n % i == 0) return false;
		}
		return true;
		
	}

		
		
	}


