package CoreJava2;

public class InterviewArray {
	
	
	public void singleArray() {
		int a[]= {99,43,56,11,4,55,66,77};
		int b=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] < b) {
				b = a[i];
			}
		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewArray ia=new InterviewArray();
		ia.singleArray();
		
		
		int arr[][]= {{8,44,55},{4,5,6},{10,8,1}};
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
				
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println(min);
		
	}

}
