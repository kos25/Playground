import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main
{
	 public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String  PatternString = new String();
		PatternString =  in.nextLine();
		String  text  = new String();
		text =  in.nextLine();
		Pattern pattern = Pattern.compile(PatternString);
	    
		Matcher matcher = pattern.matcher(text);
		int count = 0;
		while(matcher.find())
		{
			count++;
			System.out.println("found: " + count + " : "+ matcher.start() + " - " + matcher.end());
		}
		if(count == 0)
	           System.out.println("The given word is not present in the string");
	           else
	           System.out.println(count);
	}
}