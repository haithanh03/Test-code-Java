import java.util.*;

public class Bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.trim();
		s = s.toLowerCase();
		int cp = 0;
		String ans = "";
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <='z') {
				ans += (char)(s.charAt(i) - 32 );
				cp = i;
				break;
			}
		}
		for(int i = cp+1 ; i < s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') continue;
			else if(s.charAt(i) == ' ' && s.charAt(i+1) == ' ') continue;
			else if(ans.charAt(ans.length()-1) == ' ' && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ans += (char)(s.charAt(i)-32);
			else ans += (char)s.charAt(i);
		}
		System.out.println(ans);
	}

}
