import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		int x, y, z;
		boolean check = true;
		for(x = 1 ; x <= 100 ; ++x) {
			if(check == false) break;
			for(y = 1 ; y <= 100 - x ; y++) {
				z = 100 - x - y;
				if(z % 3 == 0 && 5*x + 3*y + z/3 == 100) {
					System.out.println(x + " " + y + " " + z);
					check = false;
					break;
				}
			}
		}
  }
}
