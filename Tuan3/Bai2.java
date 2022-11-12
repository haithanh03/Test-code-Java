import java.util.*;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n = s1.length();
		int m = s2.length();
		/*int [][]dp = new int[100][100];
		int ans;
		for(int i = 1; i <= n ; i++) {
			for(int j = 1 ; j <= m; j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else{
	                if(dp[i-1][j] >= dp[i][j-1])     
	                    dp[i][j] = dp[i-1][j];
	                else
	                    dp[i][j] = dp[i][j-1];
	            }
			}
		}
		System.out.println(dp[n][m]);*/
		int ans = 0;
		for(int i = 0 ; i < m; i++) {
			for(int j = i+1; j <= m; j++) {
				if(s1.indexOf(s2.substring(i,j)) >= 0) {
					ans = Math.max(ans, j-i);
				}
			}
		}
		System.out.println(ans);
	}

}
