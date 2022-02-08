package project;

import java.util.Scanner;

public class Database {
	char check=0;
	Scanner input= new Scanner(System.in);
	String name,sub;
	int usn;
	
	void info() {
System.out.println("Hello!");		
System.out.print("Please enter the last 3 digits of your USN: ");
usn = input.nextInt();
switch(usn)
{
case 001: name= "Abhay S Naik";break;
case 046: name= "Chandana A R";break;
case 113: name= "Madhulika Singh";break;
case 217: name= "Sumanth Manohar";break;
case 218: name= "Sumantha Bhatta MS";break;
case 219: name= "Suraj Mittal";break;
case 220: name= "Sushritha H S";break;
case 221: name= "Swagath Mishra";break;
case 222: name= "Swastik Shukla";break;
case 223: name= "Swetha L";break;
case 224: name= "T.Anusha";break;
case 225: name= "T Nikhil";break;
case 226: name= "Tanmay Jain";break;
case 227: name= "Tejas R";break;
case 228: name= "Tushar Pathak";break;
case 229: name= "V H Harshith";break;
case 230: name= "Varan Mehrothra";break;
case 231: name= "Varshitha V P";break;
case 232: name= "Varun A";break;
case 233: name= "Varun Gowda";break;
case 234: name= "Varun Kumar";break;
case 235: name= "Vedant Prasad";break;
case 236: name= "Vidhan Jain";break;
case 237: name= "Vidyanand SK";break;
case 238: name= "Vignesh M V";break;
case 239: name= "Vignesh Shetty";break;
case 240: name= "Vikash Kumar Singh";break;
case 241: name= "Vinanth U Aradhya";break;
case 242: name= "Vinay Kumar T M";break;
case 243: name= "Vinayak R Buradi";break;
case 244: name= "Vinod N";break;
case 245: name= "Vishal Ravi";break;
case 246: name= "Vishnu Shedole";break;
case 247: name= "";break;
case 248: name= "Yagnadeep";break;
case 249: name= "Yash Nagda";break;
case 250: name= "Yash Nandwana";break;
case 251: name= "Yash Shah";break;
case 252: name= "Yash Karwa";break;
case 253: name= "Yash ";break;
case 254: name= "Yash Triyar";break;
case 255: name= "Yathish";break;
case 256: name= "Yogith G";break;
case 257: name= "Zaed Rizwan";break;
 default: System.out.print("Please enter your name: ");
 		  String a = input.nextLine();
          name= input.nextLine();
          break;
}
System.out.println("USN:1DS20CS"+usn+", "+name);
System.out.print("Is that you?(y/n): ");
check= input.next().charAt(0);
if(check=='n'||check=='N') {
	System.out.println("Oops!,Begin Again.");
	System.exit(0);
}
String a = input.nextLine();
System.out.print("Enter Subject name: ");
sub= input.nextLine();

	}

}
