package selflearn_full;

public class Rectangle extends Shape {
	double length;
	double width;
	public Rectangle(String color,double length,double width) {
		super(color);
		System.out.println("Rectangle CLass constructor called");
		// TODO Auto-generated constructor stub
		this.length=length;
		this.width=width;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*width;
	}
	@Override
	public String totell() {
		// TODO Auto-generated method stub
		return "Rectangle color is "+super.getColor()+" and area is "+area();
	}
}
