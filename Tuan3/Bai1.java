import java.util.*;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int []a = new int[256];
		char []ans = new char[256];
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) == ' ') continue;
			if(s.charAt(i) < 97 && s.charAt(i) != ' ') {
				a[s.charAt(i) + 32]++;
				ans[s.charAt(i)] = s.charAt(i);
			}
			else a[s.charAt(i)]++;
		}
		for(int i = 97 ; i <123; i++) {
			if(a[i] != 0) {
				System.out.println((char)i + " : " + a[i]);
			}
		}
	}

}
