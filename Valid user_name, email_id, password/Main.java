import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main
{ 
	private static Pattern userNamePtrn = Pattern.compile("^[a-zA-Z0-9_-]*$");
	public static boolean validateUserName(String userName)
	{
		Matcher match =  userNamePtrn.matcher(userName);
		if(match.matches()) {
			return true ; 
		}
		return false ; 
	}
	private static Pattern emailNamePtrn = Pattern.compile("^[a-z0-9._@]*$");
	
	public static  boolean validateEmailAddress(String userName )
	{
		Matcher match =  emailNamePtrn.matcher(userName);
		if(match.matches()) {
			return true ; 
		}
		return false ; 
	}
	private static  Pattern pswNamePtrn  = Pattern.compile("^[a-zA-Z@#$%0-9]*$");
	public static boolean validatePassword(String userName )
	{
		Matcher match =  pswNamePtrn.matcher(userName);
		if(match.matches()) {
			return true ; 
		}
		return false ; 
	}
    // type your code here
  public static void main(String a[]){
	  {
		  Scanner in = new Scanner(System.in);
		  String user_name = new String();
		  user_name = in.nextLine();
		  String email_id = new String();
		  email_id = in.nextLine();
		  String password = new String();
		  password  = in.nextLine();
		   System.out.println("Is "+ user_name+" a valid user name? " +validateUserName(user_name));
	       System.out.println("Is " +email_id+ " a valid email address? "+validateEmailAddress(email_id));
	       System.out.println("Is " +password +" a valid password? " +validatePassword(password));
    }
	  
  }}