import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
       for(int rownum = 1; rownum <= n; ++rownum){
    		    for(int space = 1; space <= (n- rownum ); ++space){
    		        System.out.print(" ");
		        }
            	for(int colnum = 1; colnum <=(2* rownum-1); ++ colnum){
    		        System.out.print("*");
    		    }  
            	System.out.print("\n");
		    }
	}
}