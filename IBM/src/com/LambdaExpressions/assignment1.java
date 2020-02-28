package com.LambdaExpressions;

interface Operator
{
	int operateOnIt(int a, int b);
}

public class assignment1 {

	public static void main(String[] args)
	{
		Operator opr=(a,b)->a+b;
		System.out.println("Addition 3+4 : "+opr.operateOnIt(3, 4));
		
		opr=(a,b)->a-b;
		System.out.println("Subtraction 3-4 : "+opr.operateOnIt(3, 4));

		opr=(a,b)->a*b;
		System.out.println("Multiplication 3*4 : "+opr.operateOnIt(3, 4));

		opr=(a,b)->a/b;
		System.out.println("Division 3/4 : "+opr.operateOnIt(3, 4));
	
		
	}

}
