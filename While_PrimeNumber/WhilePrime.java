package Java.WhileDemo;

import java.util.Scanner;



public class WhilePrime {

	public static void main(String[] args) {
		
		int i=2;
	    int no;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number:");
			no=sc.nextInt();
		}
		boolean not_prime=false;
		
	
			while(i<no) {
		         if(no%i==0) {
		        	 //System.out.println("NOT PRIME");
		        	 not_prime=true;
		        	 
		        	 break;
		        	 
		         }
		         i=i+1;
		         
			}
		         if(not_prime==true){
		        	 System.out.println("NOT PRIME");
		        	 
		         }
		         else{
		        	 System.out.println("PRIME");
		        	 
		         }
		         
		 
		         
		         
		        
		}
		

	}
