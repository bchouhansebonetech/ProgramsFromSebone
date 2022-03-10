import java.util.Scanner;
import java.util.*;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String:");	
		String str1 = sc.nextLine();
		
		System.out.println("Enter the second String:");
		String str2 = sc.nextLine();
		
		
		System.out.println(isAnagram(str1, str2));		
	}
	
	public static boolean isAnagram(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		
		int[] arr = new int[256];
		
		for(int i = 0; i < str1.length(); i++)
			arr[str1.charAt(i)]++;
		
		for(int i = 0; i < str2.length(); i++)
			arr[str2.charAt(i)]--;
		
		for(int i = 0; i < 256; i++)
			if(arr[i] != 0)
				return false;
		
		return true;		
	}

}
