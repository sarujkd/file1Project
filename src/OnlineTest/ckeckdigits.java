package OnlineTest;

public class ckeckdigits {

	public static void main(String[] args) {

		String str1 = "5677df";
		int flag = 1;

		for (int i = 0; i < str1.length(); i++) {
			if (!(str1.charAt(i) >= '0' && str1.charAt(i) <= '9')) {
				flag = 0;
				break;
			}
		}
		if (flag == 0)
			System.out.println("String contains digits and characters");
		else
			System.out.println("String contains only digits");
		
		if(str1.matches("[0-9]+")) {
			System.out.println("digits");
		}	
		else
			System.out.println("not digits");
		
	}
	}

