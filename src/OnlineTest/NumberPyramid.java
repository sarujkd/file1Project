package OnlineTest;

public class NumberPyramid {

	public static void main(String[] args) {
	
		       /*
		          1
		        2 1 2
		      3 2 1 2 3
            4 3 2 1 2 3 4
        */
		int row=4;
		for(int i=1;i<=row;i++) {
			//System.out.print(" ");
			for(int j=1;j<row-i;j++) 
				System.out.print(" ");
				
				for(int k=i;k>0;k--) 
					System.out.print(k);
					for(int l=2;l<i+1;l++) 
						System.out.print(l);
					
				
			
		System.out.println();	
		}
		
	}

}
