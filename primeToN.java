import java.util.*;
public class primeToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		primeToN obj = new primeToN();
		
		obj.primes(n);		
	}
	
	void primes(int n) {
		int i = 1;
		int count = 0;
		
		while(i <= n)
		{
			count = 0;
			for(int j = 1; j <= i/2; j++)
			{
				if(i % j == 0)
					count++;
			}
			if(count <= 2)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
