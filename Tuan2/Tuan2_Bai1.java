import java.util.Scanner;

public class Tuan2_Bai1 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		int []cnt =  new int[100005];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			cnt[a[i]]++;
		}
		for(int i = 0 ; i <= maxArray(a); i++) {
			if(cnt[i] != 0) {
				System.out.println(i + " : " + cnt[i]);
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
