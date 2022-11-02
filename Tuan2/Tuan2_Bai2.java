import java.util.*;
public class Tuan2_Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+5];
		int[] ans = new int[1000005];
		int cnt = 0;
		for(int i = 1 ; i <= n ; i++) {
			a[i] = sc.nextInt();
			if(a[i] == i) cnt++;
			ans[a[i]]++;
		}
		if(cnt == n) System.out.println("YES");
		else {
			for(int i = 1 ; i  <= maxArray(a); i++) {
				if(ans[i] == 0) System.out.print(i + " ");
			}
		}	
	}
	public static int maxArray(int[] a) {
		int max = a[0];
		for(int i = 1 ; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}

}
