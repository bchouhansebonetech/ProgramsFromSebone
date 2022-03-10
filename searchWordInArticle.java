import java.util.*;
public class searchWordInArticle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Article:");
		String article = sc.nextLine();
		
		System.out.println("Enter the World:");
		String word = sc.nextLine();
		
		String tmp = "";
		
		for(int i = 0; i < article.length(); i++)
		{
			if(article.charAt(i) != ' ')
				tmp = tmp + article.charAt(i);
			else
			{
				if(word.equals(tmp))
					count++;
				tmp = "";
			}	
		}
		
		if(word.equals(tmp))
			count++;
		
		System.out.println(word + " Accured " + count + " Times");
		
	}

}
