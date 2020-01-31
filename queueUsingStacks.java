package queue;
import java.util.*;
public class queueUsingStacks {
	public static class queue{
	static Stack<Integer> s1=new Stack<Integer>();
	static Stack<Integer> s2=new Stack<Integer>();
	
	static void enqueue(int x) {
		s1.push(x);
		}
	static int dequeue() {
		if(s1.isEmpty() && s2.isEmpty()) {
			System.out.println("queue is empty");
			System.exit(0);
		}
		if(s2.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		int a=s2.pop();
		return a;
	}
	static void show() {
		System.out.println(s1);
		System.out.println(s2);
	}
		
	public static void main(String[] args) {
		queue q=new queue();
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.show();
		
		int b=q.dequeue();
		q.show();
		
	}

}
}
