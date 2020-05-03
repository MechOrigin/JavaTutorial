package Proper;

import java.util.Scanner;

public class StringReverse {

		@SuppressWarnings({ "static-access", "resource" })
		public static void main(String[] arg) {
		StringReverse rev=new StringReverse();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String  str=sc.nextLine();	
		System.out.println("Your reversed string is: "+rev.reverse(str));
		}
	static String reverse(String s)
		{
		String rev="";
		for(int j=s.length();j>0;--j)
		{
		rev=rev+(s.charAt(j-1)); 
		}
		return rev;
		}
}
