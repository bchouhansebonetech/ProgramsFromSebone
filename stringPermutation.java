import java.util.*;
public class stringPermutation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str1 = sc.nextLine();
		stringPermutation obj = new stringPermutation();
		
		obj.getPermutation(str1, "");
	}
	
	void getPermutation(String str, String per) {
		if(str.length() == 0) {
			System.out.println(per);
			return;			
		}
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			String newStr = str.substring(0, i) + str.substring(i + 1);
			
			getPermutation(newStr, per + ch);
		}
	}
};
