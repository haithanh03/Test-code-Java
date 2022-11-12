import java.awt.datatransfer.SystemFlavorMap;
import java.util.*;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String s = "IVXLCDM";
		int []a = {1,5,10,50,100,500,1000};
		String ques = sc.nextLine();
		int sum = 0;
		for(int i = 0 ; i < ques.length()-1; i++) {
			if(ques.charAt(i) == 'I') {
				if(ques.charAt(i+1) == 'I') sum+=1;
				else sum += -1;
		  }else if(ques.charAt(i) == 'V') {
			  if(ques.charAt(i+1) == 'I' || ques.charAt(i+1) == 'V') sum+=5;
			  else sum += -5;
		  }else if(ques.charAt(i) == 'X') {
			  if(ques.charAt(i+1) == 'I' || ques.charAt(i+1) == 'V' || ques.charAt(i+1) == 'X') sum += 10;
			  else sum += -10;
		  }else if(ques.charAt(i) == 'L') {
			  if(ques.charAt(i+1) == 'I' || ques.charAt(i+1) == 'V' || ques.charAt(i+1) == 'X' || ques.charAt(i+1) == 'L') sum += 50;
			  else sum += -50;
		  }else if(ques.charAt(i) == 'C') {
			  if(ques.charAt(i+1) == 'I' || ques.charAt(i+1) == 'V' || ques.charAt(i+1) == 'X' || ques.charAt(i+1) == 'L' || ques.charAt(i+1) == 'C') sum += 100;
			  else sum += -100;
		  }else if(ques.charAt(i) == 'D') {
			  if(ques.charAt(i+1) == 'I' || ques.charAt(i+1) == 'V' || ques.charAt(i+1) == 'X' || ques.charAt(i+1) == 'L' || ques.charAt(i+1) == 'C' || ques.charAt(i+1) == 'D') sum += 500;
			  else sum += -500;
		  }else if(ques.charAt(i) == 'M') {
			  if(ques.charAt(i+1) == 'I' || ques.charAt(i+1) == 'V' || ques.charAt(i+1) == 'X' || ques.charAt(i+1) == 'L' || ques.charAt(i+1) == 'C' || ques.charAt(i+1) == 'D' || ques.charAt(i+1) == 'M') sum += 1000;
			  else sum += -1000;
		  }
	  }
			if(ques.charAt(ques.length()-1) == 'I') sum += 1;
			else if(ques.charAt(ques.length()-1) == 'V') sum += 5;
			else if(ques.charAt(ques.length()-1) == 'X') sum += 10;
			else if(ques.charAt(ques.length()-1) == 'L') sum += 50;
			else if(ques.charAt(ques.length()-1) == 'C') sum += 100;
			else if(ques.charAt(ques.length()-1) == 'D') sum += 500;
			else sum += 1000;
		System.out.println(sum);
   }

}
