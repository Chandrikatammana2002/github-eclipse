package shape;

public class Square extends Shape {

	@Override
	public void area() {
		System.out.println("square area");
	
	}
	public static void main(String args[]) {
		Shape s=new Square();
		s.area();
	}

}
