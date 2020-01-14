public class nextGreaterElement {

	public static void main(String[] args) {
		int[] arr= new int[] {11,13,21,3,42,5};
		int len=arr.length; 
		int next;
        for(int i=0;i<len;i++) {
        	next=-1;
			for(int j=i+1; j<len;j++) {
				if(arr[i]<arr[j]) {
					next=arr[j];
					break;
				}
				
			}
			System.out.println(arr[i]+ " --> "+ next);
		}
		
	}

}
