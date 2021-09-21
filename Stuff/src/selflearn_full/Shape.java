package selflearn_full;

abstract class Shape {
	String color;
	abstract double area();
	public abstract String totell();
	public String getColor() {
		return color;
	}
	public Shape(String color) {
		System.out.println("Shape class constructor called");
		this.color = color;
	}
	

}
