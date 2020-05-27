import java.util.*;
import java.io.*;
public class Oddeven3n4
{
	public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int sum = a+b;
	    if (a%2 == 0)
	        System.out.println (a + " is EVEN");
	    else 
	        System.out.println (a + " is ODD");
	    if (b%2 == 0)
	        System.out.println (b + " is EVEN");
	    else 
	        System.out.println (b + " is ODD");
	    if (sum%2 == 0)
	        System.out.println (sum + " is EVEN");
	    else 
	        System.out.println (sum + " is ODD");
	        
	 
		
	}
}