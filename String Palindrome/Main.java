import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      String str = new String();
      str = in.nextLine();
      String rev = new String("");
      int l = str.length();
      for( int i = l-1;i>=0;i--)
      {
        rev = rev + str.charAt(i);
        
      }
      if(str.equals(rev) == true)
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}