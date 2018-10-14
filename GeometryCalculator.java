import java.util.Scanner;

public class GeometryCalculator 
{

	public static void main(String[] args) 
	{
		//Welcome to the calculator
		
		Scanner bread= new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name= bread.nextLine();
		
		System.out.println("\n\nHello, "+name+", welcome to the geometry calculator");
		
		System.out.println("Press enter to continue...");
		bread.nextLine();
		
		//Get dimensions and convert to doubles
		
		System.out.println("Area of a Triangle");
		
		System.out.print("Please enter the measure of the base: ");
		String baseStr= bread.nextLine();
		
		System.out.print("\nPlease enter the measure of the height: ");
		String heightStr= bread.nextLine();
		
		double base= Double.parseDouble(baseStr);
		
		double height= Double.parseDouble(heightStr);
		
		System.out.print("Please enter the unit of measure: ");
		String unit= bread.nextLine();
		
		double area = .5*(base*height);
		
		System.out.println("The area of the triangle is "+ area + ""+ unit + "^2");
		
		System.out.println("Press enter to continue...");
		bread.nextLine();
		
		System.out.println("Volume of a rectangular prism");
		
		System.out.println("Please enter the measure of the length: ");
		String lengthStr= bread.nextLine();
		
		System.out.println("Please enter the measure of the width: ");
		String widthStr= bread.nextLine();
		
		System.out.println("Please enter the measure of the height: ");
		String heightstr= bread.nextLine();
		
		double length= Double.parseDouble(lengthStr);
		
		double width= Double.parseDouble(widthStr);
		
		double height2= Double.parseDouble(heightstr);
		
		System.out.println("Please enter the unit of measure: ");
		String unit2= bread.nextLine();
		
		double volume= length*width*height2;
		
		System.out.println("The volume of the rectangular prism is "+ volume + ""+ unit2 + "^3.");
		
	}

}
