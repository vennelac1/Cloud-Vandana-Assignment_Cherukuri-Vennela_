package com.java.codes;
import java.util.Scanner;
import java.util.HashSet;

public class Panagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String st = sc.nextLine();
		String s=st.toLowerCase();
		char[] strArr=s.toCharArray();
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<=strArr.length-1;i++)
		{
			if(strArr[i]>='a' && strArr[i]<='z' )
			{
				hs.add(strArr[i]);
			}
		}
		System.out.println(hs);
		if(hs.size()==26)
		{
			System.out.println(st + " is a Panagram");
		}
		else
		{
			System.out.println(st + " is not a Panagram");
		}
		sc.close();


	}

}
