import java.util.*;

public class flipBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int no=(int)(Math.log(n)/Math.log(2) +1);
		for(int i=0;i<no;i++) {
			n=n^(1<<i);
		}
		System.out.println("The number u get after flipping is: " + n);
		
		

	}

}
