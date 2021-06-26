package OnlineTest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class dupharMap {

	//@Test(priority=1)
	public void displayDuplicateChars() {
		
		String str="java Program of today";
		Map<Character,Integer> dups=new LinkedHashMap<>();
		
		for(char ch:str.toCharArray()) {
			
			if(dups.containsKey(ch)) 
				dups.put(ch,dups.get(ch)+1);
				else
					dups.put(ch,1);
			}
		
		//Display dups
		System.out.println("Duplicate chars:");
		for(Character c:dups.keySet()) {
			
			if(dups.get(c)>1 && c!=' ')
				System.out.println("Character "+c +"  occured "+dups.get(c)+ " times");
				
		}
		
		
		}
		
	
	//@Test(priority=2)
	public void checkAnagrams() {
	
	String str2="dad";
		String str1="add";
		
		char[] sArr1=str1.toCharArray();
		char[] sArr2=str2.toCharArray();
		boolean flag=false;
		if(str1.length()==str2.length()) 
		{
			for(int i=0;i<sArr1.length;i++) {
				flag=false;
				for(int j=0;j<sArr1.length;j++) {
					
					if(sArr1[i]==sArr2[j]) {
						
						sArr2[j]=' ';
						flag=true;
						break;
					}
						
			}
				if(flag==false)
					break;
			}
		
		
		if(flag==true)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not anagram");
	}
		else
			System.out.println("Strings are not anagram");
	
	}
	
	@Test(priority=3)
	public void countVowelsInAString() {
		
		String str="javaprogramendatnow";
		int vowelCount=0;
//		if(str.matches("[aeiou]+"))
//			System.out.println("string has only vowels");
//		else 
//			if(str.matches("[0-9]+"))
//				System.out.println("string has only digits");
//			else
//				if(str.matches("[a-z]+"))
//					System.out.println("string has chars");
//				else
//				System.out.println("string has both digits and chars");
			
		char[] strLowerCase=str.toLowerCase().toCharArray();
		for(char c:strLowerCase)
		if(c=='a'|| c=='e'||c=='i'|| c=='o'|| c=='u') {
			
			vowelCount++;
			System.out.print(c+" ");
		}
		
		System.out.println("Total number of vowels : "+vowelCount);
		
	}
	
}
