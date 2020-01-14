import java.util.*;
class StringToIntConversion {

	public static void main(String[] args) {
		 int ans=0; int v; int i=0;
		 Scanner sc= new Scanner(System.in);
		 String str= sc.nextLine();
		 //String str=" -12345y7";
		 str=str.trim();
		 //str = str.replaceAll("\\s", ""); 
		 int len=str.length();
		 boolean isPositive= true;
		 if(str.charAt(0)== '-') {
			 i++;
			 isPositive= false;
		 }
		 else if( str.charAt(0)=='+') {
			 i++;
		 }
		 for(;i<len;i++) {
			 if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				 v= str.charAt(i)- '0';
				 ans= ans*10 + v;
			 }
			 else
			 {
				 System.out.println("The string contains characters");
				 ans=0;
				 break;
			 }
			 
		 }
		 if(!isPositive) {
			 ans=-ans;
		 }
		 System.out.println("The string converted into number is: " + ans);
	}

}
