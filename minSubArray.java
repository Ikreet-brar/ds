public class minSubArray {

	public static void main(String[] args) {
		int[] arr=new int[] {10,4,3,5,1,3,8};
		int min=9999;
		int len=arr.length;
		int k=3; int s=0;
		for(int i=0;i<k;i++) {
			s+=arr[i];
			min=s;
		}
		for(int j=k;j<len;j++) {
			s=s-arr[j-k]+arr[k];
			if(s<=min) {
				min=s;
			}
		}
		System.out.print(min);
			
	}

}
