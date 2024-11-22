package gsv.lab7;
//Question1

import java.util.Scanner;

public class Interest {
 
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Input the Principal Amount: ");
		int principal=scan.nextInt();
		System.out.println("Input the Rate of interest: ");
		double interest= scan.nextDouble();
		System.out.println("Input the time period in months: ");
		int time=scan.nextInt();
		
		double timeConvert= time/12;
		double result=principal*interest*timeConvert;
		
		System.out.println("Your Total Interest is: "+result);
		
		
	}
}
