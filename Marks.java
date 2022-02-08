package project;

import java.util.Scanner;

public class Marks extends Database {
	Scanner input= new Scanner(System.in);
	int cie1, cie2, cie3,aat, quiz;
	
	void getmarks() {
		System.out.println("Dear "+name+",");
	System.out.print("Have you attended CIE 1?(y/n): ");
	check= input.next().charAt(0);
	if(check=='y'||check=='Y')
	{
		System.out.print("Enter CIE 1 marks: ");
		cie1= input.nextInt();
	}
	else
		cie1 =0;
	
	System.out.print("Have you attended CIE 2?(y/n): ");
	check= input.next().charAt(0);
	if(check=='y'||check=='Y')
	{
		System.out.print("Enter CIE 2 marks: ");
		cie2= input.nextInt();
	}
	else
		cie2 =0;

	System.out.print("Have you attended CIE 3?(y/n): ");
	check= input.next().charAt(0);
	if(check=='y'||check=='Y')
	{
		System.out.print("Enter CIE 3 marks: ");
		cie3= input.nextInt();
	}
	else
		cie3 =0;
	
	System.out.print("Have you attended AAT?(y/n): ");
	check= input.next().charAt(0);
	if(check=='y'||check=='Y')
	{
		System.out.print("Enter AAT marks: ");
		aat= input.nextInt();
	}
	else
		aat =0;
	
	System.out.print("Have you attended Quiz?(y/n): ");
	check= input.next().charAt(0);
	if(check=='y'||check=='Y')
	{
		System.out.print("Enter Quiz marks: ");
		quiz= input.nextInt();
	}
	else
		quiz =0;
	
	
	}	
	

}
