package stacks;

class dynamic{
	int length=4;
	int top=-1;
	
	int[] create_new(int[] a) {
		int new_a[]=new int[length*2];
		for(int i=0;i<length;i++) {
			new_a[i]=a[i];
		}
		length=length*2;
		return new_a;
	}
	int[] push(int[] a,int element) {
		double lfactor=0.5;
		int th=(int)(0.5*length);
		if(top==th) {
			a=create_new(a);
		}
		else {
			a[++top]=element;
		}
		return a;
	}
	void pop(int[] a) {
		top--;
	}
	void display(int[] a) {
		if(top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.print("Stack: "); 
	        for (int i = 0; i <= top; i++) 
	            System.out.print(a[i] + " "); 
	        System.out.println();
		}
	}
}
public class dynamicStack {

	public static void main(String[] args) {
		int len=4;
		dynamic ob=new dynamic();
		int a[]=ob.create_new(new int[len]);
		 a = ob.push(a, 1); 
		    a = ob.push(a, 2); 
		    a = ob.push(a, 3); 
		    a = ob.push(a, 4); 
		    ob.display(a);
		    a = ob.push(a, 5); 
		    a = ob.push(a, 6); 
		    ob.display(a); 
		  
		    a = ob.push(a, 7); 
		    a = ob.push(a, 8); 
		    ob.display(a); 
		    a = ob.push(a, 9); 
		    ob.display(a); 
		

	}

}
