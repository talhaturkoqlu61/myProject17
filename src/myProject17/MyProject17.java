package myProject17;
import java.util.Scanner;

public class MyProject17 {
	public static void main(String[]args) {
		int border,total=0,counter=0;
		double average;
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to program which calculates average of numbers that can be exactly divided by 3 and 4");
		System.out.print("Please enter a number to specify range:");
		border=input.nextInt();
		for(int i=0;i<=border;i++) {
			if(i%3==0&&i%4==0) {
				total+=i;
				counter++;
				
				
			}
			
		}
		average=total/(counter-1);
		System.out.println("average:"+average);
		
		
		
	}

}
