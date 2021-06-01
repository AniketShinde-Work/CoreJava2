package CoreJava2;

public class CiscoInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{6,4,7},{1,33,44},{7,4,10}};
		int lower=arr[0][0];
		int lowerColoum=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				
				if(arr[i][j]<lower) {
					lower=arr[i][j];
					lowerColoum=j;
				}
				
				System.out.print(arr[i][j]);
				System.out.print(" ");
			
			}
			System.out.println();
		}
		
		int maxCol=arr[0][lowerColoum];
		int k=0;//row
		while(k<3) {
			if(arr[k][lowerColoum]>maxCol) {
				maxCol=arr[k][lowerColoum];
			}
			k++;
		}
		
		
		
		System.out.println(maxCol);
	}

}
