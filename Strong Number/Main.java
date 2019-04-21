import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
    
      int orignal_number= n;
      int  result = 0 ;
      int reminder;
      while (n>0)
      {
         int fact=1;
        reminder = n %10 ;
        for ( int i = 1; i <= reminder ; i++)
        {
          fact = fact*i;
        }
        result = result + fact ;
        n = n/10;
      }
      if ( result == orignal_number)
        System.out.println("Yes");
      else 
         System.out.println("No");
        
	}
}