import java.util.*;
public class postfixEvalUsingStack {
	static int postfix(String str) {
		Stack<Integer> st= new Stack<Integer>();
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(str.charAt(i)==' ')
				continue;
			
			else if(Character.isDigit(c)) {
				int x=0;
				while(Character.isDigit(c)) {
					x=x*10+ (int)(c-'0');
					i++;
					c=str.charAt(i);
				}
				i--;
				st.push(x);
			}
			else {
				int b=st.pop();
				int a=st.pop();
				if(c=='+')
					st.push(a+b);
				else if(c=='-')
					st.push(a-b);
				else if(c=='*')
					st.push(a*b);
				 else
					st.push(a/b);
			}
		}
		int d=st.pop();
		return d;
		 
	}
	public static void main(String[] args) {
		String str="5 10 2 * + 3 -";
		int result= postfix(str);
		System.out.println(result);
	}

}
