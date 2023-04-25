package com.tester;

import java.util.Scanner;

import com.cdac.geometry.Point2D;

public class TestPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of points u want to plot::");
		int size = sc.nextInt();
		Point2D[] p = new Point2D[size];
		
		
		int choice=0;
		int index=0;
		
		Point2D p1=null;
		
        System.out.println("1. accept x, y co-ordinates");
        System.out.println("2. Display x,y co-ordinates");
        System.out.println("3. select 2 indices");
        
        do
        {
        	System.out.println("enter choice::");
        	choice=sc.nextInt();
        	switch(choice)
        	{
        	case 1:
        		if(index<p.length)
        		{
        			System.out.println("enter x and y cordinates::");
        			p1=new Point2D(sc.nextDouble(),sc.nextDouble());
        			p[index]=p1;
        			index++;
        		}
        		else
        		{
        			System.out.println("array is full");
        		}
        		break;
        	case 2:
        		System.out.println("x & y co-ordinates::");
        		for(Point2D p2d: p)
        		{
        			if(p2d!=null)
        			{
        			System.out.println(p2d.show());
        			}
        		}
        		break;
        	case 3:
        	   System.out.println("enter index for 1 st cordinates");
        	   int c=sc.nextInt();
        	   System.out.println("enter index for 2 nd cordinates");
        	   int z=sc.nextInt();

        			if(p1.isEqual(p[c],p[z]))
        			{
        				System.out.println("points are equal");
        			}
        			else {
        				
        				double h=p1.calculateDistance(p[c],p[z]);
        				System.out.println(h);
        			}

        		break;
        	}
        }while(choice!=6);
        
	}

}
