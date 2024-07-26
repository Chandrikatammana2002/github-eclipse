package shape;

public class Circle extends Shape{
	@Override
	public void area() {
		System.out.println("Circle area");
		
	}
	public static void main(String args[]) {
		Shape c=new Circle();
		c.area();
		c.shape();
	}


}
