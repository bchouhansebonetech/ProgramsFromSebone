import java.util.*;
public class searchWordInArticle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Article:");
		String article = sc.nextLine();
		
		System.out.println("Enter the World:");
		String word = sc.nextLine();
		
		searchWordInArticle obj = new searchWordInArticle();
		
		System.out.println(word + " Accured " + obj.wordInArticle(article, word) + " Times");		
	}
	
	int wordInArticle(String article, String word) {
		String tmp = "";
		int count = 0;
		
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
		
		return count;
	}

}
