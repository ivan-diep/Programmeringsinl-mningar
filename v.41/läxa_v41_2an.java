    import java.util.Scanner;
	public class l�xa_v41_2an {

		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			String bakl�nges;
			bakl�nges = reverse(scan.nextLine());
			System.out.println(bakl�nges);
		}
		public static String reverse(String str)
		{
			String r = "";
			for (int i=str.length()-1; i>=0; i--)
				r = r + str.charAt(i);
			return r;
		}
	}
	
	

