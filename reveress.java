import java.util.*;
public class reveress {
    public static void reverese(String str)
	{
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
      System.out.println("Reverse is :" +rev);
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        reverese(str);
	}
}
