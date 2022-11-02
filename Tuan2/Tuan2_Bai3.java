import java.util.*;
public class Tuan2_Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] dp = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		/*for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(a[j] < a[i]) dp[i] = Math.max(dp[i],dp[j]+1);
			}
		}
		System.out.println(maxArray(dp)+1);*/
		int ans = 0;
		int max = 0;
		for(int i = 0; i < n-1; i++) {
			if(max > ans) ans = max;
			max = 0;
			for(int j = i+1; j < n; j++ ) {
				if(a[j] >= a[j-1]) max++;
				else break;
			}
		}
		System.out.println(ans + 1);
	}
	public static int maxArray(int[] a) {
		int max = a[0];
		for(int i = 1 ; i < a.length; i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}


}
