package com.LambdaExpressions;

@FunctionalInterface
public interface OrderPredicate 
{
	boolean test(Order t);
	
}