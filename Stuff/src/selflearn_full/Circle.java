package selflearn_full;

public class Circle extends Shape {
	double radius;
	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle class constructor called");
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}
	@Override
	public String totell() {
		// TODO Auto-generated method stub
		return "Circle color is "+super.getColor()+" and area is "+area();
	}

}
