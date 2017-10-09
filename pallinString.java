package assignment;

import java.util.Scanner;

public class pallinString {
	public static void main(String as[])
	{
		Scanner scr=new Scanner(System.in);
		String a=scr.next();
		int last=a.length()-1;
		int first=0;
		while(last!=first){
		if((a.charAt(first)!=a.charAt(last)))
		{
			System.out.println("not a pallindrome");
		return;
		}
				last--;first++;
	}
		System.out.println("is a pallindrome");

}
}
