package OnlineTest;

public class sumOfBorder {

	public static void main(String[] args) {
		
		
		int matrix[][]= 
			   {{1,2,2,3},
				{0,1,0,2},
				{4,-1,-1,-3},
				{4,-1,-1,3}
		       };
		
		borderSums(matrix);

	}

	private static void borderSums(int[][] matrix) {
		
		int len=matrix.length;
		int[] result=new int[2];
		int sum=0,s1=0,k=0;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				
				//Adding border values
				
				if(i==0||j==0||i==len-1||j==len-1)
			sum+=matrix[i][j];	
				else
					if(i==j || i+j==len-1)
						s1+=matrix[i][j];
			}
				}
		result[k]=sum;
		result[k+1]=s1;
		System.out.print("Sum of Border and Sum of center elements in an array\n[ ");
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
	System.out.print("]");
}
	
}