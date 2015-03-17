package by.epam.main;

import java.util.Scanner;

import by.epam.execution.Execution;

public class Main {

	public static int arg1,arg2;
	public static char operation = 0;
	
	
	public static void main(String[] args) {
		boolean nextStep = true; 
	
	do {
		Scanner in  = new Scanner (System.in);
		Execution calculator = new Execution ();
		System.out.println ("Enter first number =  ");
		arg1 = (int) in.nextDouble();
		
		System.out.println("Choose the operation");
		System.out.print("1 - Summa '+'\t");  
		System.out.print("2 - Minus '-'\t");
		System.out.print("3 - Multiply '*'\t");
		System.out.print("4 - Division '/'");
		System.out.println();
		int operation = in.nextInt();
        
		System.out.println ("Enter second number =  ");
		arg2 = (int) in.nextDouble();
	
		if (operation != 0) 
			System.out.println ("Result = "+calculator.oprExecution(arg1, operation, arg2));
		else 
			System.out.println("Unwarranted operation");
		
        System.out.println("Do you want to continue?");
        System.out.print("1 - Continue\t");
        System.out.println("2 - Exit");
        int whatDo = in.nextInt();
        if (whatDo == 2) nextStep = false;
	}
	while (nextStep);
	} 
}
