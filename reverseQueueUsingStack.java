package queue;
import java.util.*;

public class reverseQueueUsingStack {
		
		static Queue<Integer> q1;
		
		static void reverse() {
			Stack<Integer> s1=new Stack<>();
			while(!q1.isEmpty()) {
				s1.add(q1.peek());
				q1.remove();
				while(!s1.isEmpty()) {
					q1.add(s1.peek());
					s1.pop();
					
				}
			}
			
		}
		 static void Print() 
		    { 
		        while (!q1.isEmpty()) { 
		            System.out.print( q1.peek() + ", "); 
		            q1.remove(); 
		        } 
		    } 
	public static void main(String[] args) {
		q1 = new LinkedList<Integer>(); 
		
		q1.add(4);
		q1.add(5);
		q1.add(6);
		q1.add(7);
		reverse();
		Print();
		
		
		
		

	}

}
