import java.util.Scanner;
class Main{
   public static void prime( int a)
   {
     int count;
     int i;
     for(i=2 ; i<=a;i++)
       
     {
       count=0;
       for(int j =1 ; j<=i;j++)
       {
         if(i%j == 0)
           count++;
       }
       if(count==2)
         System.out.println(i);
     }
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      prime(n);
	}
}