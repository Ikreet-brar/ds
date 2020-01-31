package queue;
import java.util.*;
class stack{
	Queue<Integer> q1=new LinkedList<>();
	Queue<Integer> q2=new LinkedList<>();
	
	int count;
	public stack(){
		count=0;
	}
	
	void push(int x) {
		q1.add(x);
		count++;
	}
	
	int pop() {
		if(q1.isEmpty())
			return -1;
		while(q1.size()!=1) {
			q2.add(q1.peek());
			q1.remove();
		}
		int temp=q1.peek();
		q1.remove();
		 
		Queue<Integer> q=q1;
		q1=q2;
		q2=q;
		return temp;
	}
	void show() {
		System.out.println(q1);
	}
}
public class stackUsingQueue {

	public static void main(String[] args) {
		stack s=new stack();
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.show();
		s.pop();
		s.show();
		

	}

}
