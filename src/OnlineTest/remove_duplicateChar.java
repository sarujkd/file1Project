package OnlineTest;

public class remove_duplicateChar {

	public static void main(String[] args) {
		String str="javaPgm";
		String s=str.toLowerCase();
		char[] s1=s.toCharArray();
		int j=0;
		System.out.print("Removed duplicates chars from string :"+str+ " are ");
		for(int i=0;i<s1.length;i++) {
			
			for(j=0;j<i;j++) {
			if(s1[i]==s1[j]) {
	
				break;
				
			}
			}
			if(i==j)
				System.out.print(s1[i]+" ");
		}
		
		int vcount=0,conCount=0;
		for(int i=0;i<s1.length;i++) {
			
			if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u')
				vcount++;
			else
				if(s1[i]>='a'||s1[i]<='z')
					conCount++;
		}
		
		System.out.println("\nNumber of vowels = "+vcount+"\n Number of consonents ="+conCount);
	}


}