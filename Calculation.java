package project;

public class Calculation extends Marks {
	double total;
	void cal() {
		double m1,m2,m3;
		m1= cie1/5;
		m2= cie2/5;
		m3= cie3/5;
		total =m1+m2+m3+aat+quiz;
		if(total>=20)
			System.out.println("'You are Eligible to take up SEE'");
		else {
			System.out.println("Not Eligible to take up SEE");
			 System.out.print("Please contact your "+sub+" faculty!");
		}
		    
		if(total>=45)
			System.out.println("'You are Eligible to take up MakeUp'");
		else 
			System.out.println("'Not Eligible to take up MakeUp'");
		   
			
	}


}
