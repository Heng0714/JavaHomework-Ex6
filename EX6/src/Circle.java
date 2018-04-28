
public class Circle {
	private int radius;
		
	Circle (int radius){
		this.radius=radius;
		}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int computeArea() {
		
		return (int)Math.PI*radius*radius;
	}

	
	public int computeCircumference() {
		
		return (int)(2*radius*Math.PI);
	}
	
	public static void main(String[] args) {
		Circle fo = new Circle(8);
		
		System.out.println(fo.computeArea());
		System.out.println(fo.computeCircumference());

	}

}
