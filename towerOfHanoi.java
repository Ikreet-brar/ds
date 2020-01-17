
public class towerOfHanoi {
	 static void hanoi(int n, char A, char B, char C) {
		 if(n>0) {
			 hanoi(n-1,A,C,B);
			 System.out.println("Move disk "+n+" from "+A+" to "+C);
			 hanoi(n-1,B,A,C);
		 }
	 }

public static void main(String[] args) {
	
        int n = 4; 
        hanoi(n, 'A', 'C', 'B');
        
    
}
}
