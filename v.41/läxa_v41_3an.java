	import java.util.Scanner;
	public class l�xa_v41_3an {

		public static void main(String[] args) 
		{

			Scanner scan = new Scanner(System.in);
			char c;
			String str;
			System.out.println("skriv n�gra ord sedan en bokstav");
			str = scan.nextLine();
			c = scan.nextLine().charAt(0);

			System.out.println("bokstaven f�rekommer " + count(str, c) + " g�ng(er) i dina ord");
		} 

		public static int count(String str, char c) 
		{
		int counter = 0;
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == c)
				counter++;
		}
		 return counter;
		}
	}

	
