package OnlineTest;

import java.util.Scanner;

public class generatePattern {

	public static void main(String[] args) {
		
		/* Generate pattern 
		 
		           *
		           * *
		           * * *
		           * ^ * *
		           * * * * *
		*/
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the height of the Pattern");
        int len=sc.nextInt();
        
		for(int i=0;i<len;i++) {
			
				for(int j=0;j<=i;j++) {
					
				System.out.print("*"+" ");
				}
		System.out.println();
		}
	}

}
