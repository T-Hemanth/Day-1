import java.util.*;
import java.io.*;
public class Posneg1
{
	public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);
	    int n = in.nextInt();
	    if (n<0)
	        System.out.println (n + "Is Negative");
	    if (n>0)
	        System.out.println (n + "Is Positive");
	    if (n == 0)
	        System.out.println (n + "Is zero");
	 
		
	}
}
