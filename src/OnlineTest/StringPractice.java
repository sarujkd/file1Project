package OnlineTest;

import org.testng.annotations.Test;

public class StringPractice {

	@Test(enabled=false)
	public void stringWordsRev() {
		
		String str="java python";
		String sRev="";
		String[] splitStr=str.split(" ");
		
		for(int i=0;i<splitStr.length;i++) {
			for(int j=splitStr[i].length()-1;j>=0;j--) {
				
			
			sRev+=splitStr[i].charAt(j);
			
		}
			sRev+=" ";
		}
		System.out.println("\nReversed String is :"+sRev);
	}
	
	@Test(enabled=false)
	public void stringRemoveDuplicate() {
		
		String str="mom mama";
		char[] cStr=str.toCharArray();
		
		for(int i=0;i<cStr.length;i++) {
			for(int j=i+1;j<cStr.length;j++) {
				if(cStr[i]==cStr[j]) {
					cStr[j]=' ';
				}
			}
		}
			for(int i=0;i<cStr.length;i++) {
			if(cStr[i]!=' ')
				System.out.print(cStr[i]);
		}
			
		
	}
	
	@Test
	public void stringEndsWithOtherString() {
		
		String str1="abc";
		str1=str1.toLowerCase();
		String str2="HiaBc";
		str2=str2.toLowerCase();
		
		if(str1.endsWith(str2)||str2.endsWith(str1))
				System.out.println("true");
		else
			System.out.println("false");
}

}