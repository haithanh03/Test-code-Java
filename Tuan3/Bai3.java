import java.util.*;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum = 0;
		int cnt = 0;
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) > 47 && s.charAt(i) < 58) {
				sum += (s.charAt(i) - 48);
				cnt++;
			}
		}
		if(cnt == 0) {
			System.out.println("false");
		}else {
			System.out.println("true");
			double ans = (double)sum/cnt;
			System.out.format("%.3f%n",ans);
		}

	}

}
