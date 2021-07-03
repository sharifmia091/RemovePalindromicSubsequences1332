import java.util.Scanner;
public class RemovePalindromicSubsequences1332 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("input the String: ");
		String inputStr = input.nextLine();
		checkStr( inputStr);
		
	}
	
	
	public static void  checkStr(String inputStr) {
			if (inputStr.length()==0 || inputStr=="0" ) {
				System.out.println(0);
			}
			if (isPalindrom(inputStr)) {
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
		}
	
	
	public static boolean isPalindrom(String str) {
		int start=0;
		int end= str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			++start;
			--end;
		}
		return true;
		
	}

}
