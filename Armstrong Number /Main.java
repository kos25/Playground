import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result =0;
       int count =0;
        int reminder , orignal_number , o2;
         orignal_number =o2 = n;
       while( o2 > 0)
       { 
         o2 = o2/10;
         count++;
       }
    while ( n !=0)
    { 
      reminder = n%10;
      result+= Math.pow(reminder , count);
      n = n /10;
      }
       if ( result == orignal_number)
         System.out.println("Armstrong Number");
      else 
          System.out.println("Not a Armstrong Number");
      
	}
}