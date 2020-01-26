
import java.util.*;

public class reverseStackUsingRecursion {
	static Stack<Integer> st=new Stack<Integer>();
	
	static void insert_again(int x){
		if(st.isEmpty())
			st.push(x);
		else {
			int a=st.peek();
			st.pop();
			insert_again(x);
			st.push(a);
			
		}
	}
	static void reverse() {
		if(st.size()>0) {
			int x=st.peek();
			st.pop();
			reverse();
			insert_again(x);
		}
		
	}

	public static void main(String[] args) {
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		reverse();
		System.out.println(st);
	}

}
