import java.util.*;
public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a = num;
		int tmp = 0;
		
		while(a > 0)
		{
			tmp = tmp * 10 + (a % 10);
			a = a / 10;
		}
		
		if(tmp == num)
			System.out.println("Num is Palindrome");
		else
			System.out.println("Num is not Palindrome");
	}

}
