import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner in = new Scanner(System.in);
      String str = new String();
      str = in.nextLine();
      String re = new String();
       re = in.nextLine();
       String inc = new String();
      inc = in.nextLine();
      System.out.println(str.replace(re,inc));
    }
}