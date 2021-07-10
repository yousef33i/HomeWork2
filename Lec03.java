import java.util.Scanner;
public class Lec03 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
	System.out.print("Enter your grade: ");
	
	double grade; 
	
	    if(!reader.hasNextDouble()) 
		System.out.print("Erorr: you entered non your number! ");
	    
	else {
		
		grade = reader.nextDouble();
		
		    if(grade > 100 || grade < 0) 
			System.out.print("Erorr: you entered a worng number! "); 
			
			else if(grade >= 90) 
			System.out.print("a");
			
		    else if(grade >= 80) 
			System.out.print("B");
			
		    else if(grade >= 70) 
		    System.out.print("C");
		    
		    else if(grade >= 60) 
		    System.out.print("D");
		    
		    else 
		    System.out.print("F");
		  
	}
	
		}
	}
	

