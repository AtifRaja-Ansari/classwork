package class_work;


//Write a Java Program to Search a Particular Word in a String.(without any method)package class_work;

import java.util.Scanner;

public class Search_a_word_in_String {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s1="hello world";
		String arr[]=s1.split(" ");
		System.out.print("Enter a word you want to search= ");
		String s2=sc.next();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=s1.length();j++) {
			if(arr[i].charAt(j)==s1.charAt(j))	{
				System.out.print("Found");
			}
			else {
				System.out.print("not Found");
			}break;
			}	
		}
		
	}

}
