package Vardaan_Assignment;
import java.util.*;
public class Assignment_Main {
	 
	                        // Function to checkPalindrome :
	 void checkPalindrome()
	 {

			System.out.println("  ---->Enter a number to check palindrome ?:");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int rev=0,rem;
			int temprory=n;
			while(temprory!=0)
			{
				rem=temprory%10;
				rev=rev*10+rem;
				temprory/=10;
			}
			if(rev==n)
				System.out.println("-->"+n+"\nNumber entered is Palindrome :"+
			"\n                    ----------\n");
			else
				System.out.println("-->"+n+ "\nNumber entered is not Palindrome :"+
			"\n                    ----------\n");
	 }
	                       //Function to print Pattern of stars :
	 void printPattern()
	 {
			System.out.println("  ---->Enter a number upto u want star is printed?:");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			for(int i=1;i<=n;++i)
			{
			for(int j=i;j<=n;++j)
			System.out.print("*");
			System.out.println();
		    }
			 System.out.println(" \n                      ------------\n");
	 } 
	                       // Function to check Prime Number :
	 void checkPrimeNumber()
	 {     
		    System.out.println("  ---->Enter a Natural number to check Prime or not ?:");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			if(n==1)
				System.out.println("-->"+n+"\n 1 is not a Prime Number nor Composite :");
		int count=0;
		
				for(int i=2;i<=n;++i)
			             {
				if(n%i==0)
				count++;
			             }
			
			     if(count==1)                  
			     System.out.println("-->"+n+"\n Yes - Entered number is a Prime Number :");
				 else
			     System.out.println("-->"+n+"\n  Entered number is Not a Prime Number :");
			     // System.out.println(count);
			     System.out.println(" \n                     -----------\n");
	 }
	 
	                       //Function to Print Fibonacci Series :
	 void printFibonacciSeries()
	 {
		 System.out.println("  ---->Enter a number upto fibonacci series printed ?:");
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
		int first=0,sec=1;
		int sum=0;
		for(int i=1;i<=n;++i)
		{
			if(i==1) {
				System.out.println("Fibonacci Series upto "+n+" Number is :");
				System.out.print(first);
			    continue;
			         }
			if(i==2)
			{
				System.out.print(","+sec);
				continue;
			}
			sum=first+sec;
			first=sec;
			sec=sum;
			System.out.print(","+sum);
		}
		
		System.out.println("\n             -------------\n");
	 }
	
	 public static void main(String[] args)
	 {
		 Assignment_Main obj=new Assignment_Main();
		 int choice;
		 Scanner sc=new Scanner(System.in);
		 do
		 {
			 System.out.println("Enter your choice from below list .\n \n"
					 +"           1. Find Palindrome of Number :\n"
					 +"           2. To print Pattern for a given number:\n"
					 +"           3. Check whether a number is prime number:\n"
					 +"           4. To Print Fibonacci Series upto given number:\n\n"
					 +"      0. Enter 0 to Exit the program :\n");
			 
			
			 choice=sc.nextInt();
			 
			        switch(choice) {
			        case 0: break;
			        case 1: obj.checkPalindrome();
			                break;
			        case 2: obj.printPattern(); 
			                break;
			        case 3: obj.checkPrimeNumber();
			                break;
			        case 4: obj.printFibonacciSeries();
			                break;
			           
			        default :System.out.println("\n \n      Invalid choice Entered :\n ");
			                break;
			       }
			          }  while(choice!=0); 
		 
		  System.out.println("Programm Exited Succesfully ~");
		 
	 sc.close();
		  
	    }
	                           }

	 
	 
