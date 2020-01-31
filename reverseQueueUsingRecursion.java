
import java.util.*;

public class reverseQueueUsingRecursion {
	static Queue<Integer> q =new LinkedList<>();
	static void reverse() {
		if (q.isEmpty()) 
	        return ; 
		int x=q.peek();
		q.remove();
		reverse();
		q.add(x);
		
	}
	
	
	public static void main(String[] args) {
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		reverse();
		System.out.println(q);
		

	}

}
