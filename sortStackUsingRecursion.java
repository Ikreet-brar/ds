
import java.util.*;
public class sortStackUsingRecursion {
	static Stack<Integer> st=new Stack<Integer>();
	
	static void sort_insert(int x) {
		if(st.isEmpty() || x>st.peek()){
			st.push(x);
			return;
		}
		int a=st.pop();
		sort_insert(x);
		st.push(a);
		
	}
	static void stack_sort() {
		if(!st.isEmpty()) {
			int x=st.pop();
			stack_sort();
			sort_insert(x);
		}
	}
	public static void main(String[] args) {
		st.push(3);
		st.push(4);
		st.push(2);
		st.push(5);
		st.push(1);
		System.out.println(st);
		stack_sort();
		System.out.println(st);
		
		

	}

}
