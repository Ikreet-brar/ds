public class SwapNos {

	public static void main(String[] args) {
		int a=9;
		int b=8;
		//with temp variable
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("new a:"+ a);
		System.out.println("new b:"+ b);
		//without a temp variable
		int c=12;
		int d=7;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("new c:"+ c);
		System.out.println("new d:"+ d);
		//xor operator
		int a1=2; int b1=3;
		a1=a1^b1;
		b1=a1^b1;
		a1=a1^b1;
		System.out.println("new a1:"+ a1);
		System.out.println("new b1:"+ b1);
		
		
		
	}
	

}
