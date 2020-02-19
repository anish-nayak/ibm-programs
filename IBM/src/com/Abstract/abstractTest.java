package com.Abstract;

abstract class Shape
{
	abstract void draw();
}

class Line extends Shape
{
	public void draw()
	{
		System.out.println("line is drawn");
	}
}

class Rectangle extends Line
{
	public void draw()
	{
		System.out.println("Rectangle is drawn");
	}
}

class Cube extends Rectangle
{
	public void draw()
	{
		System.out.println("Cube is drawn");

	}
}

public class abstractTest
{
	public static void main(String a[])
	{
		Shape obj[]=new Shape[3];
		obj[0]=new Line();
		obj[1]=new Rectangle();
		obj[2]=new Cube();
	
		obj[0].draw();
		obj[1].draw();
		obj[2].draw();
	}
}