package com.LambdaExpressions;

public class StringList
{
	String s;

	@Override
	public String toString() {
		return "" + s ;
	}

	public StringList(String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}