import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String str = new String();
    str = in.nextLine();
    String temp = new String();
    temp = in.nextLine();
    int  l1= str.length();
     int l2 = temp.length();
    int count=0;
    for( int i =0;i<l1-l2+1;i++)
    {
      boolean is = true ;
      for( int j=0;j<l2;j++)
      {
        if(str.charAt(i+j)!=temp.charAt(j))
           is = false;
      }
           if(is == true)
           count++;
    }
           System.out.println(count);
  } 
}