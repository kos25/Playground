import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[]= new int[arr_size];
  
      for(int i=0; i<arr_size; i++)
      {
        arr[i]= in.nextInt();
      }
          int lg=arr[0];
       for(int i=1; i<arr_size; i++)
       {
         if(arr[i]>lg)
           lg= arr[i];
       }
      System.out.println(lg);
    }
}