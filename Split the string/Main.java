import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main
{
	 public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = new String();
		str =  in.nextLine();
		Pattern ptr = Pattern.compile("(,| |and|or)");
		String[] parts = ptr.split(str);
		for(String p :  parts)
		{
			System.out.println(p);
		}
	}
}