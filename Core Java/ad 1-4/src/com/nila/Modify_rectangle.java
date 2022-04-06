package com.nila;
import java.util.Scanner;
public class Modify_rectangle {
	int length; 
    int width; 
    int area; 
    int perimeter;
    
    public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
    public void Modify_rectangle()
    {
    	length = 1;
    	width= 1;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter width of rectangle: ");
        width = in.nextInt();
    }
    
    void  areaRectangle()
    {
        area = length * width;
       
    }
 
     void  perimeterRectangle()
    {
    	 perimeter = 2*(length + width);
       
    }

    void display() {
    	if(length>0 && length<20)
        {
        System.out.println("Area of Rectangle = " + area);
        System.out.println("Perimeter of Rectangle = " +perimeter);}
       
        }

    public static void main(String args[]) {
    	
    	Modify_rectangle obj1 = new Modify_rectangle();
        obj1.input();
        obj1.areaRectangle();
        obj1.perimeterRectangle();
        obj1.display();
        System.out.println("****************************");
        Modify_rectangle obj2 = new Modify_rectangle();
        obj2.input();
        obj2.areaRectangle();
        obj2.perimeterRectangle();
        obj2.display();
        System.out.println("****************************");
        Modify_rectangle obj3 = new Modify_rectangle();
        obj3.input();
        obj3.areaRectangle();
        obj3.perimeterRectangle();
        obj3.display();
        System.out.println("****************************");
        Modify_rectangle obj4 = new Modify_rectangle();
        obj4.input();
        obj4.areaRectangle();
        obj4.perimeterRectangle();
        obj4.display();
        System.out.println("****************************");
        Modify_rectangle obj5 = new Modify_rectangle();
        obj5.input();
        obj5.areaRectangle();
        obj5.perimeterRectangle();
        obj5.display();
    	
    }
}

